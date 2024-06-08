## TWO DIMENTIONAL ARRAYS

```Java



public class Main {
  public static void main(String[] args) {
     // this is one dimentional array
    int[] oneDimentionalArray = {45, 47, 3, 5, 10, 13};
    for(int i = 0; i < oneDimentionalArray.length; i++){
      System.out.println(oneDimentionalArray[i]);
    }
    
    // this is TWO dimentional array
    int[][] array = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    for(int i = 0; i < array.length; i++){
        //array[0] = {1, 2, 3}
        //array[0].length = 3
        int[] row = array[i]; // {1, 2, 3} OR {4, 5, 6} OR, {7, 8, 9}
        for(int j = 0; j < row.length; j++){ // processing rows here
            System.out.print(row[j]); // printing out column value of the row. print every value of the row.
        }
        //System.out.print(" | "); // print = all in same line = 123 | 456 | 789 |
       System.out.println(); // gives each in new line. the row is over now, lets go to next row. this literally just print out an "enter", just goes to next line. 


    }  

   
  }

}
```

# MULTIPLICATION TABLE

```Java
public class Main {
    public static void main(String[] args) {
        int[][] array = new int[10][10];

        for (int i = 0; i < array.length; i++) {
            int[] row = array[i];
            for (int j = 0; j < row.length; j++) {
                row[j] = i*j;
            }
        }

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j] < 10){
                    System.out.print(array[i][j] + "  ");
                }
                else{
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
```

# homework

```Java 
import java.util.Arrays;
import java.util.Random;

public class Main {
  public static void main(String[] args) {

    int[][] array = new int[5][5];
    //int count = 1;

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        array[i][j] = i*array.length+j+1; // or simply  array[i][j] = count++; // = count = count +1;
// this this more complicated one we are making too many actions
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }

}
```

Dont ever use i++ or j++ outside the for loop. 

# LESSON 16

Reference type vs value type

one is written: array = changeArray(array)
other one : changeArray(array)


```Java
public class Main {
    public static void main(String[] args) {
        int number = 20;
        number = changeNumber(number);
        System.out.println(number); // the result here is 55
        
        int numberVoid = 20;
        changeNumberVoid(numberVoid);
        System.out.println(numberVoid); // result = 20
    }

    public static int changeNumber(int number){
        number = 55;
        return number;
    }

    public static void changeNumberVoid(int number){
        number = 55; //THIS NUMBER WILL NOT CHANGE THE numberVoid value, because we dont have "return"
    }
}

// this is Value type!
```


```Java
// this is a reference type

    public class Main {
    public static void main(String[] args) { // Main method
        int[] array = { 1, 2, 3, 4, 5 }; // 1. declare an array
        array = changeArray(array); // 2. change the content of the array. we reasign the value of array
        printOutArray(array); // 3. print out the values of the array

        int[] arrayVoid = { 1, 2, 3, 4, 5 }; // 4
        changeArrayVoid(arrayVoid); // 5 // it still changes due to this how its written here
        printOutArray(arrayVoid); //6
// here we are not tehcnically changing the array bcs we dont have return in the functions. but it does change. It is possible to change the array without returning it in the function.

    }

    public static int[] changeArray(int[] array) { // 2
        for (int i = 0; i < array.length; i++) { // 2.1.
            array[i] = 0; // 2.2 here we say all elements are 0??
        } // 2.3
        return array; // 2.4
    }

    public static void changeArrayVoid(int[] array) { //5
        for (int i = 0; i < array.length; i++) { // 5.1
            array[i] = 1; // 5.2
        }// 5.3
    }

    public static void printOutArray(int[] array) { // 3 // 6
        for (int i = 0; i < array.length; i++) { // 3.1 //6.1
            System.out.println(array[i]);// 3.2 // 6.2
        } // 3.3 // 6.3
    }
}
// 2.1. ... steps how the code works

// this is a reference type
```

Array is a reference type, whatever changes you do are globally, until its in the scope of the array. its not the same for changing numbers.
For integer, boolean, float, its mandatory to return to reasign value. but if we change the array, then we dont need to return the value, bcs when we are using the array, we are actually using a reference to the memory, to the array in the memory. so our varaible doest contain the array, it just contains the reference of it. 

Example 2

```Java
public class Main {
    public static void main(String[] args) {

        int[]arrayVoid = {1, 2, 3, 4, 5};

        int[] array = arrayVoid;
        array[0] = 100;
        printOutArray(arrayVoid);
      
    }

  
    public static void printOutArray(int[] array){ 
        for(int i = 0; i < array.length; i++){ 
            System.out.println(array[i]);
        }
    }
}
// Reference type
``` 

```Java
public class Main {
    public static void main(String[] args) { //Main method

        int[]arrayVoid = {1, 2, 3, 4, 5};
        int[] array2 = new int[5];
        array2[0] = 1;
        array2[1] = 2;
        array2[2] = 3;
        array2[3] = 4;
        array2[4] = 5;

        System.out.print(arrayVoid == array2);
    }

}
// Reference type

// result is false. bcs its not comparing the values of the array but the reference.
```

```Java
public class Main {
    public static void main(String[] args) { //Main method

        int[]arrayVoid = {1, 2, 3, 4, 5};
        int[]array2 = arrayVoid;
        array2[0] = 123; // its going to change the value for both of them
    
        System.out.println(arrayVoid == array2);
        System.out.println(arrayVoid[0]);
        System.out.println(array2[0]);
    }

}
// Reference type

// result is true now

```

Its like two people with the same name are not the same. the object is different but the values are the same. 
In reference tupe everywhere where you use the array it will be the same value. It is not the case in the value type.


```Java

```

all primitives + string are value types. 

![Screenshot 2024-06-08 at 18 37 00](https://github.com/elinasasa/wotech/assets/165931766/480801cc-25f2-48e5-a16b-7fbc92665f4f)


## tic tac toe

```Java
import java.util.Scanner;

public class SimpleGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = 5; // You can change the size of the array as needed
        int cols = 5;
        int[][] grid = new int[rows][cols];

        while (true) {
            // Print the current state of the grid
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(grid[i][j] + " ");
                }
                System.out.println();
            }

            // Ask user for row and column
            System.out.println("Enter row (0 to " + (rows - 1) + "): ");
            int row = scanner.nextInt();
            System.out.println("Enter column (0 to " + (cols - 1) + "): ");
            int col = scanner.nextInt();

            // Check if the input is within bounds
            if (row >= 0 && row < rows && col >= 0 && col < cols) {
                grid[row][col] = 1;

                // Check if the specified row contains all 1s
                boolean won = true;
                for (int j = 0; j < cols; j++) {
                    if (grid[row][j] != 1) {
                        won = false;
                        break;
                    }
                }

                if (won) {
                    System.out.println("Congratulations! You've won!");
                    break;
                }
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }

        scanner.close();
    }
}

```
