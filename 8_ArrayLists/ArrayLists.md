# ArrayLists

## Notes

When we work with arrays in Java, we’ve been limited by the fact that once an array is created, it has a fixed size. 
We can’t add or remove elements.

To create mutable and dynamic lists, we can use Java’s ArrayLists. ArrayLists allow us to:

- Store object references as elements
- Store elements of the same type (just like arrays)
- Access elements by the index (just like arrays)
- Add elements
- Remove elements

To use an ArrayList at all, we need to import them from Java’s util package:

```
import java.util.Arrays;
```

## Creating Array Lists

To create an ArrayList, we need to declare the type of objects it will hold, just as we do with arrays:

```
ArrayList<String> babyNames;
```

We use angle brackets `<` and `>` to declare the type of the ArrayList. 

These symbols are used for generics. 

Generics are a Java construct that allows us to define classes and objects as parameters of an ArrayList. 

For this reason, we can’t use primitive types in an ArrayList:

```
// This code won't compile:
ArrayList<int> ages;
 
// This code will compile:
ArrayList<Integer> ages;
```

```
// Declaring:
ArrayList<Integer> ages;

// Initializing:
ages = new ArrayList<Integer>();
 
// Declaring and initializing in one line:
ArrayList<String> babyNames = new ArrayList<String>();
```

## Adding an item

ArrayList comes with an `add()` method which inserts an element into the structure. There are two ways we can use `add()`.

If we want to add an element to the end of the ArrayList, we’ll call add() using only one argument that represents the value we are inserting. In this example, we’ll add objects from the Car class to an ArrayList called carShow:

ArrayList<Car> carShow = new ArrayList<Car>();

```
carShow.add(ferrari);
// carShow now holds [ferrari]
carShow.add(thunderbird);
// carShow now holds [ferrari, thunderbird]
carShow.add(volkswagon);
// carShow now holds [ferrari, thunderbird, volkswagon]
```

If we want to add an element at a specific index of our ArrayList, we’ll need two arguments in our method call: the first argument will define the index of the new element while the second argument defines the value of the new element:

```
// Insert object corvette at index 1
carShow.add(1, corvette);
// carShow now holds [ferrari, corvette, thunderbird, volkswagon]
 
// Insert object porsche at index 2
carShow.add(2, porsche);
// carShow now holds [ferrari, corvette, porsche, thunderbird, volkswagon]
```

By inserting a value at a specified index, any elements that appear after this new element will have their index value shift over by 1.

Also, note that an error will occur if we try to insert a value at an index that does not exist.

## ArrayList Typing

When using ArrayList methods (like add()), the reference parameters and return type of a method must match the declared element type of the ArrayList. For example, we cannot add an Integer type value to an ArrayList of String elements.

We’ve discussed how to specify the element type of an ArrayList; however, it is possible to create an ArrayList that holds values of different types.

In the following snippet, assortment is an ArrayList that can store different values because we do not specify its type during initialization.

```
ArrayList assortment = new ArrayList<>();
assortment.add("Hello"); // String
assortment.add(12); // Integer
assortment.add(ferrari); // reference to Car
// assortment holds ["Hello", 12, ferrari]
```

In this case, the items stored in this ArrayList will be considered Objects. As a result, they won’t have access to some of their methods without doing some fancy casting. Although this type of ArrayList is allowed, using an ArrayList that specifies its type is preferred.

## Accessing an Index

With arrays, we can use bracket notation to access a value at a particular index:

```java
double[] ratings = {3.2, 2.5, 1.7};
 
System.out.println(ratings[1]);
```

For ArrayLists, bracket notation won’t work. Instead, we use the method get() to access an index:

```java
ArrayList<String> shoppingCart = new ArrayList<String>();
 
shoppingCart.add("Trench Coat");
shoppingCart.add("Tweed Houndstooth Hat");
shoppingCart.add("Magnifying Glass");
 
System.out.println(shoppingCart.get(2));
```

## Changing a Value

When we were using arrays, we could rewrite entries by using bracket notation to reassign values:

```java
String[] shoppingCart = {"Trench Coat", "Tweed Houndstooth Hat", "Magnifying Glass"};
 
shoppingCart[0] = "Tweed Cape";
 
// shoppingCart now holds ["Tweed Cape", "Tweed Houndstooth Hat", "Magnifying Glass"]
```

ArrayList has a slightly different way of doing this, using the set() method:

```java
ArrayList<String> shoppingCart = new ArrayList<shoppingCart>();
 
shoppingCart.add("Trench Coat");
shoppingCart.add("Tweed Houndstooth Hat");
shoppingCart.add("Magnifying Glass");
 
shoppingCart.set(0, "Tweed Cape");
 
// shoppingCart now holds ["Tweed Cape", "Tweed Houndstooth Hat", "Magnifying Glass"]
```

## Removing a Value

What if we wanted to get rid of an entry altogether? For arrays, we would have to make a completely new array without the value.

Luckily, ArrayLists allow us to remove an item by specifying the index to remove:

```java
ArrayList<String> shoppingCart = new ArrayList<String>();
 
shoppingCart.add("Trench Coat");
shoppingCart.add("Tweed Houndstooth Hat");
shoppingCart.add("Magnifying Glass");
 
shoppingCart.remove(1);
// shoppingCart now holds ["Trench Coat", "Magnifying Glass"]
```

## Getting an item's index

What if we had a really large list and wanted to know the position of a certain element in it? For instance, what if we had an ArrayList detectives with the names of fictional detectives in chronological order, and we wanted to know what position "Fletcher" was.

```java
// detectives holds ["Holmes", "Poirot", "Marple", "Spade", "Fletcher", "Conan", "Ramotswe"];
System.out.println(detectives.indexOf("Fletcher"));

// 4
```