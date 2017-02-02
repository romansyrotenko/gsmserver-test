package pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;
import static core.ConfigTests.BASE_URL;
import static core.ConfigTests.PRODUCT_PAGE_URL;

public class Product {

    public void open() {
        Selenide.open(BASE_URL + PRODUCT_PAGE_URL);
    }

    public void addToCart() {
        $(By.cssSelector(".product-page-right .product-button")).click();
    }

    public void shouldBeAdded() {
        $(By.cssSelector(".cart-indicator .cart-icon")).shouldHave(attribute("data-cart-quantity", "1"));

  //      assertEquals(1, parseInt($(By.cssSelector(".cart-indicator .cart-icon")).getAttribute("data-cart-quantity")));
    }
}
