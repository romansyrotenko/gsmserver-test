package pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;
import static core.ConfigTests.BASE_URL;

public class MainPage {

    public void open() {
        Selenide.open(BASE_URL);
    }

    public void firstProductClick() {
        $$(By.cssSelector(".carousel-items li a")).get(0).click();
    }
}
