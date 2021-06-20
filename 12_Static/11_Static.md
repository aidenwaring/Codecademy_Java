# Static
# Static Methods

Every method in the Math class is static. 
This means that we can call and use these methods without creating an object of the class. 
There are two main options for calling a static method.

1. Append the dot operator to the class name followed by the method we want to execute.

```
int smallerNumber = Math.min(3, 10);
```

2. Import the Math class     

```
import static java.lang.Math.*; // import Math class
 
class Numbers {
    // Call method by using method name and arguments
    int smallerNumber = min(3, 10);

```

## Static Variables

Think of static variables belonging to the class itself instead of belonging to a particular object
of the class.

Access static variables by using the name of the class and the `.` operator. 

```java
public class Dog{
 
  // Static variables
  public static String genus = "Canis";
 
  //Instance variables
  public int age;
  public String name;
 
  public Dog(int inputAge, String inputName){
    this.age = inputAge;
    this.name = inputName;
  }
}
```


```
public static void main(String[] args){
  Dog snoopy = new Dog(3, "Snoopy");
  Dog ringo = new Dog(5, "Ringo");
 
  System.out.println(Dog.genus); // Prints Canis
  System.out.println(snoopy.genus); // Prints Canis
  System.out.println(ringo.genus); // Prints Canis
}
```

### Static Methods Vs. Static Variables

Unlike static methods, you can still access static variables from a specific object of the class. 
However, no matter what object you use to access the variable, the value will always be the same.
