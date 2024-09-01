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





# LESSON 17 

![Screenshot 2024-06-09 at 17 05 44 2](https://github.com/elinasasa/wotech/assets/165931766/65892170-14bd-431f-83b4-6f137e6d4daa)

Examples we can do with this language: mine sweeper, batleship game, labirinth, bingo
When we are developing such a grib, we dont use hard numbers, its always i and j. 

"Index out of bounds exception" - you are tying to add value to smth that doesnt exist. Error. 

Minesweeper game:

```Java
public class Main {
    public static void main(String[] args) { //Main method
        int size = 10;
        int [][] grid = new int [size][size];
        int bombColumn = 1;
        int bombRow = 1;


        grid[bombRow][bombColumn] = 5; //center
        grid[bombRow -1][bombColumn] = 1; // top middle
        grid[bombRow -1][bombColumn -1] = 1; // top left
        grid[bombRow -1][bombColumn +1] = 1; // top right

        grid[bombRow +1][bombColumn] = 1; // bottom middle
        grid[bombRow +1][bombColumn -1] = 1; // bottom left
        grid[bombRow +1][bombColumn +1] = 1; // bottom right

        grid[bombRow][bombColumn -1] = 1; // middle left
        grid[bombRow][bombColumn +1] = 1; // middle right
        
        
        printArray(grid,size);
        
    }

        // 1  1  1  0  0  0  0  
        // 1 -1  1  0  0  0  0  
        // 1  1  1  0  0  0  0  
        // 0  0  0  0  0  0  0  
        // 0  0  0  0  0  0  0 
        // ... times 10

    public static void printArray(int[][] array, int size){
        for(int i=0; i<size; i++){ // this is where we declare i
            for(int j=0; j<size; j++){ // declare j
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
        
    
}
```
integer default value is 0.



to access the 0 row, we need to use an If conditions ->
if we dont, then to access row 0 there would be bombRow - 1 = -1, which doesnt exist


```Java
public class Main {
    public static void main(String[] args) { //Main method
        int size = 10;
        int [][] grid = new int [size][size];
        int bombColumn = 1;
        int bombRow = 9;


        grid[bombRow][bombColumn] = 5; //center
        if(bombRow != 0){
            grid[bombRow -1][bombColumn] = 1; // top middle
            grid[bombRow -1][bombColumn -1] = 1; // top left
            grid[bombRow -1][bombColumn +1] = 1; // top right
        }
        if(bombRow != size -1){ // because array row start with 0
            grid[bombRow +1][bombColumn] = 1; // bottom middle
            grid[bombRow +1][bombColumn -1] = 1; // bottom left
            grid[bombRow +1][bombColumn +1] = 1; // bottom right
        } 
            
        grid[bombRow][bombColumn -1] = 1; // middle left
        grid[bombRow][bombColumn +1] = 1; // middle right
        
        
        printArray(grid,size);
        
    }

        // 1  1  1  0  0  0  0  
        // 1 -1  1  0  0  0  0  
        // 1  1  1  0  0  0  0  
        // 0  0  0  0  0  0  0  
        // 0  0  0  0  0  0  0 
        // ... times 10

    public static void printArray(int[][] array, int size){
        for(int i=0; i<size; i++){ // this is where we declare i
            for(int j=0; j<size; j++){ // declare j
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
        
    
}
```


FINAL CODE

```Java
public class Main {
    public static void main(String[] args) { //Main method
        int size = 10;
        int [][] grid = new int [size][size];
        int bombColumn = 9;
        int bombRow = 1;


        grid[bombRow][bombColumn] = 5; //center
        if(bombRow != 0){
            grid[bombRow -1][bombColumn] = 1; // top middle
            if(bombColumn != 0){
                grid[bombRow -1][bombColumn -1] = 1; // top left
            }
            if(bombColumn != size -1){
                grid[bombRow -1][bombColumn +1] = 1; // top right
            }
        }
        if(bombRow != size -1){ // because array row start with 0
            grid[bombRow +1][bombColumn] = 1; // bottom middle
            if(bombColumn != 0){
                grid[bombRow +1][bombColumn -1] = 1; // bottom left
            }
            if(bombColumn != size -1){
                grid[bombRow +1][bombColumn +1] = 1; // bottom right
            }
        } 
        if(bombColumn != 0){
            grid[bombRow][bombColumn -1] = 1; // middle left
        }
        if(bombColumn != size - 1){
            grid[bombRow][bombColumn +1] = 1; // middle right
        }
        
        printArray(grid,size);
        
    }

        // 1  1  1  0  0  0  0  
        // 1 -1  1  0  0  0  0  
        // 1  1  1  0  0  0  0  
        // 0  0  0  0  0  0  0  
        // 0  0  0  0  0  0  0 
        // ... times 10

    public static void printArray(int[][] array, int size){
        for(int i=0; i<size; i++){ // this is where we declare i
            for(int j=0; j<size; j++){ // declare j
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
        
    
}
```

