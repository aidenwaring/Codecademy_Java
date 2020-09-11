# If-Else

### If-Else 1/5

The if-then statement is the most simple control flow we can write. It tests an expression for truth and executes some code based on it.

The if keyword marks the beginning of the conditional statement, followed by parentheses ().

```java
public class Order {
  
  public static void main(String[] args) {
    
    double itemCost = 30.99;
    
    // Write an if-then statement:
    if (itemCost > 24.00) {
      System.out.println(itemCost);
    }
    
  }
  
}
```

### If-Then-Else 2/5

- If condition is true, then do something
- Else, do a different thing

```java
public class Order {
  
  public static void main(String[] args) {
    
    boolean isFilled = false;
    
    // Write an if-then-else statement:
    if (isFilled) {
      System.out.println("Shipping");
    } else {
      System.out.println("Order not ready");
    }
    
  }
  
}
```

### If-Else 3/5



```java
  public double calculateShipping() {

// declare conditional statement here
if (shipping == "Regular") {
    return 0;
    } else if (shipping == "Express") {
      return 1.75;
    } else {
      return .50;
    }
}
```

### Switch Statement 4/5

An alternative to chaining if-then-else conditions together is to use the switch statement. This conditional will check a given value against any number of conditions and run the code block where there is a match.

Here’s an example of our course selection conditional as a `switch` statement instead:

```java
String course = "History";

switch (course) {
  case "Algebra": 
    // Enroll in Algebra
    break; 
  case "Biology": 
    // Enroll in Biology
    break;
  case "History": 
    // Enroll in History
    break;
  case "Theatre":
    // Enroll in Theatre
    break;
  default:
    System.out.println("Course not found");
}
```

### Switch 5/5

```java
  public double calculateShipping() {
    double shippingCost;
	 	// declare switch statement here
    switch(shipping) {
      case "Regular":
        shippingCost = 0;
        break;
      case "Express":
        shippingCost = 1.75;
        break;
      default:
       shippingCost = .50;
       break;
    }
    
    return shippingCost;
     }
```