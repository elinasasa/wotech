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

string is also sort of primitive.

#Teawork:

```Java
public class Main {
    public static void main(String[] args) { //Main method

        boolean isHuman = false;
        boolean isHuman2 = isHuman;
        isHuman = true;

        System.out.println(isHuman == isHuman2);
    }
}
// result is false
```

```Java
public class Main {
    public static void main(String[] args) { //Main method

        String name = "James";
        String surname = name;
        name = "Jimmy";

        System.out.println(name == surname);
    }
}
// result is false
```

WHY IS THE RESULT FALSE?

In Java, the == operator is used to compare references (memory addresses) when dealing with objects, rather than comparing the actual content of the objects. In Java, when you assign one variable to another, you are copying the reference, not the actual object. 

1. The variable name holds a reference to this "James" object.
2. String surname = name;

The variable surname is assigned the same reference that name holds.
Both name and surname now refer to the same "James" object in memory.
name = "Jimmy";

3. A new String object with the content "Jimmy" is created.
The variable name is now updated to hold a reference to this new "Jimmy" object.
**The variable surname still holds a reference to the original "James" object.**

In summary, after name is reassigned to "Jimmy", name and surname refer to different objects. The == operator checks if they refer to the same object (i.e., the same memory address), which they do not in this case, resulting in false.

------

It doesn't work the same for all data types in Java.
**Primitive Types**

Primitive types include int, char, boolean, float, double, byte, short, and long. These types hold their values directly in memory. When you assign a primitive type variable to another, you copy the value itself.

**Reference Types**

Reference types include objects, arrays, and instances of classes. For reference types, variables store references (memory addresses) to the actual data. When you assign a reference type variable to another, you copy the reference, not the object itself.

**Primitive types:** Assigning one variable to another copies the value itself. Changes to one variable do not affect the other.

**Reference types:** Assigning one variable to another copies the reference. Both variables point to the same object, and changes to the object through one variable are visible through the other variable. However, reassigning one variable to a new object does not affect the other variable.
