package amazon;

import java.util.ArrayList;

public class User {

    private String name;
    private int age;
    private String gender;

    ArrayList<UserAccount> accountList = new ArrayList<>();

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
        this.age = age;
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

    public void addProductToCart(Cart cart, Product product) {
        Cart.products.add(product);

    }

    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + ", gender=" + gender + "]";
    }

}
