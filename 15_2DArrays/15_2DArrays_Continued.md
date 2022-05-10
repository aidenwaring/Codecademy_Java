# 2D Arrays Continued

## Traversing 2D Arrays: Introduction

In the last exercise, we reviewed how to use nested loops as well as how to iterate through regular arrays using loops. In this exercise, we will apply that knowledge in order to learn how to traverse 2D arrays.

Traversing 2D arrays using loops is important because it allows us to access many elements quickly, access elements in very large 2D arrays, and even access elements in 2D arrays of unknown sizes.

Let’s remember the structure of 2D arrays in Java:

```
char[][] letterBlock = {{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j', 'k', 'l'}};
```


```java
public class Introduction {
	public static void main(String[] args) {
		//Given the provided 2d array
		int[][] intMatrix = {
				{ 4,  6,  8, 10, 12, 14, 16},
				{18, 20, 22, 24, 26, 28, 30},
				{32, 34, 36, 38, 40, 42, 44},
				{46, 48, 50, 52, 54, 56, 58},
				{60, 62, 64, 66, 68, 70, 79}
		};
		// Store the number of subarrays of intMatrix into a variable called 'numSubArrays'
		int numSubArrays = intMatrix.length;
		// Store the length of the subarrays using the first subarray in intMatrix. Store it in a variable called subArrayLength.
		int subArrayLength = intMatrix[0].length;
    
		// Store the number of columns in intMatrix into a variable called 'columns'
		int columns = subArrayLength;

		// Store the number of rows in intMatrix into a variable called 'rows'
		int rows = numSubArrays;
    
		// Replace the outer and inner for loop headers to iterate through the entire 2D array. Use the iterators `i` for the outer loop and `j` for the inner loop.
		int sum = 0;
		for(int i=0; i<intMatrix.length; i++) {
			for(int j = 0; j < intMatrix[i].length; j++) {
				// Insert a line of code to increase the variable `sum` by each accessed element
				sum+=intMatrix[i][j];
			}
		}
		System.out.println(sum);
	}
}

```

## Traversing 2D Arrays: Practicing with Loops


```java
public class LoopPractice {
	public static void main(String[] args) {
		String[][] wordData = {{"study", "consider", "examine", "learn"}, {"ponder", "read", "think", "cogitate"}};
		
		//Use nested enhanced for loops to calculate the total number of characters in the wordData 2D array and print the result to the console. (Get the string .length() of each element)
		int characterCount = 0;

    for (String[] wordRow : wordData) {
      for (String word: wordRow) {
        characterCount += word.length();
      }
    }

		System.out.println(characterCount);
		
		//Using nested while loops, iterate through all of the elements in the 2D array and print them to the console using the format: word [row][column]. The formatted print statement has been provided.

    int i = 0, j = 0;
		
    while (i < wordData.length) {
      j = 0;
      while (j < wordData[i].length) {
        System.out.println(wordData[i][j] + ": [" + i + "]" + "[" + j + "]");
        j++;
      }
      i++;
    }

	}
}
```

## Traversing 2D Arrays: Row-Major Order

```java
public class RowMajor {
	public static void main(String[] args) {
		// Given runner lap data
		double[][] times = {{64.791, 75.972, 68.950, 79.039, 73.006, 74.157}, {67.768, 69.334, 70.450, 67.667, 75.686, 76.298}, {72.653, 77.649, 74.245, 62.121, 63.379, 79.354}};
		
		// Replace the incorrect for loop headers, use the iterators 'outer' and 'inner' for the outer and inner loops
		double runnerTime = 0.0;
		for(int outer = 0; outer < times.length; outer++) {
			runnerTime = 0.0;
			for(int inner = 0; inner < times[outer].length; inner++) {
        System.out.println("Runner index: " + outer + ", Time index: " + inner);
				// Enter the missing line of code to sum up the values in each row. Use the variable runnerTime
				runnerTime+=times[outer][inner];
        
			}
			// Enter the missing line of code to find the average time of each runner. Use the variable averageVal
      double averageVal = 0;
      averageVal = runnerTime / times[outer].length;
			System.out.println("Sum of runner " + outer + " times: " + runnerTime);
			System.out.println("Average of runner " + outer + ": " + averageVal);
		}
	}
}
```

## Traversing 2D Arrays: Column-Major Order

