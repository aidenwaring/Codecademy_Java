# Polymorphism

## Polymorphism Basics

In Java, if `Orange` is a `Fruit` through inheritance, you can then use `Orange` in the same contexts as `Fruit` like this:

```java
public class juicer {

    String makeJuice(Fruit fruit) {
        return "Apple juice and " + fruit.squeeze();
    }

    public static void main(String[] args){
        Orange orange = new Orange();
        System.out.println(juicer.makeJuice(orange));
    }
}
```

Java incorporates the object-oriented programming principle of *polymorphism*.

Polymorphism allows a child class to share the information and behavior of its parent class while also incorporating its own functionality. 

![assets/img5](/assets/img5.png)

Note that the reverse situation is not true; you cannot use a generic parent class instance where a child class instance is required. 

So an `Orange` can be used as a `Fruit`, but a `Fruit` cannot be used as an `Orange`.

## Method Overriding

One common use of polymorphism with Java classes is overriding parent class methods in a child class.

This is useful when we want our child class method to have the same name as a parent class method but behave a bit differently in some way.

```java
class BankAccount {
  protected double balance;
 
  public BankAccount(double balanceIn){
    balance = balanceIn;
  }
 
  public void printBalance() {
    System.out.println("Your account balance is $" + balance);
  }
}
 
class CheckingAccount extends BankAccount {
 
  public CheckingAccount(double balance) {
    super(balance);
  }
 
  @Override
  public void printBalance() {
    System.out.println("Your checking account balance is $" + balance);
  }
}
```

## Using a Child Class as its Parent Class

An important facet of polymorphism is the ability to use a child class object where an object of its parent class is expected.

```java
class Dinner {
  
  private void makeNoodles(Noodle noodle, String sauce) {
    
    noodle.cook();
    
    System.out.println("Mixing " + noodle.texture + " noodles made from " + noodle.ingredients + " with " + sauce + ".");
    System.out.println("Dinner is served!");
    
  }
  
  public static void main(String[] args) {
    
    Dinner noodlesDinner = new Dinner();
    
//  Type   variable     new BiangBiang();    
    Noodle biangBiang = new BiangBiang();
//  Fruit orange = new Orange();

    noodlesDinner.makeNoodles(biangBiang, "soy sauce and chili oil");
   
  }
}
```

## Child Classes in Arrays and ArrayLists

Usually, when we create an array or an `ArrayList`, the list items all need to be the same type.

In fact, we can put instances of different classes that share a parent class together in an array or `ArrayList`! For example, let’s say we have a `Monster` parent class with a few child classes: `Vampire`, `Werewolf`, and `Zombie`. We can set up an array with instances of each:

```java
class Noodle {
      public static void main(String[] args) {
        
        Noodle spaghetti, ramen, pho;
        
        spaghetti = new Spaghetti();
        ramen = new Ramen();
        pho = new Pho();
            
        Noodle[] allTheNoodles = {spaghetti, ramen, pho};
        
        for (Noodle noodle : allTheNoodles) {
          System.out.println(noodle.getCookPrep());
        }
      }
}
```

## Child Classes in Method Parameters

```java
class NoodleRestaurant {
  String name;

  public NoodleRestaurant(String customerName){
    name = customerName;
  }

  public void order(Noodle noodle) {
    System.out.println(noodle.getCookPrep());
    System.out.println("Order for " + name + " is ready.");
  }

  public static void main(String[] args) {
    Noodle ramen, pho;
    ramen = new Ramen();
    pho = new Pho();
    
    NoodleRestaurant customer1 = new NoodleRestaurant("Sagirah");
    NoodleRestaurant customer2 = new NoodleRestaurant("Maritza");

    // Add your code here
    customer1.order(pho);
    customer2.order(ramen);
  }
}
```