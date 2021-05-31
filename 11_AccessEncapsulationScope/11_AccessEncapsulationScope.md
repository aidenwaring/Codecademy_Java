# Access, Encapsulation, Scope

## Accessor (Getter) and Mutatator (Setter) Methods

### Getters

When writing classes, we often make all of our instance variables private. 
However, we still might want some other classes to have access to them, we just don’t want those 
classes to know the exact variable name. To give other classes access to a private instance
 variable, we would write an accessor method (sometimes also known as a “getter” method).

```
public class Dog{
  private String name;
 
  //Other methods and constructors
 
  public String getName() {
    return name;
  }
}
```

Even though the String variable 'name' is private, other classes and methods can call the public
method getName(). Accessor methods will always be public and will return the instance variable 
they're accessing.

### Setters

Private instance variables will often have mutator (setter) methods. These allow other classes to
reset the value stored in private instance variables without giving direct visibility to the name.

```java
public class Dog{
  private String name;
 
  //Other methods and constructors
 
  public void setName(String newName) {
    name = newName;
  }
 
  public static void main(String[] args){
    Dog myDog = new Dog("Cujo");
    myDog.setName("Lassie");
  }
}
```

Setters are often void as they don't return anything, they just reset the value of an existing
variable.

## Scope

### Scope: Local Variables

In addition to access modifiers like public and private, the `scope` of the variable also
determines what parts of your code can access that variable.

The scope of a variable is determined by where the variable is declared. 

Instance variables declared inside a class but outside any methods or constructors means that all
methods are within the scope of that variable.

Instance variables declared within a method can only be accessed within that method, similar to 
parameters.

```java
class Dog{
  public String name;
  public int age;
  public int weight;
 
  public Dog(){
    name = "Winston";
    age = 8;
    weight = 30;
  }
 
  public void speak(){
    System.out.println("My name is " + name);
  }
}
```