```java
public class ColumnMajor {
	public static void main(String[] args) {
    // Given runner lap data
		double[][] times = {{64.791, 75.972, 68.950, 79.039, 73.006, 74.157}, {67.768, 69.334, 70.450, 67.667, 75.686, 76.298}, {72.653, 77.649, 74.245, 62.121, 63.379, 79.354}};
		
		// Replace the incorrect for loop headers, use the iterators 'outer' and 'inner' for the outer and inner loops
		double lapTime = 0.0;
		for(int outer = 0; outer < times[0].length; outer++){
			lapTime = 0.0;
			for(int inner = 0; inner < times.length; inner++){
				System.out.println("Lap index: " + outer + ", Time index: " + inner);
				// Enter the missing line of code to sum up the values in each column. Use the variable lapTime
				lapTime+=times[inner][outer];
        
			}
			// Enter the missing line of code to find the average time of each lap. Use the variable averageVal
			double averageVal = 0;
			averageVal = lapTime / times.length;
			System.out.println("Sum of lap " + outer + " times: " + lapTime);
			System.out.println("Average time for lap " + outer + ": " + averageVal);
		}
	}
}
```

## Combining Traversal and Conditional Logic

```java
import java.util.Arrays;
public class Combining {
	public static void main(String[] args) {
		int[][] imageData={{100,90,255,80,70,255,60,50},
							         {255,10,5,255,10,5,255,255},
							         {255,255,255,0,255,255,255,75},
							         {255,60,30,0,30,60,255,255}};
		
		//First, we want to crop the image down to a 4x6 image, removing the right 2 columns. Declare and initialize a new 2D array of integers with 4 rows and 6 columns called `newImage`.
		int[][] newImage = new int[4][6];
		
    
		//Now that you have your empty image, use nested **for** loops to copy over the data from the original image to the new image, make sure not to include the cropped out columns.
		for(int i=0; i<newImage.length; i++){
      for(int j=0; j<newImage[i].length; j++){
        newImage[i][j] = imageData[i][j];
      }
    }
		
		System.out.println(Arrays.deepToString(newImage));
	
		//You want to decrease the brightness of the new image by 50 units. The way this works is that for every integer in the new 2D array, we will subtract the value by 50. Remember that the value range for the pixel is 0-255, so if the result tries to go below 0, just set it equal to 0.
		for(int i=0; i<newImage.length; i++){
      for(int j=0; j<newImage[i].length; j++){
        if(newImage[i][j]-50<0){
          newImage[i][j] = 0;
        }
        else{
          newImage[i][j]-=50;
        }
      }
    }
		
		System.out.println(Arrays.deepToString(newImage));
	}
}
```

## 2D Array Review

```java
import java.util.Arrays;
public class Review {
  public static void main(String[] args) {  

    //First, declare and initialize a 4x3 2D array of doubles called `scores` which will contain the exam data for four students. The rows will represent the student and the columns will represent the exam number. You already know the first exam scores (80.4, 96.2, 100.0, 78.9). Use initializer lists to store the first exam scores in the first column and -1 for the remaining exams. Use the provided print statement to print the result in the console.
  double[][] scores = {{80.4, -1, -1}, {96.2, -1, -1}, {100.0, -1, -1}, {78.9, -1, -1}} ;


  System.out.println(Arrays.deepToString(scores));

  //The next set of exams have occurred. Using 4 lines of code, manually enter the scores (89.7, 90.5, 93.6, 88.1) for the second exam (column 1). Use the provided print statement to print the updated 2D array as well.
  scores[0][1] = 89.7;
  scores[1][1] = 90.5;
  scores[2][1] = 93.6;
  scores[3][1] = 88.1;

  System.out.println(Arrays.deepToString(scores));
    
  //You have realized that you will only be keeping track of 2 exam grades instead of 3. Declare and initialize an empty 4x2 2D array of double values  called newScores
  double[][] newScores = new double[4][2];


  //Using loops, copy all of the scores for exam 1 and 2 into the new 2D array. (do not include the -1 values)
  for(int i = 0; i < newScores.length; i++){
    for(int j = 0; j < newScores[i].length; j++){
      newScores[i][j] = scores[i][j];
    }
  }

  System.out.println(Arrays.deepToString(newScores));

  //You have allowed the students to complete an extra credit activity to contribute towards their scores. For all exam grades less than 90, add 2 additional points to the grade in `newScores`
  for(int i = 0; i < newScores.length; i++){
    for(int j = 0; j < newScores[i].length; j++){
      if(newScores[i][j]<90){
        newScores[i][j]+=2;
      }
    }
  }

  System.out.println(Arrays.deepToString(newScores));
  }
}
```