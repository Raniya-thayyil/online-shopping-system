package amazon;

import java.util.ArrayList;

public class User {

    private String name;
    private int age;
    private String gender;

    ArrayList<UserAccount> accountList = new ArrayList<>();
    ArrayList<Order> orders = new ArrayList<>();

    public User(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean createAccount(Amazon amazon, String username, String password) {

        for (UserAccount account : amazon.userAccounts) {
            if (account.getUsername() == username) {
                return false;
            }
            if (account.getPassword() == password) {
                return false;
            }
        }
        UserAccount myAccount = new UserAccount(username, password);
        myAccount.setUsername(username);
        myAccount.setPassword(password);
        this.accountList.add(myAccount);
        amazon.userAccounts.add(myAccount);
        return true;
    }

    public boolean addProductToCart(Amazon amazon, Cart cart, Product product, int quantity) {

        if (!amazon.productsList.contains(product)) {
            return false;
        }
        if (quantity < 1) {
            return false;
        }

        cart.products.add(product);
        product.setQuantity(quantity);

        double totalPrice = product.getPrice();

        totalPrice *= quantity;
        product.setPrice(totalPrice);

        return true;

    }

    public boolean placeOrder(Cart cart) {
        Order order = new Order(cart.products, cart.getTotalprice());

        if (cart.products.isEmpty()) {
            order.setStatus("failed,check your cart");
            this.orders.add(order);
            return false;
        }
        order.setProduct(cart.products);
        order.setStatus("order placed");
        order.setTotalPrice(cart.getTotalprice());
        this.orders.add(order);      

        return true;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + ", gender=" + gender + "]";
    }

}
