package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;

public class Product {

    public void addToCart() {
        $(By.cssSelector(".product-page-right .product-button")).click();
    }

    public void shouldBeAdded() {
        $(By.cssSelector(".cart-indicator .cart-icon")).shouldHave(attribute("data-cart-quantity", "1"));
    }
}
