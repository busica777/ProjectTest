package utils;

import java.util.Properties;

public class ConfigReader {
    static Properties prop;

    public static String getPropertyValue (String key){
        return prop.getProperty(key);
    }
}
