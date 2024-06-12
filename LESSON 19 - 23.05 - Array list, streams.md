# LESSON 19

Filtering somehting in an Array List:

```Java
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;


public class Main {
  public static void main(String[] args) {

    var shopsItems = new ArrayList<String>();
    shopsItems.add("Glass table");
    shopsItems.add("Wooden table");
    shopsItems.add("Round table");
    shopsItems.add("Doors");
    shopsItems.add("Trapdoor");
    shopsItems.add("Couch");
    shopsItems.add("Bed");
    shopsItems.add("Sofa");

    //System.out.print(shopsItems.size()); // this is how to check lenght
    var filteredShopsItems = new ArrayList<String>();
    for(var item: shopsItems){
      if (item.contains("table")){
        filteredShopsItems.add(item);
      }
    }
    System.out.println(filteredShopsItems);
  }

}
```

another way to filter using STREAMS:

Streams: https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html

or: https://stackify.com/streams-guide-java-8/ (maybe easier to read) 

they are basically functions, and they can be used for many things

Streams are like a contemporary shelf, or like working table.

```Java

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;


public class Main {
  public static void main(String[] args) {

    var shopsItems = new ArrayList<String>();
    shopsItems.add("Glass table");
    shopsItems.add("Wooden Table");
    shopsItems.add("Round table");
    shopsItems.add("Doors");
    shopsItems.add("Trapdoor");
    shopsItems.add("Couch");
    shopsItems.add("Bed");
    shopsItems.add("Sofa");

    //System.out.print(shopsItems.size()); // this is how to check lenght
    
    var filteredShopsItems = shopsItems
      .stream() // just a predefined worded function. functions of array list.
// HERE INBETWEEN WE CAN DO ACTIONS
      .filter(item -> item.toLowerCase().contains("table")) // for those that is true. htis is a function of stream
      .collect(Collectors.toList()); // a new list. function of stream
    System.out.println(filteredShopsItems);
  }

}

// we are converting it into a list
```

examples on skip and limit - other functions we can do inbetween the stream and collect.

```Java
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;


public class Main {
  public static void main(String[] args) {

    var shopsItems = new ArrayList<String>();
    shopsItems.add("Glass table");
    shopsItems.add("Wooden Table");
    shopsItems.add("Round table");
    shopsItems.add("Doors");
    shopsItems.add("Trapdoor");
    shopsItems.add("Couch");
    shopsItems.add("Bed");
    shopsItems.add("Sofa");

    //System.out.print(shopsItems.size()); // this is how to check lenght
    
    var filteredShopsItems = shopsItems
      .stream() // just a predefined worded function. functions of array list.
      .skip(3)
      .limit(2)
      // HERE INBETWEEN WE CAN DO ACTIONS
      .collect(Collectors.toList()); // a new list. function of stream
    System.out.println(filteredShopsItems);
  }

}

// we are converting it into a list
```

another way:

```Java
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;


public class Main {
  public static void main(String[] args) {

    var shopsItems = new ArrayList<String>();
    shopsItems.add("Glass table");
    shopsItems.add("Wooden Table");
    shopsItems.add("Round table");
    shopsItems.add("Doors");
    shopsItems.add("Trapdoor");
    shopsItems.add("Couch");
    shopsItems.add("Bed");
    shopsItems.add("Sofa");

    //System.out.print(shopsItems.size()); // this is how to check lenght
    
    shopsItems
      .stream() // just a predefined worded function. functions of array list. announces that we are going to use some stream.
      .skip(3) // doing actions
      .limit(2)
      .forEach(x -> System.out.println("TEST " + x)); // it doesnt return stream anymore, therefore we cannot collect anything, cant also save anything in a variable
      
  }

}
//
```

```Java
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;


public class Main {
  public static void main(String[] args) {

    var shopsItems = new ArrayList<String>();
    shopsItems.add("Glass table");
    shopsItems.add("Wooden Table");
    shopsItems.add("Round table");
    shopsItems.add("Doors");
    shopsItems.add("Trapdoor");
    shopsItems.add("Couch");
    shopsItems.add("Bed");
    shopsItems.add("Sofa");

    //System.out.print(shopsItems.size()); // this is how to check lenght
    
    shopsItems
      .stream() // just a predefined worded function. functions of array list. announces that we are going to use some stream.
      .filter(x -> x.contains("table"))
      .forEach(x -> System.out.println("TEST " + x)); // it doesnt return stream anymore, therefore we cannot collect anything, cant also save anything in a variable
      
  }

}
//

```

```
this:

.filter(x -> x.contains("table")) // we want to filter furniture
.forEach(x -> System.out.println("TEST " + x)) // for each furniture we want to add and print

is does the same as:

for(var item: shopsItems)){
    System.out.println(items)};


```

using function and stream together

```Java
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;


public class Main {
  public static void main(String[] args) {

    var shopsItems = new ArrayList<String>();
    shopsItems.add("Glass table");
    shopsItems.add("Wooden Table");
    shopsItems.add("Round table");
    shopsItems.add("Doors");
    shopsItems.add("Trapdoor");
    shopsItems.add("Couch");
    shopsItems.add("Bed");
    shopsItems.add("Sofa");

    //System.out.print(shopsItems.size()); // this is how to check lenght
    
    shopsItems
      .stream() 
      //.filter(x -> x.contains("table"))
      .forEach(x -> Print(x));
      
  }

  public static void Print(String text) {
    System.out.println();
    System.out.println(text);
  }
  
}
//
```

# TEAMWORK

Easy: Create an integer ArrayList, skip the first 5 numbers. And then with the rest of them, print them out.
Medium: Create an integer ArrayList, make sure they divide by 2, skip the first 5, limit to three and print them out from another function.



