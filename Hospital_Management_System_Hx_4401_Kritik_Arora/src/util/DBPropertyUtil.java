package util;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

public class DBPropertyUtil {
    public static String getConnectionString(String fileName) {
        Properties properties = new Properties();
        try (InputStream input = DBPropertyUtil.class.getClassLoader().getResourceAsStream(fileName)) {
            if (input == null) {
                System.out.println("Sorry, unable to find " + fileName);
                return null;
            }
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "jdbc:mysql://" + properties.getProperty("hostname") + ":" + properties.getProperty("port")
        + "/" + properties.getProperty("dbname") + "?user=" + properties.getProperty("username") + "&password=Kritik@123";


    }
}
