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
