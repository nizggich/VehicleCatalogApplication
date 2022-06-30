package ru.nizggich.VehicleCatalogApplication.utils;


import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Component
public class MessageUtils {
    private static Properties properties = null;
    public static String getMessage(String code) throws RuntimeException{
        if (properties == null) {
            try (InputStream input = new FileInputStream("src/main/resources/messages.properties")) {
                properties = new Properties();
                properties.load(input);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        String property = properties.getProperty(code);
        if (property == null) {
            throw new RuntimeException("Message " +  "'" + code + "'" + " does not exist");
        }
        return property;
    }
}
