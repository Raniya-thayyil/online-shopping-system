package amazon;

import java.util.ArrayList;

public class Cart implements CartInterface {

    ArrayList<Product> products = new ArrayList<>();

    public Cart() {

    }

    @Override
    public double getTotalprice() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }      

    public void removeProductsIfOrderPlaced(User user) {
      for (Order order : user.orders) {
        for (Product p : order.product) {
            if (this.products.contains(p)) {
                this.products.remove(p);
            }
        }
        
        // for (int i = 0; i < order.product.size(); i++) {
        //     if (this.products.contains(order.product.get(i))) {
        //         this.products.remove(order.product.get(i));
        //     }
        // }
      }

    }

}
