TWO DIMENTIONAL ARRAYS

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

## MULTIPLICATION TABLE

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


