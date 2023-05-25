package amazon;

public class Main {

    public static void main(String[] args) {

        Amazon amazon = new Amazon();

        User jhon = new User("Jhon", 22, "Male");
        User anu = new User("anu", 23, "Female");

        jhon.createAccount(amazon, "jhon_jo", "Jo@123");
        anu.createAccount(amazon, "anu_ann", "anu_ann#20");

        Cart anusCart = new Cart();

        Product watch = new Product("Watch", 2000, 100);
        Product lipstick = new Product("iba", 239.80, 80);
        Product laptop = new Product("MacBook", 100000.0, 90);
        Product storyBook = new Product("Avni and the Perfect Playdate storybook", 165.5, 30);

        amazon.addProduct(laptop);
        amazon.addProduct(lipstick);
        amazon.addProduct(watch);
        amazon.addProduct(storyBook);

        System.out.println(amazon.productsList);

        anu.addProductToCart(amazon, anusCart, storyBook, 1);
        anu.addProductToCart(amazon, anusCart, lipstick, 2);
        anu.addProductToCart(amazon, anusCart, watch, 1);
        System.out.println("cart:" + anusCart.products);

        anu.placeOrder(anusCart);
        System.out.println("anu's order:" + anu.orders);
       
        System.out.println(anusCart.products);
        System.out.println("anu's order:" + anu.orders);

        Shippable shippable = new Shippable();
        shippable.generateTrackingNumberOfOrderBy(anu);

    }

}
