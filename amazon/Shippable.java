package amazon;

import java.util.Random;

public class Shippable implements ShippableInterface {

    private Product product;
    private String shippingStatus;
    private int trackingNumber;

    Random random = new Random();

    public Shippable(Product product, String shippingStatus, int trackingNumber) {
        this.product = product;
        this.shippingStatus = shippingStatus;
        this.trackingNumber = trackingNumber;
    }

    public Shippable() {

    }   

    public String getShippingStatus() {
        return shippingStatus;
    }

    public void setShippingStatus(String shippingStatus) {
        this.shippingStatus = shippingStatus;
    }

    public int getTrackingNumber() {
        trackingNumber = random.nextInt(2000000000);
        return trackingNumber;
    }   

    @Override
    public void generateTrackingNumberOfOrderBy(User user) {

        for (Order order : user.orders) {
            for (Product product : order.product) {               
                this.setShippingStatus("shipped");                
                Shippable shippableProduct = new Shippable(product, this.getShippingStatus(), this.getTrackingNumber());
                System.out.println(shippableProduct);
            }

        }

    }

    @Override
    public String toString() {
        return "Shippable [product=" + product + ", shippingStatus=" + shippingStatus + ", trackingNumber="
                + trackingNumber + "]";
    }

}
