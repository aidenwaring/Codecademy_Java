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
