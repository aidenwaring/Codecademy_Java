# Access, Encapsulation, Scope

## Public Keyword

public and private keywords are defining what parts of your code have access to other parts of your code.

We can define the access of many different parts of our code including instance variables, methods, constructors, and even a class itself. If we choose to declare these as public this means that any part of our code can interact with them - even if that code is in a different class!

The way we declare something to be public is to use the public keyword in the declaration statement. In the code block below, we have a public class, constructor, instance variables, and method. Notice the five different uses of public.

```java
public class Dog{
  public String name;
  public int age;
 
  public Dog(String input_name, int input_age){
    name = input_name;
    age = input_age;
  }
 
  public void speak() {
    System.out.println("Arf Arf! My name is " + name + " and I am a good dog!");
  }
}
```

Since everything about a Dog is public, any other class can access anything about a Dog. For example, let’s say there was a DogSchool class. Any method of the DogSchool class could make a new Dog using the public Dog constructor, directly access that Dog’s instance variables, and directly use that Dog’s methods:

```java
public class DogSchool{
  public void makeADog(){
    Dog cujo = new Dog("Cujo", 7);
    System.out.println(cujo.age);
    cujo.speak();
  }
}
```

Notice that the DogSchool class and the makeADog() method are also public. This means that if some other class created a DogSchool, they would have access to these methods as well! We have public methods calling public methods!

## Private Keyword and Encapsulation

When a Class’ instance variable or method is marked as private, that means that you can only access those structures from elsewhere inside that same class.

This is one of the core ideas behind encapsulation. By making our instance variables (and some methods) private, we encapsulate our code into nice little bundles of logic.

For example, a Bank object doesn’t necessarily need to know the inner workings of a CheckingAccount object. 

By limiting access by using the private keyword, we are able to segment, or encapsulate, our code into individual units.

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
