package core;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigTests {

    public static String BASE_URL;
    public static String CART_PAGE_URL;
    public static String PRODUCT_PAGE_URL;
    public static String FIRST_NAME;
    public static String LAST_NAME;
    public static String MIDDLE_NAME;
    public static String REGION;
    public static String CITY;
    public static String EMAIL;
    public static String ADRESS;
    public static String CONTACT_PHONE;

    public void loadProperties() throws IOException {
        Properties properties = new Properties();
        File resourcesDirectory = new File("src/main/resources/config.properties");
        File file = new File(resourcesDirectory.getAbsolutePath());
        properties.load(new FileReader(file));

        this.BASE_URL = properties.getProperty("BASE_URL");
        this.CART_PAGE_URL = properties.getProperty("CART_PAGE_URL");
        this.PRODUCT_PAGE_URL = properties.getProperty("PRODUCT_PAGE_URL");
        this.FIRST_NAME = properties.getProperty("FIRST_NAME");
        this.LAST_NAME = properties.getProperty("LAST_NAME");
        this.MIDDLE_NAME = properties.getProperty("MIDDLE_NAME");
        this.REGION = properties.getProperty("REGION");
        this.CITY = properties.getProperty("CITY");
        this.EMAIL = properties.getProperty("EMAIL");
        this.ADRESS = properties.getProperty("ADRESS");
        this.CONTACT_PHONE = properties.getProperty("CONTACT_PHONE");
    }
}
