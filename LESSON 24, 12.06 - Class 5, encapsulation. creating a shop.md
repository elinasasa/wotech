#LESSON 24 - Class 5, encapsulation. creating a shop

if we write

private void defaultBookshelf() {
...
} - here we dont let the used give any input

if we write :
public void addBook (Book book) {
...
}
we give it some kind of value

![Screenshot 2024-06-28 at 19 51 22](https://github.com/elinasasa/wotech/assets/165931766/c5be425f-b54c-42cd-8ff8-82764e626289)

--------

## Encapsulation

Encapsulation is needed for future developers. but basically you encapsulate it when its done and you dont want to change anything, except when there is a bug. 

![Screenshot 2024-06-28 at 20 00 45](https://github.com/elinasasa/wotech/assets/165931766/759ec900-1f61-4e7f-a51d-51ec34e75b7f)

In photo manager you **shoulnd't** be able to work with books. but it should be possible from the shop class, to work in both. 

Encapsulation is mostly doen using private and getters and setters

in class Book we want to set values that are related to book - like description, pages, and no functionality. you don't create a book in this class.
and in bookManager you put functionality, remove, add. this is like a factory, that makes books, you can do anything with the books.
and teh shop class you can sell.

like table; tableFactory; tableShop. 3 classes. you dont want to sell tables in the factory, and you don't want to create tables in the shop. 
in case of this table example in the main you would take the user order. the shop could take the order and go to the factory. 

User input goes only into Main.java

Ideally all class parapeters should be private and then methods that can use these class parameters. 



Return for void is like a break for a loop.

## Example on a shop



```Java
public class Item{
  private int id;
  private String name; // now we cant access this outside of the class like in Main.java
  private int cost; //gold pieces

  public Item(int id){
    this.id = id;
  }

  public int getId(){
    return id;
  }
  
// creating setter - changing private property
  public void setName(String name){

    // do some logic here
    this.name = name;
    // do some logic here
  }
// getter - returning private property
  public String getName(){
    return name;
  }
// setter - changing private property
  public void setCost (int cost){
    // check whether or not the user is a cahier and if it is then allow to change the cost.
    this.cost = cost;
  }
//getter - returning private property
  public int getCost(){
    return cost;
  }
}

// we use setters bcs its easier to provide some action that happens whenever we set a name. bcs we want to provide this logic once. 
//this is done when we need to change some cost or name.. we do this when we dont want the user to do some werid action on our classes.
// 
```

```Java
import java.util.ArrayList;

public class Shop{

  //ItemManager functionality
  //addItem
  //removeItem
  //updateItem

  // Shop functionality
  // addItemToCart
  // get the items lsit
  // removeItemFromCart
  // checkout (get the total price)

  private ArrayList<Item> items = new ArrayList<Item>();
  private ArrayList<Item> cart = new ArrayList<Item>();

  public ArrayList<Item> getItems(){
    return items;
  }
  
  public void addItem(Item item){// void bcs we are not returning anything
    items.add(item);
  }

  public void removeItem(int id){
    for (var item : items){
      if (item.getId() == id){
        items.remove(item);
        return; // returning function without returning value. it just stops the function. return in this case means we dont go further than when it has found the correct id in a list.
      }
    }
  }

  public void updateItem (int id, String name, int cost){
    //find the item with the id
    // update the item with name and cost

    for(var item: items){
      if(item.getId() == id){
        item.setName(name);
        item.setCost(cost);
        return;
      }
    }
  }

  public void addItemToCart(Item item){
    // items list, it would contain the amount of available items
    // before we add item to the cart we would check whether or not it is available
    cart.add(item);
    
  }

  public int checkout(){ //get the total cost 
    int sum = 0;
    for(var item: cart){
      sum += item.getCost();
    }
    return sum;
  }
  
}
```
