# Arrays

## String[] args

When we write main() methods for our programs, we use the parameter String[] args.

The args parameter is another example of a String array. 

In this case, the array args contains the arguments that we pass in from the terminal when we run the class file.

Given:

```java
public class HelloYou {
  public static void main(String[] args) {
    System.out.println("Hello " + args[0]);  
  }
}
```

When we run the file HelloYou in the terminal with an argument of "Laura":

```
java HelloYou Laura
```

We get:

```
Hello Laura
```

The String[] args would be interpreted as an array with one element, "Laura".