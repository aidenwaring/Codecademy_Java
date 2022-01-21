# Variables

## Introduction 1/9

We store information in variables, named locations in memory.

In Java, we specify the type of information we’re storing. Primitive datatypes are types of data built-in to the Java system.

```java
// datatype variableName
int age;
double salaryRequirement;
boolean isEmployed;
```

```java
public class Creator {
	public static void main(String[] args) {
    String name = "James Gosling";
    int yearCreated = 1995;
    System.out.println(name);
    System.out.println(yearCreated);
	}
}
```

### ints 2/9

`ints` hold positive numbers, negative numbers, and zero. They do not store fractions or numbers with decimals in them.

### Doubles 3/9

`double` can hold decimals as well as very large and very small numbers.

```java
public class MarketShare {
	public static void main(String[] args) {
            double androidShare = 81.7;
            System.out.println(androidShare);
	}
}
```

### Booleans 4/9

```java
public class Booleans {
	public static void main(String[] args) {
            boolean intsCanHoldDecimals = false;
            System.out.println(intsCanHoldDecimals);
	}
}
```

### char 5/7

The `char` data type can hold any character, like a letter, space, or punctuation mark.

It must be surrounded by single quotes, `'`

```java
public class Char {
	public static void main(String[] args) {   
    char expectedGrade = 'A';
    System.out.println(expectedGrade);
	}
}
```

### String  6/9

So far, we have learned primitive data types, which are the simplest types of data with no built-in behavior. Our programs will also use `Strings`, which are objects, instead of primitives. Objects have built-in behavior.

```java
public class Song {
	public static void main(String[] args) {   
    String openingLyrics = "Yesterday, all my troubles seemed so far away";
    System.out.println(openingLyrics);
	}
}
```

### Static Checking 7/9

The Java programming language has static typing. Java programs will not compile if a variable is assigned a value of an incorrect type.

```java
int greeting = "Hello World";
```

Will result in:

```
error: incompatible types: String cannot be converted to int
int greeting = "Hello World";
```

When bugs are not caught at compilation, they interrupt execution of the code by causing runtime errors. The program will crash.

Java’s static typing helps programmers avoid runtime errors, and thus have much safer code that is free from bugs.


### Naming 8/9

Naming variables according to convention leads to clear, readable, and maintainable code. When someone else, or our future self, reads the code, there is no confusion about the purpose of a variable.

Variable names of only one word are spelled in all lowercase letters. Variable names of more than one word have the first letter lowercase while the beginning letter of each subsequent word is capitalized. This style of capitalization is called camelCase.

### Review 9/9

We covered:

- int, which stores whole numbers.
double, which stores bigger whole numbers and decimal numbers.
- boolean, which stores true and false.
- char, which stores single characters using single quotes.
- String, which stores multiple characters using double quotes.
- Static typing, which is one of the safety features of Java.
- Variable naming conventions.

