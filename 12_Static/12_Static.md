# Static
# Static Methods

Static methods are methods we can call and use without creating an object of the class. 
There are two main options for calling a static method.

## Static Variables

Think of static variables belonging to the class itself instead of belonging to a particular object
of the class.

Access static variables (and methods) by using the name of the class and the `.` operator. 

```java
public class Dog {

    // Static variables
    public static String genus = "Canis";

    //Instance variables
    public int age;
    public String name;

    public Dog(int inputAge, String inputName) {
        this.age = inputAge;
        this.name = inputName;
    }

    public static void main(String[] args) {
        Dog snoopy = new Dog(3, "Snoopy");
        Dog ringo = new Dog(5, "Ringo");

        System.out.println(Dog.genus); // Prints Canis
        System.out.println(snoopy.genus); // Prints Canis
        System.out.println(ringo.genus); // Prints Canis
    }
}
```

## Static Variables Example

```java
public class ATM{

  // Step 2: Create your static variables here
  public static String atmHello = "Hello I am an ATM.";
  public static int totalMoney = 0;
  public static int numATMs = 0;

  // Instance variables
  public int money;

  public ATM(int inputMoney){
    this.money = inputMoney;
  }

  public void withdrawMoney(int amountToWithdraw){
    if(amountToWithdraw <= this.money){
      this.money -= amountToWithdraw;
    }
  }

  public static void main(String[] args){
    // Step 1: Create your two ATMs here
    ATM firstATM = new ATM(1000);
    ATM secondATM = new ATM(500);
    // Step 3: Print your static variable in three different ways here
    System.out.println(ATM.atmHello);
    System.out.println(firstATM.atmHello);
    System.out.println(secondATM.atmHello);

    System.out.println(ATM.totalMoney);
    System.out.println(firstATM.totalMoney);
    System.out.println(secondATM.totalMoney);

  }

}
```

## Static Methods and Non-Static Instance Variables

One important rule to note is that static methods can’t interact with non-static instance variables. 

Let’s say we have a Dog class with a non-static instance variable named age. 
If we have a line of code like this.age = 5;, that means we’re setting the age of a specific Dog equal to 5.
However, if age were static, that would mean that the variable belongs to the entire class, not a specific object.