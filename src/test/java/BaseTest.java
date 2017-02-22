import com.codeborne.selenide.Configuration;
import core.ConfigTests;
import org.junit.After;
import org.junit.BeforeClass;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.close;

public class BaseTest {

    public static ConfigTests configTests;

    @BeforeClass
    public static void initializeConfig() throws IOException {
        configTests = new ConfigTests();
        configTests.loadProperties();
        Configuration.fastSetValue = true;
        Configuration.timeout = 10000;
    }

    @After
    public void closeDriver() {
        close();
    }

}
