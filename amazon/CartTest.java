package amazon;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CartTest {
    @Test
    public void testGetTotalprice() {

        Amazon amazon = new Amazon();
        User lilli = new User("Lilli", 20, "Female");
        Cart lillisCart = new Cart();
        Product watch = new Product("Watch", 2100.0, 100);
        Product shirt = new Product("Shirt", 1340.9, 100);
        amazon.productsList.add(shirt);
        amazon.productsList.add(watch);
        lilli.addProductToCart(amazon, lillisCart, watch, 1);
        lilli.addProductToCart(amazon, lillisCart, shirt, 1);

        Double got;
        Double expected;
        expected = 3440.9;

        got = lillisCart.getTotalprice();
        assertEquals(expected, got);

    }
}
