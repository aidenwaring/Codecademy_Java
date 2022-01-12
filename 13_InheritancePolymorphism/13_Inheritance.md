# Inheritance

So how do we define a child class so that it inherits from a parent class? We use the keyword `extends` like this:

```java
class Shape {
 
  // Shape class members
 
}
 
class Triangle extends Shape {
 
  // additional Triangle class members
 
}
```

Now `Triangle` has inherited traits from `Shape`, meaning it copied over class members from `Shape`. When we use inheritance to extend a subclass from a superclass, we create an “is-a” relationship from the subclass to the superclass.

## Inheriting the Constructor

Let’s say `Shape` has a `numSides` field that is set by passing an integer into the constructor. If we’re instantiating a `Triangle`, we would want that number to always be `3`, so we’d want to modify the constructor to automatically assign numSides with a value of `3`.

```java
class Triangle extends Shape {
 
  Triangle() {
    super(3);
  }
 
  // additional Triangle class members
 
}
```

Meanwhile, `super(3)` (behaving as `Shape(3)`) will shoulder the responsibility of setting `numSides` to `3` for our `Triangle` object. It’s like we called `Shape(3)`.

If you’re writing a constructor of a child class, and don’t explicitly make a call to a constructor from a parent class using `super`, it’s important to remember that Java will automatically (and secretly) call `super()` as the first line of your child class constructor.

## Parent Class Aspect Modifiers

Java class members use `private` and `public` access modifiers to determine whether they can be access from outside the class.

A child class **does not** inherit its parent's `private` members.

While elements declared as `private` can be accessed only by the class in which they're declared, the `protected` keyword allows access from sub-classes and members of the same package.

![assets/img4](/assets/img4.png)

```java
class Shape {
 
  protected double perimeter;
 
}
```

## Final

If we add `final` before a parent class method’s access modifier, we disallow any child classes from changing that method.

```java
public class Noodle {
/*
 Any file that extends Noodle and inherits the isTasty() method
 cannot override it as it is declared as final
*/
final public boolean isTasty() {
    
    return true;
    
  }
}
```


