package amazon;

import java.util.ArrayList;

public class Order implements OrderInterface{

    ArrayList<Product> product;
    double totalPrice;
    String status;  

    public Order(ArrayList<Product> product, double totalPrice) {
        this.product = product;
        this.totalPrice = totalPrice;
    }

    @Override
    public ArrayList<Product> getProducts() {
        return this.product;       
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
        this.product = product;
    }

    @Override
    public String toString() {
        return "Order [product=" + product + ", totalPrice=" + totalPrice + ", status=" + status + "]";
    }

    

    
}
