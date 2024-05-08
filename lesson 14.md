

``` Java

/*
what kinf od a place in a race you have?
[50, 47, 44]
 46

1. the biggest number is 1st place
2. the second gibbest number is 2nd place

 0  1  2  3  4  5 ..th place
[8  7  5  3  2  1] - need to add the 4 in the order
4 > number [i]


1. Go through the array - for loop
2. Find a number less than our number - if
    3. Increment index by 1 
    4. Return index
5. If we cant find the number that is less than our number
    6. Return total count + 1
*/

public class Main {
    public static void main(String[] args) {
        int[] arr = {8, 7, 5, 3, 2, 1}; // current race results
        int number = 4; // our result
        boolean thePlaceIsFound = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < number){
                i = i + 1;
                System.out.println("Our place in race: " + i);
                thePlaceIsFound = true;
                break;
            }
        }

        if(thePlaceIsFound == false){
            System.out.println("Our place in race: " + arr.length + 1);
        }
    }
}
```

**This code is the same as this more consise one:**

```Java
public class Main {
    public static void main(String[] args) {
        int[] arr = {8, 7, 5, 3, 2, 1}; // current race results
        int number = 4; // our result
        int place = getThePlace(arr, number);
        System.out.println("Our place in race: " + place);
    }

    public static int getThePlace(int[] arr, int number){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < number){
                return i + 1;
            }
        }
        return arr.length + 1;
    }
}
```
EXAMPLE on determining prime numbers

```Java
/*
Detect prime numbers? (number that exactly divides only by itself and 1)

7 - only divides by 7 and only divides by 1
6
6/1 = 6
6/2 = 3

5
5/2 = 2.5

Algorythm:
1. Go through the numbers from 2 to (number -1)
2. check wether or not it is dividable (number % i == 0)
3. If the 2nd point is false then its a prime number
4. If the 2nd point is true then its not a prime number
*/

public class Main {
    public static void main(String[] args) {

      for(int i = 0; i < 100; i++){
        boolean isAPrimeNumber = isPrime(i);
        System.out.println(i + " is a prime number - " + isAPrimeNumber);
      }
    }

    public static boolean isPrime(int number){
        for(int i = 2; i < number; i++){
          if(number % i == 0){
            return false;
          }
        }
        return true; // comes here if the number is not dividable by anything
    }
}
```




