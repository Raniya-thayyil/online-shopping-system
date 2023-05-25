package amazon;

import java.util.ArrayList;

public interface OrderInterface {

    ArrayList<Product> getProducts();
    double getTotalPrice();
    String getOrderStatus();      
}
