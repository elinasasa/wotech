LESSON 26. 3.07

SUBCLASS AND SUPERCLASS

Instead of adding WineShop class to the CHeeseShop, we can just create an item and then in subclasses Wine and CHeese. where they each can have their own properties, like cheese could have origion, type etc.


![image](https://github.com/elinasasa/wotech/assets/165931766/c6ddac56-1b22-47cd-b462-d7a224bdbf09)

```Java
public class Item{
  public float price;
  public String name;

  // if we would use private, we would need to do the setPrice, getPrice, setName, getName methods

  // with setters and getters we can validate. this price doesnt exceed max price, etc. and we can also authentify the user.

  // we can inherit only the public methods from the parent class!!

  
}
```

```Java
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Cheese> items = new ArrayList<Cheese>();
    var cheese = new Cheese();
    items.add(cheese);
    cheese.price = 10;
    cheese.name = "Parmesan";

    System.out.println(cheese.price);

    System.out.println("These are all the items I can sell to you");
    for(var item: items){
      System.out.println(item.name);
      System.out.println(item.price);
    }
  }

}
```


public class Item{
  public float price;
  public String name;
  
}



public class Cheese extends Item{ // this means it has name and price already
  public String cheeseType;
  public String cheeseColor;
}

Abstraction. 

now we make the Main.java not a cheese array but Item array:

```Java
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Item> items = new ArrayList<Item>();
    var cheese = new Cheese();
    items.add(cheese);
    cheese.price = 10;
    cheese.name = "Parmesan";

    System.out.println(cheese.price);

    var wine = new Wine();
    items.add(wine);
    wine.price = 7;
    wine.name = "Merlot";
    

    System.out.println("These are all the items I can sell to you");
    for(var item: items){
      System.out.println(item.name);
      System.out.println(item.price);

      if(item instanceof Wine){ // all the items that are wine its true
        Wine wineInstance = (Wine)item; // by doing this we are saying that this variable is an item, but its a wine type. we are casting it as subclass/wine from the partent class. 
        System.out.println(wineInstance.type);
        System.out.println(wineInstance.country);
        System.out.println(wineInstance.age);
        
      }else if (item instanceof Cheese) {
        //all the items that are cheese
        Cheese cheeseInstance = (Cheese)item;
        System.out.println(cheeseInstance.cheeseType);
      }
      
    }
  }

}
```

```Java
public class Wine extends Item{
  //price and name is already in the parent class

  public String type;
  public int age;
  public float alchPercentage;
  public String country;
}
```

```Java
public class Wine extends Item{
  //price and name is already in the parent class

  public String type;
  public int age;
  public float alchPercentage;
  public String country;
}
```

```Java
public class Item{
  public float price;
  public String name;
  
}
```





