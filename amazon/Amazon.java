package amazon;

import java.util.ArrayList;

public class Amazon {

   ArrayList<UserAccount> userAccounts = new ArrayList<>();
   ArrayList<Product> productsList = new ArrayList<>();

   public void addProduct(Product product) {
      this.productsList.add(product);

   }

}
