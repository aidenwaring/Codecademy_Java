# 2D Arrays

## Declaration, Initialization, and Assignment

When declaring 2D arrays, the format is similar to normal, one-dimensional arrays, except that you include an extra set of brackets after the data type. 

In this example, `int` represents the data type, the first set of brackets `[]` represent an array, and the second set of brackets `[]` represent that we are declaring an array of arrays.

```
int [][] int2DArray;
```

When initializing arrays, we define their size. Initializing a 2D array is different because, instead of only including the number of elements in the array, you also indicate how many elements are going to be in the sub-arrays.

Here is an example of initializing an empty 2D array with 3 rows and 5 columns.

```
int[][] intArray;
intArray = new int[3][5];

// New 2D array with 3 rows with 5 columns.

//    [0,0,0,0,0]
//    [0,0,0,0,0]
//    [0,0,0,0,0]
```

If you already know what values are going to be in the 2D array, you can initialize it and write all of the values into it at once. We can accomplish this through initializer lists.

There are three situations in which we can use initializer lists for 2D arrays:

1. In the case where the variable has not yet been declared, we can provide an abbreviated form since Java will infer the data type of the values in the initializer lists: 

```
char[] charArray = {'a', 'b', 'c', 'd'};
```

2. If the variable has already been declared, you can initialise it by creating a `new` 2D array object with the initialiser list values:

```
String[][] stringValues;
stringValues = new String[][] {{"working", "with"}, {"2D", "arrays"}, {"is", "fun"}};
```

3. The previous method also applies to assigning a new 2D array to an existing 2D array stored in a variable.

```java
public class Exercise2 {
	public static void main(String[] args) {
    
    // Declare a 2d array of float values called floatTwoD
        float[][] floatTwoD;

    // Initialize the 2d array from the last step to an empty 2d array consisting of 4 arrays with 10 elements each
        floatTwoD = new float[4][10];

    // Declare and initialize an empty 2d array of integers consisting of 15 rows and 8 columns called dataChart
        int[][] dataChart = new int[15][8];
		
    // Create a 2D char array called ticTacToe representing the provided tic-tac-toe board. Use the characters 'X', 'O', and ' '.
        char[][] oldTwoD = new char[][] {{'X','O','O'},{'O','X',' '},{'X',' ','X'}};
		
    // When no one is looking, you want to modify the game to where you, 'O', wins the game. Replace the game board so that all X’s are O’s and all O’s are X’s. Do this in one line with initializer lists.
        char[][] ticTacToe = new char[][] {{'O','X','X'},{'X','O',' '},{'O',' ','O'}};
    
    }
}
```

## Accessing Elements in a 2D Array

Normal Array:

```
// Store the first element from the String array
String firstWord = words[0]; 
 
// Store the last element of the String array
String lastWord = words[words.length-1];
 
// Store an element from a different position in the array
String middleWord = words[2];
```

Now for 2D arrays, the syntax is slightly different. This is because instead of only providing a single index, we provide two indices. Take a look at this example:

```
// Given a 2D array of integer data
int[][] data = {{2,4,6}, {8,10,12}, {14,16,18}};
 
// Access and store a desired element 
int stored = data[0][2];
```

When accessing these elements, if either the row or column value is out of bounds, then an `ArrayIndexOutOfBoundsException` will be thrown by the application. 

```java
public class Exercise3 {
	public static void main(String[] args) {
		// Using the provided 2D array
	  int[][] intMatrix = {
				{1, 1, 1, 1, 1},
				{2, 4, 6, 8, 0},
				{9, 8, 7, 6, 5}
		};
    
		// Access the integer at the first row and fourth column of intMatrix and store it in a variable called retrievedInt
    int retrievedInt = intMatrix[0][3];

		// Print 3 times the center value of intMatrix to the console. Make sure to access the correct element!
    System.out.println(intMatrix[1][2] * 3);
    System.out.println(intMatrix[1][2] * 3);
    System.out.println(intMatrix[1][2] * 3);

    }
}
```

## Modifying Elements in a 2D Array

Normal Array:

```
storedArray[5] = 10;
// Assign the value 10 to the element at index 5
```

2D Array:

```
twoDArray[1][3] = 150;
// Assign the value 150 to the 2nd array's (index 1) 4th element (index 3)
```

```
int[][] intTwoD = new int[4][3];
// 4 rows, three columns each of 0

// [0,0,0]
// [0,0,0]
// [0,0,0]
// [0,0,0]
 
 
intTwoD[3][2] = 16;
intTwoD[0][0] = 4;
intTwoD[2][1] = 12;
intTwoD[1][1] = 8;

// [4,0,0]
// [0,8,0]
// [0,12,0]
// [0,0,16]
```

To print a 2D Array use:

`System.out.println(Arrays.deepToString(intMatrix));`

```java
import java.util.Arrays;
public class Modifying {
	public static void main(String[] args) {
		// Using the provided 2D array
	  int[][] intMatrix = {
				{1, 1, 1, 1, 1},
				{2, 4, 6, 8, 0},
				{9, 8, 7, 6, 5}
		};   
    
		// Replace the number 4 in the 2D array with the number 0
    intMatrix[1][1] = 0;

		// Declare and initialize a new empty 2x2 integer 2D array called subMatrix
		int[][] subMatrix = new int[2][2];

		// Using 4 lines of code, multiply each of the elements in the 2x2 top left corner of intMatrix by 5 and store the results in the subMatrix you created. Afterwards, uncomment the provided print statement below.
		subMatrix[0][0] = intMatrix[0][0] * 5;
		subMatrix[0][1] = intMatrix[0][1] * 5;
		subMatrix[1][0] = intMatrix[1][0] * 5;
		subMatrix[1][1] = intMatrix[1][1] * 5;


    
   System.out.println(Arrays.deepToString(subMatrix));
    }
}
```