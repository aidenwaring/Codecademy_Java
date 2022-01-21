public class PrintString {
    // instance fields
    String productType;
    double price;
    
    // constructor method
    public PrintString(String product, double initialPrice) {
      productType = product;
      price = initialPrice;
    }
    
    // increase price method
    public void increasePrice(double priceToAdd){
      price += priceToAdd;
    }
    
    // get price with tax method
    public double getPriceWithTax(){
      double tax = 0.08;
      return price + price*tax;
    }
  
    public String toString() {
      return "This PrintString sells " + productType + " at a price of " + price + ".";
    }
  
    // main method
    public static void main(String[] args) {
      PrintString lemonadeStand = new PrintString("Lemonade", 3.75);
      PrintString cookieShop = new PrintString("Cookies", 5);
      System.out.println(lemonadeStand);
      System.out.println(cookieShop);
    }
  }