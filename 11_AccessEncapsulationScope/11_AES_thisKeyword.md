# Access, Encapsulation, Scope


### Scope: this Keyword

Using `this` keyword, we can refer to the instance variable rather than a local (parameter) variable
if they both share the same name.

By default, Java refers to the local variable name.

```angular2
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
 