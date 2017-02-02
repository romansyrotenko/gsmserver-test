package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.$;
import static core.ConfigTests.*;

public class Cart {
    public void open() {
        Selenide.open(BASE_URL + CART_PAGE_URL);
    }

    public void checkoutWithoutRegistration() {
        $(By.id("goto-checkout")).click();
        $(By.linkText("Buy without registration")).click();
        nextStepButtonClick();
        fillContactCorm();
        nextStepButtonClick();

    }

    private void fillContactCorm() {
        $(By.name("address[firstName]")).val(FIRST_NAME);
        $(By.name("address[lastName]")).val(LAST_NAME);
        $(By.name("address[middleName]")).val(MIDDLE_NAME);
        $(By.name("address[email]")).val(EMAIL);
        $(By.name("address[address]")).val(ADRESS);
        $(By.cssSelector(".styled-phone-edit .hide-outline")).val(CONTACT_PHONE);


      //  $(By.cssSelector(".chosen-container-active")).click();
//        $(By.id("state_id_chosen")).click();
//        $(By.cssSelector(".chosen-container-active")).val(REGION).sendKeys(Keys.ENTER);
//        SelenideElement select = $(By.id("state_id"));
//        select.selectOptionByValue(REGION);

 //       $(By.id("state_id_chosen")).find(By.cssSelector(".select-shade")).click();
 //       $(By.id("state_id_chosen")).find(By.cssSelector(".select-shade")).selectOption(REGION);
 //       $(By.id("state_id_chosen")).find(By.cssSelector(".select-shade")).selectOptionByValue(REGION);


//        $(By.id("city_id_chosen")).find(By.cssSelector(".select-shade")).selectOptionByValue(CITY);

 //       $(By.id("state_id_chosen")).find(By.tagName("em")).val(REGION);
//        $(By.id("state_id_chosen")).val(REGION);
//        $(By.id("city_id_chosen")).find(By.cssSelector(".select-shade")).val(CITY);

 //       selectItem($(By.id("state_id")), REGION);
//        selectItem($(By.id("city_id_chosen")).findElementByCssSelector(".select-shade"),CITY);

    }

    private void nextStepButtonClick() {
        $(By.linkText("Next step")).shouldBe(Condition.present).click();
    }

    public void selectItem(WebElement elem, String value) {
        WebElement Selectbox_roles = elem;
        Select select1 = new Select(Selectbox_roles);
        select1.selectByVisibleText(value);
    }
}
