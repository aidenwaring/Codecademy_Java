# Intro

## Java Introduction 1/7

Welcome to the world of Java programming!

Programming languages enable humans to write instructions that a computer can perform. With precise instructions, computers coordinate applications and systems that run the modern world.

Sun Microsystems released the Java programming language in 1995. Java is known for being simple, portable, secure, and robust. Though it was released over twenty years ago, Java remains one of the most popular programming languages today.

One reason people love Java is the Java Virtual Machine, which ensures the same Java code can be run on different operating systems and platforms. Sun Microsystems’ slogan for Java was “write once, run everywhere”.

Java Virtual Machine running Java on three different platforms

![img1](/assets/img1.png)

Programming languages are composed of syntax, the specific instructions which Java understands. We write syntax in files to create programs, which are executed by the computer to perform the desired task.

```java
public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
```

### Hello Java File! 2/7

Java runs on different platforms, but programmers write it the same way. Let’s explore some rules for writing Java.

In the last exercise, we saw the file HelloWorld.java. Java files have a .java extension. Some programs are one file, others are hundreds of files!

Inside HelloWorld.java, we had a class:

```java
public class HelloWorld {

}
```

We’ll talk about classes more in the future, but for now think of them as a single concept.

The HelloWorld concept is: Hello World Printer. Other class concepts could be: Bicycle, or: Savings Account.

We marked the domain of this concept using curly braces: {}. Syntax inside the curly braces is part of the class.

Each file has one primary class named after the file. Our class name: HelloWorld and our file name: HelloWorld. Every word is capitalized.

Inside the class we had a main() method which lists our program tasks:

```java
public static void main(String[] args) {

}
```

Like classes, we used curly braces to mark the beginning and end of a method.

public, static, and void are syntax we’ll learn about in future lessons. String[] args is a placeholder for information we want to pass into our program. This syntax is necessary for the program to run but more advanced than we need to explore at the moment.

Our program printed “Hello World” with the line:

```java
System.out.println("Hello World");
```

println is short for “print line”. We’ll use System.out.println() whenever we want a program to write a message to the screen.

```java
public class HelloYou {
    public static void main(String[] args) {
      System.out.println("Hello Aiden!");
    }
  }
```

### Commenting Code 3/7

Writing code is an exciting process of instructing the computer to complete fantastic tasks.

Code is also read by people, and we want our intentions to be clear to humans just like we want our instructions to be clear to the computer.

Fortunately, we’re not limited to writing syntax that performs a task. We can also write comments, notes to human readers of our code. These comments are not executed, so there’s no need for valid syntax within a comment.

When comments are short we use the single-line syntax: `//`.

`// calculate customer satisfaction rating`

When comments are long we use the multi-line syntax: `/*` and `*/`.

`/* We chose to store information across multiple databases to minimize the possibility of data loss. We'll need to be careful to make sure it does not go out of sync! */`

```java
public class CommentExample {
  // I'm a comment inside the class
  public static void main(String[] args) {
    // I'm a comment inside a method
    System.out.println("This program has comments!");
  }
}
```

```java
public class Timeline {
  public static void main(String[] args) {
    System.out.println("Hello Java!");

    System.out.println("You were born in 1995");

    // Sun Microsystems announced the release of Java in 1995

    System.out.println("You were created by James Gosling");

		/*
    James Gosling is a Canadian engineer who
		created Java while working at Sun       Microsystems.
		His favorite number is the square root of 2!
    */

    System.out.println("You are a fun language!");
  }
}
```

### Semicolons and White Space 4/7

Java does not interpret whitespace, the areas of the code without syntax, but humans use whitespace to read code without difficulty.

Java does interpret semicolons. Semicolons are used to mark the end of a statement, one line of code that performs a single task.

Let’s contrast statements with the curly brace, `{}`. Curly braces mark the scope of our classes and methods. There are no semicolons at the end of a curly brace.

```java
public class LanguageFacts {
    public static void main(String[] args) {
      System.out.println("Java is a class-based language.");
      System.out.println("Java classes have a 'main' method.");
      System.out.println("Java statements end with a semicolon.");
      System.out.println("Programming is awesome.");
    }
  }
```

### Compilation: Catching Errors 5/7

Java is a compiled programming language, meaning the code we write in a .java file is transformed into byte code by a compiler before it is executed by the Java Virtual Machine on your computer.

A compiler is a program that translates human-friendly programming languages into other programming languages that computers can execute.

![img2](/assets/img2.png)

The compiling process catches mistakes before the computer runs our code.

The Java compiler runs a series of checks while it transforms the code. Code that does not pass these checks will not be compiled.

For example, with a file called Plankton.java, we could compile it with the terminal command:

`javac Plankton.java`

A successful compilation produces a .class file: Plankton.class, that we execute with the terminal command:

`java Plankton`

An unsuccessful compilation produces a list of errors. No .class file is made until the errors are corrected and the compile command is run again.

### Compilation: Creating Executables 6/7

If the file compiles successfully, this command produces an executable class: FileName.class. Executable means we can run this program from the terminal by writing:

`java Plankton`

Note that we leave off the .class part of the filename.

Here’s a full compilation cycle as an example:

```java
// within the file: Welcome.java
public class Welcome {
  public static void main(String[] args) {
    System.out.println("Welcome to Codecademy's Java course!");
  }
}
```

We have one file: Welcome.java. We compile with the command:

`javac Welcome.java`

The terminal shows no errors, which indicates a successful compilation.

We now have two files:

1. Welcome.java, our original file with Java syntax.
2. Welcome.class, our compiled file with Java bytecode, ready to be executed by the Java Virtual Machine.

`java Welcome`

The following is printed to the screen:

`Welcome to Java!`

![img3](/assets/img3.png)

### Java Review: Putting it all together 7/7

We’ve also learned rules and guidelines for how to write Java programs:

- Java programs have at least one class and one main() method.
  - Each class represents one real-world idea.
  - The main() method runs the tasks of the program.
- Java comments add helpful context to human readers.
- Java has whitespace, curly braces, and semicolons.
  - Whitespace is for humans to read code easily.
  - Curly braces mark the scope of a class and method.
  - Semicolons mark the end of a statement.
- Java is a compiled language.
  - Compiling catches mistakes in our code.
  - Compilers transform code into an executable class.

```java
public class First {
  public static void main(String[] args) {
    // The main method executes the tasks of the class
    System.out.println("My first Java program from scratch!");
  }
}
```
