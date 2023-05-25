package amazon;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UserTest {
    @Test
    public void testAddProductToCart() {
        Amazon amazon = new Amazon();
        User lilli = new User("Lilli", 20, "Female");
        Cart lillisCart = new Cart();
        Product watch = new Product("Watch", 20000, 100);

        // test case 1
        boolean got = lilli.addProductToCart(amazon, lillisCart, watch, 1);
        assertFalse(got);

        // test case 2
        amazon.productsList.add(watch);
        boolean got1 = lilli.addProductToCart(amazon, lillisCart, watch, 1);
        assertTrue(got1);
    }

    @Test
    public void testCreateAccount() {
        Amazon amazon = new Amazon();
        User lilli = new User("Lilli", 20, "Female");
        User aji = new User("Aji", 21, "Male");

        // test case 1
        boolean got = lilli.createAccount(amazon, "lil", "123");
        assertTrue(got);

        // test case 2
        boolean got1 = aji.createAccount(amazon, "aji", "123");
        assertFalse(got1);
    }

    @Test
    public void testPlaceOrder() {
        Amazon amazon = new Amazon();
        User lilli = new User("Lilli", 20, "Female");
        Cart lillisCart = new Cart();
        Product watch = new Product("Watch", 20000, 100);
        amazon.productsList.add(watch);

        // test case 1
        boolean got = lilli.placeOrder(lillisCart);
        assertFalse(got);

        // test case 2
        lilli.addProductToCart(amazon, lillisCart, watch, 1);
        boolean got1 = lilli.placeOrder(lillisCart);
        assertTrue(got1);
    }

    @Test
    public void testSetAge() {

        User lilli = new User("Lilli", 20, "Female");

        lilli.setAge(21);
        int expected = 21;
        int got = lilli.getAge();
        assertEquals(expected, got);
    }
}
