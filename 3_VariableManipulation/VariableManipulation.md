# VariableManipulation

## Introduction 1/10

Java has built-in math operations that perform calculations on numeric values! 

```java
public class GuessingGame {
	public static void main(String[] args) {   
		int mystery1 = 8 + 6;
    int mystery2 = 8 - 6;
    System.out.println(mystery2);
	}
}
```

### Addition and Subtraction 2/10

```java
public class PlusAndMinus {
	public static void main(String[] args) {   
		int zebrasInZoo = 8;
    int giraffesInZoo = 4;
    int animalsInZoo = zebrasInZoo + giraffesInZoo;
    System.out.println(animalsInZoo);
    int numZebrasAfterTrade = zebrasInZoo - 2;
    System.out.println(numZebrasAfterTrade);
	}
}
```

### Multiplication and Division 2/10

Division has different results with integers. The / operator does integer division, which means that any remainder is lost.

```java
public class MultAndDivide {
	public static void main(String[] args) {   
		double subtotal = 30;
    double tax = 0.0875;
    double total = subtotal + subtotal * tax;
    System.out.println(total);
    double perPerson = total / 4;
    System.out.println(perPerson);
	}
}
```

### Modulo 4/10

If we baked 10 cookies and gave them out in batches of 3, how many would we have leftover after giving out all the full batches we could?

The modulo operator `%`, gives us the remainder after two numbers are divided.

```java
int cookiesBaked = 10;
int cookiesLeftover = 10 % 3;
//cookiesLeftover holds 1
```

```java
7 % 2
// 1, odd!
8 % 2
// 0, even!
9 % 2
// 1, odd!
```

```java
public class Modulo {
	public static void main(String[] args) {   
		int students = 26;
        int leftOut = students % 3;
        System.out.println(leftOut);
	}
}
```

### Greater Than and Less Than 5/10

```java
public class GreaterLessThan {
	public static void main(String[] args) {   
		double creditsEarned = 176.5;
    double creditsOfSeminar = 8;
    double creditsToGraduate = 180;
    System.out.println(creditsEarned > creditsToGraduate);
    double creditsAfterSeminar = creditsEarned + creditsOfSeminar;
    System.out.println(creditsToGraduate < creditsAfterSeminar);
	}
}
```

### Equals and Not Equals 6/10

We can use another relational operator to do this. `==` will tell us if two variables are equal.

Notice that the equality check is two equal signs, instead of one. One equal sign, `=`, is how we assign values to variables!

To check if two variables are not equal, we can use `!=`.

```java
public class EqualNotEqual {
	public static void main(String[] args) {   
		int songsA = 9;
    int songsB = 9;
    int albumLengthA = 41;
    int albumLengthB = 53;

    boolean sameNumberOfSongs = songsA == songsB;
    boolean differentLength = albumLengthA != albumLengthB;
	}
}
```

### Great/Less Than Equal To 7/10

How could we make sure we got paid at least the amount we expected in our paycheck? We could use greater than or equal to, `>=`, or less than or equal to, `<=`.

```java
public class GreaterThanEqualTo {
  	public static void main(String[] args){
      double recommendedWaterIntake = 8;
      double daysInChallenge = 30;
      double yourWaterIntake = 235.5;

      double totalRecommendedAmount = recommendedWaterIntake * daysInChallenge;
      boolean isChallengeComplete = yourWaterIntake >= totalRecommendedAmount;

      System.out.println(isChallengeComplete);
    }       
}
```

### .equals() 7/10

With objects, such as Strings, we can’t use the primitive equality operator. To test equality with Strings, we use a built-in method called `.equals()`.

```java
public class Song {
  	public static void main(String[] args){
      String line1 = "Nah nah nah nah nah nah nah nah nah yeah";
      String line2 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
      String line3 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";

      System.out.println(line1.equals(line2));
      System.out.println(line2.equals(line3));
    }       
}
```

### String Concatenation 9/10

The `+` operator, which we used for adding numbers together, can be used to concatenate Strings. In other words, we can use it to join two Strings together!

We can even use a primitive datatype as the second variable to concatenate, and Java will intelligently make it a String first.

```java
public class Zoo {
  	public static void main(String[] args){
      int animals = 12;
      String species = "zebra";
      String zooDescription = "Our zoo has " + animals + " " + species + "s!";
      System.out.println(zooDescription);
    }       
}
```

### Variable Manipulation Review 10/10

We covered:

- Addition and subtraction, using + and -
- Multiplication and division, using * and /
- The modulo operator for finding remainders, %
- Greater than, >, and less than, <
- Equal to, ==, and not equal to, !=
- Greater than or equal to, >=, and less than or equal to, <=
- equals() for comparing Strings and other objects
- Using + to concatenate Strings

```java
public class BankAccount {
  	public static void main(String[] args){
      double balance = 1000.75;
      double amountToWithdraw = 250;
      double updatedBalance = balance - amountToWithdraw;
      double amountForEachFriend = updatedBalance / 3;
      boolean canPurchaseTicket = amountForEachFriend >= amountToWithdraw;
      System.out.println(canPurchaseTicket);
      System.out.println("I gave each friend " + amountForEachFriend + "...");
    }       
}
```