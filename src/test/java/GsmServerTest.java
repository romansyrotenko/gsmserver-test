import org.junit.Test;
import pages.Cart;
import pages.MainPage;
import pages.Product;

public class GsmServerTest extends BaseTest {

    private Product product = new Product();
    private Cart cart = new Cart();
    private MainPage main = new MainPage();

    @Test
    public void testAddToCardProductAndPurchaseWithoutRegistration() {
        main.open();
        main.firstProductClick();
        product.addToCart();

        product.shouldBeAdded();

        cart.open();
        cart.checkoutWithoutRegistration();

        cart.shoudBeSuccess();
    }
}
