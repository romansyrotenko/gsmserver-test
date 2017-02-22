package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static core.ConfigTests.BASE_URL;

public class Cart {
    public void open() {
        Selenide.open(BASE_URL + "/cart/");
    }

    public void checkoutWithoutRegistration() {
        buttonClick("Proceed to Checkout");
        buttonClick("Buy without registration");
        buttonClick("Next step");
        fillContactCorm();
        buttonClick("Next step");
        selectItem(1);
        buttonClick("Next step");
        buttonClick("Next step");
        selectItem(1);
        buttonClick("Next");
        buttonClick("Submit order");
    }

    private void buttonClick(String text) {
        $(By.linkText(text)).shouldBe(Condition.enabled).click();
    }

    private void selectItem(int index) {
        $$(By.cssSelector(".styled-checkbox")).get(index).click();
    }

    private void fillContactCorm() {
        $(By.name("address[firstName]")).val("testRoman");
        $(By.name("address[lastName]")).val("testSR");
        $(By.name("address[middleName]")).val("testVladimirovish");
        $(By.name("address[email]")).val("test@test.com");
        $(By.name("address[address]")).val("testZhukovskogo ave 5");
        $(By.cssSelector(".styled-phone-edit .hide-outline")).val("111111111");
        $(By.name("address[zip]")).val("61070");
        selectDropDown("state_id_chosen", "Harkovskaya oblast");
        selectDropDown("city_id_chosen", "Izyum");
    }

    private void selectDropDown(String cssSelector, String value) {
        $(By.id(cssSelector)).click();
        $(By.cssSelector(".chosen-container-active .chosen-drop .chosen-search input")).sendKeys(value + Keys.ENTER);
    }

    public void shoudBeSuccess() {
        $(By.cssSelector(".inline-block")).shouldHave(Condition.text("Order details"));
    }
}
