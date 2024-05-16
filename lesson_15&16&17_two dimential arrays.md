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
    int count = 1;

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        array[i][j] = i*array.length+j+1;
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }

}
``` 

# LESSON 16

Reference type vs value type.

```Java
public class Main {
    public static void main(String[] args) {
        int number = 20;
        number = changeNumber(number);
        System.out.println(number);
        
        int numberVoid = 20;
        changeNumberVoid(numberVoid);
        System.out.println(numberVoid);
    }

    public static int changeNumber(int number){
        number = 55;
        return number;
    }

    public static void changeNumberVoid(int number){
        number = 55; //THIS NUMBER WILL NOT CHANGE THE numberVoid value
    }
}
```


```Java
    public class Main {
    public static void main(String[] args) { // Main method
        int[] array = { 1, 2, 3, 4, 5 }; // 1. declare an array
        array = changeArray(array); // 2. change the content of the array
        printOutArray(array); // 3. print out the values of the array

        int[] arrayVoid = { 1, 2, 3, 4, 5 }; // 4
        changeArrayVoid(arrayVoid); // 5
        printOutArray(arrayVoid); //6
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
```

array is a reference type, whatever changes you do are globally. its not the same for numbers.


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
