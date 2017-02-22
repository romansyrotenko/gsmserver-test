package core;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigTests {

    public static String BASE_URL;

    public void loadProperties() throws IOException {
        Properties properties = new Properties();
        File resourcesDirectory = new File("src/main/resources/config.properties");
        File file = new File(resourcesDirectory.getAbsolutePath());
        properties.load(new FileReader(file));

        this.BASE_URL = properties.getProperty("BASE_URL");
    }
}
