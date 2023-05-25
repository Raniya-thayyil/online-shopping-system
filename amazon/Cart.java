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
}


