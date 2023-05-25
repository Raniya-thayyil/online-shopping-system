package amazon;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProductTest {
    @Test
    public void testSetPrice() {
        Product watch = new Product("Watch", 2000, 100);
        watch.setPrice(2100.0);

        Double expected;
        Double got;
        expected = 2100.0;
        got = watch.getPrice();
        assertEquals(expected, got);
    }

    @Test
    public void testSetQuantity() {
        Product watch = new Product("Watch", 2000, 100);
        watch.setQuantity(254);

        int expected;
        int got;
        expected = 254;
        got = watch.getQuantity();
        assertEquals(expected, got);

    }
}
