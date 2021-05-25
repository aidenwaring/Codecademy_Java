# String Methods

The String class has a lot of useful methods to help us perform operations on Strings and data manipulation. 
We don’t have to import anything to use the String class because it’s apart of the java.lang package which is available by default.

Let's get introduced to:

* length()
* concat()
* equals()
* indexOf()
* charAt()
* substring()
* toUpperCase() / toLowerCase()

## Length
The length() string method returns the length ⁠— total number of characters ⁠— of a String.

```
String str = "Hello World!";  
 
System.out.println(str.length());

//12
```



## Concat()

The concat() method concatenates one string to the end of another string.

Strings are immutable objects which means that String methods, like concat() do not actually change 
a String object. 

```java
String name = new String("Code");
 
name = name.concat("cademy");
 
System.out.println(name);
```

Prints 'Codecademy'.

```java
String name = "Code";
 
name.concat("cademy");
 
System.out.println(name);
```

Prints 'Code'.

Strings are immutable. The value of the string can't change, so we must create a new object and
assign the concatenated value to that.

When we use concat() on another String, we don’t concatenate its memory address to the original
String. Instead, we combine the result of its toString() method to the original String. 

```java
    String firstName = "Aiden";  
    String lastName = "Waring";

    System.out.println(firstName + " " .concat(lastName));
```

## Equals()

With objects, such as Strings, we can’t use the primitive equality operator == to check for equality
between two strings. To test equality with strings, we use a built-in method called equals().

```java
    String password = "correcthorsebatterystaple";
    System.out.println(password.equals("purplemonkeydishwasher"));
// false
    
```

## indexOf()

If we want to know the index of the first occurence of a character in a string, we can use the 
indexOf() method on a string.

```java
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println(alphabet.indexOf("C"));
//  2
```

Can also be done on substrings.

```java
String letters = "ABCDEFGHIJKLMN";
 
System.out.println(letters.indexOf("EFG"));
// 4, because EFG starts at index 4
```

If the indexOf() doesn’t find what it’s looking for, it’ll return a -1.

## charAt()

The charAt() method returns the character located at a String‘s specified index.

```java
String str = "qwer";
System.out.println(str.charAt(2));
// e
```

## substring()

```java
String line = "The Heav'ns and all the Constellations rung";
 
System.out.println(line.substring(24));
// Constellations rung
```

It would output Constellations rung because that’s what begins at index 24 and ends at the end of
line. The substring begins with the character at the specified index.

We can also specify a substring in the middle of a string between two indexes.

```java
String line = "The Heav'ns and all the Constellations rung";
System.out.println(line.substring(24, 38));
// Constellations
```

Substring starts at 24 and ends at 38.

## toUpperCase() / toLowerCase()

```java
String input = "Cricket!";
 
String upper = input.toUpperCase();
// stores "CRICKET!"
 
String lower = input.toLowerCase();
// stores "cricket!"
```

