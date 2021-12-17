public class AdvertiseMethod {
    // instance fields
    String productType;
    
    // constructor method
    public AdvertiseMethod(String product) {
      productType = product;
    }
    
    // advertise method
    public void advertise() {
          System.out.println("Selling " + productType + "!");
      System.out.println("Come spend some money!");
    }
    
    // main method
    public static void main(String[] args) {
      AdvertiseMethod lemonadeStand = new AdvertiseMethod("Lemonade");
      lemonadeStand.advertise();
    }
  }