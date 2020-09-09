public class LemonadeStore {
    // instance fields
    String productType;
    
    // constructor method
    public LemonadeStore(String product) {
      productType = product;
    }
    
    // main method
    public static void main(String[] args) {
      LemonadeStore lemonadeStand = new LemonadeStore("lemonade");
      System.out.println(lemonadeStand.productType);
      
    }
  }