# Classes

## Defining Methods 1/8

All programs require one or more classes that act as a model for the world.

```java
public void startEngine() {
  System.out.println("Starting the car!");
  System.out.println("Vroom!");
}
```

The first line, public void startEngine(), is the method signature. It gives the program some information about the method:

- `public` means that other classes can access this method. We will learn more about that later in the course.
- The `void` keyword means that there is no specific output from the method. We will see methods that are not void later in this lesson, but for now all of our methods will be void.
- `startEngine()` is the name of the method.

### Calling Methods 2/8

Here is an example of calling a method on an object using the Car class:

```java
class Car {

  String color;

  public Car(String carColor) {
    color = carColor;
  }

  public void startEngine() {
    System.out.println("Starting the car!");
    System.out.println("Vroom!");
  }

  public static void main(String[] args){
    Car myFastCar = new Car("red");
    myFastCar.startEngine();
  }
}
```

### Scope 3/8

A method is a task that an object of a class performs.

We mark the domain of this task using curly braces: `{`, and `}`. Everything inside the curly braces is part of the task. This domain is called the scope of a method.

We can’t access variables that are declared inside a method in code that is outside the scope of that method. 

```java
class Car {
  String color;
  int milesDriven;

  public Car(String carColor) {
    color = carColor;
    milesDriven = 0;         
  }

  public void drive() {
     String message = "Miles driven: " + milesDriven;
     System.out.println(message);
  }

  public static void main(String[] args){
     Car myFastCar = new Car("red");
     myFastCar.drive();
  }
}
```

The variable message, which is declared and initialized inside of drive, cannot be used inside of `main()`! It only exists within the scope of the drive() method.

### Adding Parameters 4/8

What if we had some information in one method that we needed to pass into another method?

Similar to how we added parameters to constructors, we can customize all other methods to accept parameters.

```java
class Car {

  String color;

  public Car(String carColor) {
    color = carColor;         
  }

  public void startRadio(String station) {
    System.out.println("Turning on the radio to " + station + "!");
    System.out.println("Enjoy!");
  }

  public static void main(String[] args){
    Car myCar = new Car("red");
    myCar.startRadio("Meditation Station");
    /* Turning on the radio to Meditation Station!
       Enjoy! */
  }
}
```

### Reassigning Instance Variables 5/8

```java
public class Store {
  // instance fields
  String productType;
  double price;
  
  // constructor method
  public Store(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  
  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }
  
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade", 3.75);
    lemonadeStand.increasePrice(1.5);
    System.out.println(lemonadeStand.price);
  }
}
```

### Returns 6/8

Remember, variables can only exist in the scope that they were declared in.

We can use a value outside of the method it was created in if we return it from the method. 

```java
public int numberOfTires() {
   int tires = 4;
   return tires;
}
```

In the pats, when creating new methods, we used the keyword `void`. Here, we are replacing void with `int`, to signify that the return type is an `int`.

We can use datatype keywords (such as int, char, etc.) to specify that a method should return a value of that type.

```java
public class Store {
  // instance fields
  String productType;
  double price;
  
  // constructor method
  public Store(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  
  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }
  
  // get price with tax method
  public double getPriceWithTax() {
    double totalPrice = price + price * 0.08;
    return totalPrice;
  }
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade", 3.75);
  double lemonadePrice = lemonadeStand.getPriceWithTax();
  System.out.println(lemonadePrice);
  }
}
```

### The toString() method 7/8

When we print out Objects, we often see a String that is not very helpful in determining what the Object represents. In the last lesson, we saw that when we printed our `Store` objects, we would see output like:

`Store@6bc7c054`

where Store is the name of the object and `6bc7c054` is its position in memory.

When we define a toString() method for a class, we can return a String that will print when we print the object.

```java
public class Store {
  // instance fields
  String productType;
  double price;
  
  // constructor method
  public Store(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  
  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }
  
  // get price with tax method
  public double getPriceWithTax(){
    double tax = 0.08;
    double totalPrice = price + price*tax;
    return totalPrice;
  }

  public String toString() {
    String description = "This store sells " + productType + " at a price of " + price + ".";
    return description;
  }

  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade", 3.75);
    Store cookieShop = new Store("Cookies", 5);
    System.out.println(lemonadeStand);
    System.out.println(cookieShop);
  }
}
```

### Method Review 8/8

Methods are a powerful way to abstract tasks away and make them repeatable. They allow us to define behavior for classes, so that the Objects we create can do the things we expect them to.

- Defining a method : Methods have a method signature that declares their return type, name, and parameters
- Calling a method : Methods are invoked with a . and ()
- Parameters : Inputs to the method and their types are declared in parentheses in the method signature
- Changing Instance Fields : Methods can be used to change the value of an instance field
- Scope : Variables only exist within the domain that they are created in
- Return : The type of the variables that are output are declared in the method signature


