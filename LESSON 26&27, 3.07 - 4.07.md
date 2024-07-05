# LESSON 26. 3.07

## Inheritance
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

We can have inheritacne of inheritance of inheritance. like animal -> pet -> dog.

## Payment system example

```Java
import java.util.arrayList;

public class Main {
  public static void main(String[] args) {
    var list = new ArrayList<PaymentService>();
    
    
    // PaymentService
    // SebPaymentService
    // SwedPaymentService
  }

}
```

```Java
public class PaymentService{
  public String clientAddress; // IBAN
  public int amount;
  public String description;
  public String currency;
}
```

```Java
public class SebPaymentService extends PaymentService{
 public void sendPaymentToSeb(){
   System.out.println("This is a payment to SEB service");
 } 
}
```

```Java
public class SwedPaymentService extends PaymentService{
 public void sendPaymentToSwed(){
   System.out.println("This is a payment to SWED service");
 } 
}
```

casting

when understanding that its not just a cheese but its parmesan. 

```Java

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    var list = new ArrayList<PaymentService>();
    
    var sebPaymentService1 = new SebPaymentService();
    list.add(sebPaymentService1);
    sebPaymentService1.currency = "EUR";
    sebPaymentService1.amount = 10500;
    sebPaymentService1.clientAddress = "LV92SEB12985865722111";

    var sebPaymentService2 = new SebPaymentService();
    list.add(sebPaymentService2);
    sebPaymentService2.currency = "USD";

    var swedPaymentService1 = new SwedPaymentService();
    list.add(swedPaymentService1);
    swedPaymentService1.currency = "EUR";

    var swedPaymentService2 = new SwedPaymentService();
    list.add(swedPaymentService2);
    swedPaymentService2.currency = "USD";

    for(var paymentService : list){
      System.out.println(paymentService.currency);
      if(paymentService instanceof SebPaymentService){
        var sebService = (SebPaymentService) paymentService; // or SebPaymentService ...instead of var...sebService = (SebPaymentService) paymentService;
        sebService.sendPaymentToSeb();
      
      }else if (paymentService instanceof SwedPaymentService){
        var swedService = (SwedPaymentService) paymentService;
        swedService.sendPaymentToSwed();
      }
    }
  }

}

```

This works only with methods

cleaninh up the code with @Override

```Java

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    var list = new ArrayList<PaymentService>();
    
    var sebPaymentService1 = new SebPaymentService();
    list.add(sebPaymentService1);
    sebPaymentService1.currency = "EUR";
    sebPaymentService1.amount = 10500;
    sebPaymentService1.clientAddress = "LV92SEB12985865722111";

    var sebPaymentService2 = new SebPaymentService();
    list.add(sebPaymentService2);
    sebPaymentService2.currency = "USD";

    var swedPaymentService1 = new SwedPaymentService();
    list.add(swedPaymentService1);
    swedPaymentService1.currency = "EUR";

    var swedPaymentService2 = new SwedPaymentService();
    list.add(swedPaymentService2);
    swedPaymentService2.currency = "USD";

    for(var paymentService : list){
      System.out.println(paymentService.currency);
      paymentService.sendPayment();
      
    
    }
  }

}
```

```Java
public class PaymentService{
  public String clientAddress; // IBAN
  public int amount;
  public String description;
  public String currency;

  public void sendPayment(){
     System.out.println("This is a payment to some service");
   } 
}
```

```Java
public class SebPaymentService extends PaymentService{

  @Override
 public void sendPayment(){
   System.out.println("This is a payment to SEB service");
 } 
}
```

```Java
public class SwedPaymentService extends PaymentService{

   @Override
   public void sendPayment(){
   System.out.println("This is a payment to SWED service");
 } 
}
```


