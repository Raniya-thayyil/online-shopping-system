package amazon;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrderTest {
    @Test
    public void testSetStatus() {
        Amazon amazon = new Amazon();
        User lilli = new User("Lilli", 20, "Female");
        Cart lillisCart = new Cart();
        Product watch = new Product("Watch", 2100.0, 100);
        Product shirt = new Product("Shirt", 1340.9, 100);
        amazon.productsList.add(shirt);
        amazon.productsList.add(watch); 
        
        String expected;

        //test case 1
        expected = "failed,check your cart";
        for (Order order : lilli.orders) {
            assertEquals(expected, order.getOrderStatus());
        }
        
        //test case 2     
        lilli.addProductToCart(amazon, lillisCart, watch, 1);
        lilli.addProductToCart(amazon, lillisCart, shirt, 1);   
        lilli.placeOrder(lillisCart);
        expected = "order placed";
        for (Order order : lilli.orders) {
            assertEquals(expected, order.getOrderStatus());
        }        

    }
}
