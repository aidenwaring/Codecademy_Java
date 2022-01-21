public class Shop {
    // instance fields
    String productType;
    double price;
    
    // constructor method
    public Shop(String product, double initialPrice) {
      productType = product;
      price = initialPrice;
    }
    
    // increase price method
    public void increasePrice(double priceToAdd){
      price += priceToAdd;
    }
    
    // get price with tax method
    public double getPriceWithTax() {
      return price + price * 0.08;
    }
    // main method
    public static void main(String[] args) {
      Shop lemonadeStand = new Shop("Lemonade", 3.75);
    double lemonadePrice = lemonadeStand.getPriceWithTax();
    System.out.println(lemonadePrice);
    }
  }