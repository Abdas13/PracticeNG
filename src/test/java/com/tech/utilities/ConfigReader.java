package com.tech.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    static {
        String path="config.properties";

        try {
            FileInputStream fileInputStream=new FileInputStream(path);
            properties=new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String key){

        String value=properties.getProperty(key);
        return value;
    }
}