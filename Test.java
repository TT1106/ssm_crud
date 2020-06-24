import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Test {//F:\newTeach\Stage3\workspace\Spring\MyBaits逆向工程\src\com\gec
    public static void main(String[] args) throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
        List<String> warnings = new ArrayList<String>();//\src\com\com.gec
        boolean overwrite = true;//E:\\1shortcut\\Stage3\\Spring\\MyBaits逆向工程\\src\\com\\com.gec\\mybatis.xml
        File configFile = new File("F:\\newTeach\\Stage3\\workspace\\Spring\\MyBaits逆向工程\\src\\com\\gec\\generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);

        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
        System.out.println("执行成功");

    }
}