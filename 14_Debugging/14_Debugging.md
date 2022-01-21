# Debugging

## Syntax Errors

Syntax errors are flagged by the compiler.

## Run-time Errors

If our program has no compile-time errors, it’ll run. 

Errors which happen during program execution (run-time) after successful compilation are called run-time errors. 

Some common run-time errors:

* Division by zero also known as division error
* Trying to open a file that doesn’t exist

There is no way for the compiler to know about these kinds of errors when the program is compiled.

## Exceptions

Java uses exceptions to handle errors and other exceptional events. Exceptions are the conditions that occur at runtime and may cause the termination of the program.

When an exception occurs, Java displays a message that includes the name of the exception, the line of the program where the exception occurred, and a stack trace. The stack trace includes:

* The method that was running
* The method that invoked it
* The method that invoked that one
* and so on…

Some common exceptions that you will see in the wild:

* `ArithmeticException`: Something went wrong during an arithmetic operation; for example, division by zero.
* `NullPointerException`: You tried to access an instance variable or invoke a method on an object that is currently null.
* `ArrayIndexOutOfBoundsException`: The index you are using is either negative or greater than the last index of the array (i.e., array.length-1).
* `FileNotFoundException`: Java didn’t find the file it was looking for.

## Exception Handling

Exception handling is an essential feature of Java programming that allows us to use run-time error exceptions to make our debugging process a little easier.

One way to handle exceptions is using the `try`/`catch`:

```
try {
 
  //  Block of code to try
 
} catch (NullPointerException e) {
 
  // Print the error message like this:
  System.err.println("NullPointerException: " + e.getMessage());
 
  // Or handle the error another way here
 
}
```

Notice how we used `System.err.println()` here instead of `System.out.println()`. 

`System.err.println()` will print to the standard error and the text will be in red.

You can also chain exceptions together:

```
try {
 
  //  Block of code to try
 
} catch (NullPointerException e) {
 
  //  Code to handle a NullPointerException
 
} catch (ArithmeticException e) {
 
  //  Code to handle an ArithmeticException
 
}
```

```
public class Debug {
  public static void main(String[] args) {
    
    int width = 0;
    int length = 40;

    try {
      int ratio = length / width;
    } catch (ArithmeticException e) {
      System.err.println();
    }
  }
}
```

## Logic Errors

Once we have removed the syntax errors and run-time errors, the program runs successfully. But sometimes, the program still doesn’t do what we want it to do or no output is produced.

These types of errors, which provide incorrect output, but appear to be error-free, are called logic errors. Logic errors occur when there is a design flaw in your program.

## Debugging Techniques

1. **Divide and conquer**: Comment out or temporarily delete half the code to isolate an issue.

* If the program compiles now, you know the error is in the code you deleted. Bring back about half of what you removed and repeat.
* If the program still doesn’t compile, the error must be in the code that remains. Delete about half of the remaining code and repeat.

2. **Print statements for the rescue**: `Use System.out.println()` to check variable/return values at various points throughout the program.

