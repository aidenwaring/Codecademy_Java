# Access, Encapsulation, Scope


### Scope: this Keyword

Using `this` keyword, we can refer to the instance variable rather than a local (parameter) variable
if they both share the same name.

By default, Java refers to the local variable name.

```
public Dog(String name){
  this.name = name;
}
```

You can read this as “set this Dog‘s instance variable name equal to the variable passed into the
 constructor”.
 
 if there’s no local variable with the same name, Java will know to use the instance variable with
 that name.
 
 That being said, it is a good habit to use this. when working with your instance variables to avoid 
 potential confusion.
 
 ```java
public class SavingsAccount{
  // instance variables
  public String owner;
  public int balanceDollar;
  public double balanceEuro;

  public SavingsAccount(String owner, int balanceDollar){
    // owner instance variable is equal to the value passed in by local variable owner
    this.owner = owner;
    this.balanceDollar = balanceDollar;
    this.balanceEuro = balanceDollar * 0.85;
  }

  public void addMoney(int balanceDollar){
    System.out.println("Adding " + balanceDollar + " dollars to the account.");
this.balanceDollar += balanceDollar;
// this.balance = this.balance + balanceDollar
// instance variable balance is equal to itself plus value provided by local variable balanceDollar
    System.out.println("The new balance is " + this.balanceDollar + " dollars.");
  }

  public static void main(String[] args){
    SavingsAccount zeusSavingsAccount = new SavingsAccount("Zeus", 1000);
    zeusSavingsAccount.addMoney(2000);
  }
}
```
 
Demonstrated above is how `this` works for variables, but we can also use `this` with methods.

```java
public class Computer{
  public int brightness;
  public int volume;
 
  public void setBrightness(int inputBrightness){
    this.brightness = inputBrightness;
  }
 
  public void setVolume(int inputVolume){
    this.volume = inputvolume;
  }
 
  public void resetSettings(){
    // resetSettings() method calls other methods using this
    // in order to do this, it needs an object to call these methods
    // rather than create a new object, we use this as the object 
    this.setBrightness(0);
    this.setVolume(0);
  }

  public static void main (String[] args) {
    Computer myComputer = new Computer();
    myComputer.resetSettings();
    // Here myComputer is calling resetSettings.
    // Calling resetSettings() is as iff our object also called
    // myComputer.setBrightness(0) and myComputer.setVolume(0).
    // this is a placeholder for whatever object is used from the original method    
    }
}
```

`this` serves as a placeholder for whatever object was used to call the original method.

What this means is that whatever object that calls resetSettings will then also call these methods.

### `this` in methods

A method calling other methods using `this`.

```
public void pairWithOtherComputer(Computer other){
  // Code for method that uses the parameter other
}
 
public void setUpConnection(){
  // We use "this" to call the method and also pass "this" to the method so it can be used in that method
  this.pairWithOtherComputer(this);
}
```

You're using the current object to call this method (first this) and using the object passed in 
as the parameter (second this).