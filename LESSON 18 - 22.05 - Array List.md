# LESSON 18 - Array list

wiping off screen code: (useful for tic tac toe game)

```Java
        System.out.print("\033[H\033[2J");
        System.out.flush();
```

dynamic array. it can change the size of the array, it will change dinamically.

we can put any type in this Array List (string, intiger...) but can mix them. 

```
public String toString()
Returns a string representation of this collection. The string representation consists of a list of the collection's elements in the order they are returned by its iterator, enclosed in square brackets ("[]"). Adjacent elements are separated by the characters ", " (comma and space). Elements are converted to strings as by String.valueOf(Object).
Overrides:
toString in class Object
Returns:
a string representation of this collection
```

useful syntax:

```Java
for (type var : array) 
{ 
    statements using var;
}
```

```Java
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      ArrayList<String> shopsItems = new ArrayList<String>(); // initializing ArrayList, creates a new object and gives a reference shopsItems is variable.
    // ArrayList<String> can also be simply var

    addItem(shopsItems, "Table");  // OR shopsItems.add("Table"); this is if there wasnt a function sepaately for adding items
    addItem(shopsItems, "Cupboard"); //OR shopsItems.add("Cupboard");

    printArrayList(shopsItems); // here we call the print function thats why it prints!
    
    
  }

  public static void printArrayList(ArrayList<String> items){
    //checking if we have something in the list with a loop:
    for (String item : items){ // the item changes each time we go thgouh loop
      System.out.println(item);
    }
  } // this is the print function

public static void addItem(ArrayList<String> items, String item){ // items = a box, and String items = the items we want to put in the "box" = the element we want to add to list
  items.add(item);
  System.out.println(item + " has been added to the list");
}
// this function adds the item to the shopsItems arrayList
  
}

// initialize ArrayList
// Create an element in the arrayList
// Remove an element
// Get the elements
```

now adding a scanner so user can input items in inventory:
also it has the flush function

```Java

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      var shopsItems = new ArrayList<String>(); 

    var scanner = new Scanner(System.in);
    while(true){
      var item = scanner.nextLine();
      if(item.equals("exit")){
        break;
      }
      addItem(shopsItems, item);
    }

    printArrayList(shopsItems); 
  }

  public static void printArrayList(ArrayList<String> items){
    System.out.println("Store has there items:");
    for (String item : items){
      System.out.println(item);
    }
  }

public static void addItem(ArrayList<String> items, String item){
  System.out.print("\033[H\033[2J");
  System.out.flush();
  items.add(item);
  System.out.println(item + " has been added to the list");
}
  
}

// initialize ArrayList
// Create an element in the arrayList
// Remove an element
// Get the elements
```

Removing an item

```Java
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {
    // shopsItems here
    public static void main(String[] args) {
        var shopsItems = new ArrayList<String>();
        // Initializes an ArrayList, creates a new object and gives a reference
        var scanner = new Scanner(System.in);
        // These 2 lines in a function
        while (true) {
            System.out.println("Enter the item you want to add to the list or type exit to stop: ");
            var item = scanner.nextLine(); // Asks the user for input

            if(item.equals("exit")){
                break;
            }
            
            addItem(shopsItems, item);
        }

        printArrayList(shopsItems);

        shopsItems.removeIf(item -> item.equals("Table"));

        printArrayList(shopsItems);
    }

    public static void printArrayList(ArrayList<String> items) {
        System.out.println("Store has these items:");
        for (String item : items) {
            System.out.println(item);
        }
    }

    public static void addItem(ArrayList<String> shopsItems, String item) {
        shopsItems.add(item); // adds the item to the shopsItems arrayList
        System.out.println(item + " has been added to the store"); // Provide information to the user
    }
}

// Initialize ArrayList
// Create an element in the arrayList
// Remove an element
// Get the elements
```

Removing an item

```Java
shopsItems.removeIf(item -> item.equals("Table")); //lambda function.
```

```Java
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      var shopsItems = new ArrayList<String>(); 

    var scanner = new Scanner(System.in);
    while(true){
      var item = scanner.nextLine();
      if(item.equals("exit")){
        break;
      }
      addItem(shopsItems, item);
    }

    printArrayList(shopsItems); 

    System.out.println("Enter the item you want to remove: ");
    var itemToRemove = scanner.nextLine();
    shopsItems.removeIf(item -> item.equals(itemToRemove)); //lambda function. 

    printArrayList(shopsItems);
  }

  public static void printArrayList(ArrayList<String> items){
    System.out.println("Store has there items:");
    for (String item : items){
      System.out.println(item);
    }
  }

public static void addItem(ArrayList<String> items, String item){
  items.add(item);
  System.out.println(item + " has been added to the list");
}
  
}

// initialize ArrayList
// Create an element in the arrayList
// Remove an element
// Get the elements
```

Filtering:

```Java

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      var shopsItems = new ArrayList<String>(); 

    var scanner = new Scanner(System.in);
    while(true){
      var item = scanner.nextLine();
      if(item.equals("exit")){
        break;
      }
      addItem(shopsItems, item);
    }

    printArrayList(shopsItems); 

    System.out.println("Enter the item you want to remove: ");
    var itemToRemove = scanner.nextLine();
    shopsItems.removeIf(item -> item.equals(itemToRemove)); //lambda function. 

    printArrayList(shopsItems);

    var filteredArrayList = new ArrayList<String>();
    for(String item: shopsItems){ // going through all shop items
        if(item.length() <= 5){
          filteredArrayList.add(item); // if less than 5 we addid to this filtered list
        }
    }
    printArrayList(filteredArrayList);
  }

  public static void printArrayList(ArrayList<String> items){
    System.out.println("Store has there items:");
    for (String item : items){
      System.out.println(item);
    }
  }

public static void addItem(ArrayList<String> items, String item){
  items.add(item);
  System.out.println(item + " has been added to the list");
}
  
}

// initialize ArrayList
// Create an element in the arrayList
// Remove an element
// Get the elements
```

but there is a better way to filter. 

# TEAMWORK

Easy: Create an arrayList for integers
Add 5 numbers.

Filter the arrayList and print out only numbers that divide by 2 
(number % 2 == 0)

Medium: Put 100 random numbers in arrayList

Filter the arrayList and print out only numbers that divide by 2 
(number % 2 == 0)


```Java 
var numbers = new ArrayList<Integer>();
```

# Individual task

```Java
//Develop a simple book management application with ArrayList.
//User should be able to add a book to ArrayList.
//User should be able to remove a book from ArrayList.


import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var bookApp = new ArrayList<String>();
        var scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the name of a book to add to the list or type 'exit' to quit:");
            var item = scanner.nextLine();
            if (item.equals("exit")) {
                break;
            }
            addBook(bookApp, item);
        }

        inventory(bookApp);

        while (true) {
            System.out.println("Enter the book that you want to remove or type 'exit' to quit:");
            var bookToRemove = scanner.nextLine();
            if (bookToRemove.equals("exit")) {
                break;
            }
            removeBook(bookApp, bookToRemove);
        }
      inventory(bookApp);
        scanner.close();
    }

    public static void inventory(ArrayList<String> items) {
        System.out.println("System has these items:");
        for (String item : items) {
            System.out.println(item);
        }
    }

    public static void addBook(ArrayList<String> items, String item) {
        items.add(item);
        System.out.println(item + " has been added to the system");
    }

    public static void removeBook(ArrayList<String> items, String bookToRemove) {
        items.removeIf(item -> item.equals(bookToRemove));
        System.out.println(bookToRemove + " has been removed from the system");
    }
}

```

