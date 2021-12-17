public class WelcomeMethod {
    // instance fields
    String productType;
    
    // constructor method
    public WelcomeMethod(String product) {
      productType = product;
    }
    
    // advertise method
    public void advertise() {
      String message = "Selling " + productType + "!";
          System.out.println(message);
    }
  
    public void greetCustomer(String customer) {
      System.out.println("Welcome to the WelcomeMethod, " + customer + "!");
    }
    
    // main method
    public static void main(String[] args) {
      WelcomeMethod lemonadeStand = new WelcomeMethod("Lemonade");
      lemonadeStand.greetCustomer("Aidos");
    }
  }