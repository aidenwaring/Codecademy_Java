# For Loops

## Notes

Incrementing with loops is actually so common in programming that Java (like many other programming languages) includes syntax specifically to address this pattern: for loops.

A for loop header is made up of the following three parts, each separated by a semicolon:

1. The initialization of the loop control variable.
2. boolean expression.
3. increment or decrement statement.

```
for (int i = 0; i < 5; i++) {
 
  // code that will run
 
}
```

```java
class Coffee {
  
  public static void main(String[] args) {
    
    for (int cupsOfCoffee = 1; cupsOfCoffee <= 100; cupsOfCoffee++) {
      System.out.println("Fry drinks cup of coffee #" + cupsOfCoffee);
        }
    }
}
```

## Iterating over Arrays and ArrayLists

We can increment through the array or ArrayList using its indices.

In order to traverse an array or ArrayList using a loop, we must find a way to access each element via its index. We may recall that for loops are created with a counter variable. We can use that counter to track the index of the current element as we iterate over the list of data.

```
for (int i = 0; i < secretCode.length; i++) {
  // Increase value of element value by 1
  secretCode[i] += 1;
}
```

