package amazon;

import java.util.ArrayList;

public class Order implements OrderInterface{

    ArrayList<Product> products;
    double totalPrice;
    String status;  

    public Order(ArrayList<Product> product, double totalPrice) {
        this.products = product;
        this.totalPrice = totalPrice;
    }

    @Override
    public ArrayList<Product> getProducts() {
        return this.products;       
    }

    @Override
    public double getTotalPrice() {
       return this.totalPrice;
    }    

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String getOrderStatus() {
        return this.status;
    }

    public void setProduct(ArrayList<Product> product) {
        this.products = product;
    }

    @Override
    public String toString() {
        return "Order [products=" + products + ", totalPrice=" + totalPrice + ", status=" + status + "]";
    }    
}
