
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

**This code is the same as this more consise one:**

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




