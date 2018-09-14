package website.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

    public static String getReportConfigPath() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream(new File("src/test/java/website/Configuration.properties")));
        String reportConfigPath = properties.getProperty("reportConfigPath");
        if(reportConfigPath!= null) return reportConfigPath;
        else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
    }
}
