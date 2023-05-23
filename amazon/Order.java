package amazon;

import java.util.ArrayList;

public interface Order {
    
    ArrayList<Product> getProducts();
    double getTotalPrice();
    String getOrderStatus();    
}
