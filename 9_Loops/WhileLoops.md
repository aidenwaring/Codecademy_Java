# While Loops

## Notes

Like an if statement, the code inside a while loop will only run if the condition is true. However, a while loop will continue running the code over and over until the condition evaluates to false.

```
while (x > 10) {
// do things
}
```

```java
// set attempts to 0
int attempts = 0;
 
// enter loop if condition is true
while (passcode != 0524 && attempts < 4) {
 
  System.out.println("Try again.");
  passcode = getNewPasscode();
  attempts += 1;
 
  // is condition still true?
  // if so, repeat code block
}
// exit when condition is not true
```

## Increment While Loops

When looping through code, it’s common to use a counter variable. A counter (also known as an iterator) is a variable used in the conditional logic of the loop and (usually) incremented in value during each iteration through the code.

```
// counter is initialized
int wishes = 0;
 
// conditional logic uses counter
while (wishes < 3) {
 
  System.out.println("Wish granted.");
  // counter is incremented
  wishes++;
 
}
```

We can also decrement counters.

Example:

```java
class Coffee {
  
  public static void main(String[] args) {
    
    // initialize cupsOfCoffee
    int cupsOfCoffee = 1;
    
    // add while loop with counter
    while (cupsOfCoffee <= 100) {
      System.out.println("Fry drinks cup of coffee #" + cupsOfCoffee);
      cupsOfCoffee++;
      }
  }
}
```

## Break and continue

If we ever want to exit a loop before it finishes all its iterations or want to skip one of the iterations, we can use the break and continue keywords.

The break keyword is used to exit, or break, a loop. Once break is executed, the loop will stop iterating. For example:

```
for (int i = 0; i < 10; i++) {
  System.out.println(i);
  if (i == 4) {
    break;
  }
}

```

The continue keyword can be placed inside of a loop if we want to skip an iteration. If continue is executed, the current loop iteration will immediately end, and the next iteration will begin. 

```
int[] numbers = {1, 2, 3, 4, 5};
 
for (int i = 0; i < numbers.length; i++) {
  if (numbers[i] % 2 == 0) {
    continue;
  }
  System.out.println(numbers[i]);
}
```

When continue is hit, this skips the rest of that iteration, so the print line is skipped.
This shows only odd numbers returned.

