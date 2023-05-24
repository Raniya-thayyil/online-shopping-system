package amazon;

public class Main {

    public static void main(String[] args) {

        Amazon amazon = new Amazon();
        
        User jhon = new User("Jhon", 22, "Male");
        User anu = new User("anu", 23, "Female");

        jhon.createAccount(amazon, "jhon_jo", "Jo@123");
        anu.createAccount(amazon, "anu_ann", "anu_ann#20");
        
        

        Cart anusCart = new Cart();

        Product watch = new Product("Watch", 20000, 100);
        Product lipstick = new Product("iba", 239.80, 80);
        Product laptop = new Product("MacBook", 100000.0, 90);
        Product storyBook = new Product("Avni and the Perfect Playdate storybook", 165.5, 30);

        System.out.println(amazon.productsList);

        amazon.addProduct(laptop);
        amazon.addProduct(lipstick);
        amazon.addProduct(watch);
        amazon.addProduct(storyBook);

        anu.addProductToCart(amazon, anusCart, storyBook, 1);
        anu.addProductToCart(amazon, anusCart, lipstick, 2);
        anu.addProductToCart(amazon, anusCart, watch, 1);
        System.out.println(anusCart.getTotalprice());

        
        System.out.println(anusCart.products);
        
        anu.placeOrder(anusCart);
        System.out.println(anu.orders);

        
        // anusCart.removeProductsIfOrderPlaced(anu);
        // System.out.println(anusCart.products);

        Shippable shippable = new Shippable();
        shippable.generateTrackingNumberOfOrderBy(anu);
  
    }
    
}
