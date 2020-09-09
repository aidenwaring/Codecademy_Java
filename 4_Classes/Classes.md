# Classes

## Introduction 1/8

All programs require one or more classes that act as a model for the world.

For example, a program to track student test scores might have Student, Course, and Grade classes. Our real-world concerns, students and their grades, are inside the program as classes.

We represent each student as an instance, or object, of the Student class.

This is object-oriented programming because programs are built around objects and their interactions. An object contains state and behavior.

Classes are a blueprint for objects. Blueprints detail the general structure. For example, all students have an ID, all courses can enroll a student, etc.

### Classes: Syntax 2/8

The fundamental concept of object-oriented programming is the class.

A class is the set of instructions that describe how an instance can behave and what information it contains.

Java has pre-defined classes such as System, which we’ve used in logging text to our screen, but we also need to write our own classes for the custom needs of a program.

Here’s a definition of a Java class:

```java
public class Car {
// scope of Car class starts after curly brace

  public static void main(String[] args) {
    // scope of main() starts after curly brace

    // program tasks

  }
  // scope of main() ends after curly brace

}
// scope of Car class ends after curly brace
```

This example defines a class named Car. `public` is an access level modifier that allows other classes to interact with this class.

This class has a `main()` method, which lists the tasks performed by the program. `main()` runs when we execute the compiled `Car.class` file.

```java
public class Store {
  public static void main(String[] args) {

  }
}
```

### Classes: Constructors 3/8

We create objects (instances of a class) using a constructor method. The constructor is defined within the class.

```java
public class Car {
  public Car() {
  //constructor method starts after curly brace

    //instructions for creating a Car instance

  }
  //constructor method ends after curly brace

  public static void main(String[] args) {

    // program tasks

  }
}
```

The constructor, `Car()`, shares a name with the class.

We create instances by calling or invoking the constructor within `main()`. This example assigns an instance to the variable ferrari:

```java
public class Car {

  public Car() {
  }

  public static void main(String[] args) {
    /*
    invoke a constructor using
    'new', the name, and parentheses:
    new Car()
    */
    Car ferrari = new Car();
  }
}
```

As with other variable declarations, we specify the type: Car, and name: ferrari. Variables that reference an instance have a type of the class name.
We invoke the constructor method: `Car()`, and use the keyword new to indicate that we’re creating an instance.

This is the first time we’ve called a method that we’ve also defined. `main()` is run automatically and we did not define the println() method.

```java
public class Store {

  // new method: constructor!
  public Store() {
    System.out.println("I am inside the constructor method.");
  }

  // main method is where we create instances!
  public static void main(String[] args) {
    System.out.println("Start of the main method.");

    // create the instance below
    Store lemonadeStand = new Store();
    // print the instance below
    System.out.println(lemonadeStand);
  }
}
```

### Classes: Instance Fields 4/8

Our last exercise ended with printing an instance of Store, which looked something like `Store@6bc7c054`. The first part, Store, refers to the class, and the second part @6bc7c054 refers to the instance’s location in the computer’s memory.

We’ll add associated data to an object by introducing instance variables, or instance fields. Instance fields are the state in our objects.

We want `Car` instances of different colors, so we declare a String color instance field.

```java
public class Car {
  /*
  declare fields inside the class
  by specifying the type and name
  */
  String color;

  public Car() {
    /*
    instance fields available in
    scope of constructor method
    */
  }

  public static void main(String[] args) {
    // body of main method
  }
}
```

```java
public class Store {
  // declare instance fields here!
  String productType;

  // constructor method
  public Store() {
    System.out.println("I am inside the constructor method.");
  }

  // main method
  public static void main(String[] args) {
    System.out.println("This code is inside the main method.");

    // Instance of Store class, lemonadeStand object
    Store lemonadeStand = new Store();

    System.out.println(lemonadeStand);
  }
}
```

```java
public class Store {
  // instance fields
  String productType;

  // constructor method
  public Store() {

  }

  // main method
  public static void main(String[] args) {


  }
}
```

### Classes: Constructor Parameters 5/8

We’ll use a combination of constructor method and instance field to create instances with individual state.

Parameters specify the type and name of data available for reference within a method’s scope.

We’ve already seen a parameter in the `main()` method: `String[] args`, but this is the first time we’re using the parameter value within a method body.

### Classes: Assigning Values to Instance Fields 6/8

```java
public class Car {
  // instance field
  String color;

  public Car(String carColor) {
    // assign parameter value to instance field
    color = carColor;
  }

  public static void main(String[] args) {
    // parameter value supplied when calling constructor
    Car ferrari = new Car("red");
  }
}
```

The type of the value given to the invocation must match the type declared by the parameter.

The object, `ferrari`, holds the state of color as an instance field referencing the value `"red"`.

We access the value of this field with the dot operator `.`:

```java
/*
accessing a field:
objectName.fieldName
*/

ferrari.color;
// "red"
```

```java
public class Store {
  // instance fields
  String productType;

  // constructor method
  public Store(String product) {
    productType = product;
  }

  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("lemonade");
    System.out.println(lemonadeStand.productType);

  }
}
```

### Classes: Multiple Fields 7/8

```java
public class Car {
  String color;
  // new fields!
  boolean isRunning;
  int velocity;

  // new parameters that correspond to the new fields
  public Car(String carColor, boolean carRunning, int milesPerHour) {
    color = carColor;
    // assign new parameters to the new fields
    isRunning = carRunning;
    velocity = milesPerHour;
  }

  public static void main(String[] args) {
    // new values passed into the method call
    Car ferrari = new Car("red", true, 27);
    Car renault = new Car("blue", false, 70);

    System.out.println(renault.isRunning);
    // false
    System.out.println(ferrari.velocity);
    // 27
  }
}
```

### Classes: Review 8/8

Java is an object-oriented programming language where every program has at least one class. Programs are often built from many classes and objects, which are the instances of a class.

Classes define the state and behavior of their instances. Behavior comes from methods defined in the class. State comes from instance fields declared inside the class.

```java
public class Dog {
    String breed;
    boolean hasOwner;
    int age;

    public Dog(String dogBreed, boolean dogOwned, int dogYears) {
      System.out.println("Constructor invoked!");
      breed = dogBreed;
      hasOwner = dogOwned;
      age = dogYears;
    }

    public static void main(String[] args) {
      System.out.println("Main method started");
      Dog fido = new Dog("poodle", false, 4);
      Dog nunzio = new Dog("shiba inu", true, 12);
      boolean isFidoOlder = fido.age > nunzio.age;
      int totalDogYears = nunzio.age + fido.age;
      System.out.println("Two dogs created: a " + fido.breed + " and a " + nunzio.breed);
      System.out.println("The statement that fido is an older dog is: " + isFidoOlder);
      System.out.println("The total age of the dogs is: " + totalDogYears);
      System.out.println("Main method finished");
    }
  }
```
