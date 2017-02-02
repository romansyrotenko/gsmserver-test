import org.junit.Test;
import pages.Cart;
import pages.Product;

public class GsmServerTest extends BaseTest {

    Product product = new Product();
    Cart cart = new Cart();

    @Test
    public void testAddToCardProductAndPurchaseWithoutRegistration() {

        product.open();
        product.addToCart();
        product.shouldBeAdded();

        cart.open();
        cart.checkoutWithoutRegistration();





    }

}
