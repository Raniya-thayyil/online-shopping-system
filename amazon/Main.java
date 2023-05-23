package amazon;

public class Main {

    public static void main(String[] args) {

        Amazon amazon = new Amazon();
        
        User jhon = new User("Jhon", 22, "Male");
        User anu = new User("anu", 23, "Female");

        jhon.createAccount(amazon, "jhon_jo", "Jo@123");
        anu.createAccount(amazon, "anu_ann", "anu_ann#20");              

        System.out.println(Cart.products);
        
    }
    
}
