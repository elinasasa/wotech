#LESSON 22

## Class. Getters & setters

working with 3 classes:
taskManager.java - one that manages tasks -> we can add tasks to the list, we can mark them as done and we can get the list
task.java - one with tasks -> template for a task (name, description, date, itIsDone)
Main.java and one main -> we are getting the user input, we are sending this input to tsaskManager, show info to the user.

This is object oriented programming.

function and method in Java is the same thing.

static is obligatory only in Main.java class

Scanner is only used in main class.

Check out Encapsulation in Java.

Main.java
```Java
import java.util.Scanner;

public class Main { // for council apps main should be the frontend or UI for us. bcs for regular app its not. but main functionality should be in other classes.
  public static TaskManager taskManager = new TaskManager();// everything is this class will be able to use it
  
  public static void main(String[] args) {
    // Create a menu:
    // Put it in a while loop
    // use scaner
    // if the user presses 1, we call CreateTask
    // if the user presses 2, we call showTodoList
    // if the user presses 3, ask the task name with isDone = true
    // if the user presses x, close the loop

    // MENU:
    while(true){
      Scanner scanner = new Scanner (System.in);
      System.out.println("Press 1 to create a task");
      System.out.println("Press 2 to show the todo list");
      System.out.println("Press 3 to set a task as done");

      var userInput = scanner.nextLine();
      if(userInput.equals("1")){
        createTask();
      }else if(userInput.equals("2")){
        showTodoList();
      }else if(userInput.equals("3")){
        showTodoList();
        System.out.println("Enter the finished task name:");
        var taskName = scanner.nextLine();
        taskManager.setTaskAsDone(taskName);
      }else{
        break;
      }
    }

  }
// function that creates an object
  public static void createTask(){
    Scanner scanner = new Scanner (System.in);
    // Input the task name
    System.out.println("Please input the name of the task");
    var name = scanner.nextLine();
    // Input the task description
     System.out.println("Please input the description of the task");
    var description = scanner.nextLine();
    var task = new Task(name, description);
    taskManager.addTask(task); //
  }

  // shows elements from the list
  public static void showTodoList(){
    var tasks = taskManager.getTasks();
    for(var task : tasks){
      System.out.println("This is a TASK");
      System.out.println(task.name);
      System.out.println(task.description);
      System.out.println(task.isDone);
    }
  }

}
```

Task.java

```Java
public class Task{
  // name, description, isDone
  public String name;
  public String description;
  public boolean isDone;

  // var task = new Task("name", "description");
  public Task(String name, String description){ //we want only these 2 because its not done right away
    this.name = name;
    this.description = description;
    
  }
}
```

TaskManager.java

```Java
import java.util.ArrayList;

public class TaskManager{
  // MVP:
  // be able to add a task
  // have a list of all the tasks -> getTasks();
  // set a task as done, by task name

  private ArrayList<Task> tasks = new ArrayList<Task>(); //initializing
// if we set as private, we need to create a Getter.
  //because we want to use the default constructor
  // new TaskManager() - we dont need to add a custom constructor

  public void addTask(Task task){ // adding task object in this function. its a parameter where we get the task from. we use void here bcs we are adding the task to the task manager, but we dont require to get anything from this function.
    tasks.add(task);
    
  }
  
  public ArrayList<Task> getTasks(){
    return tasks;
  } // it ensures us that noone can change the value of the "private" property. its always gonna be the same array list. only used by TaskManager. you cant overwrite the tasks. its called encapsulation. one of principles of object oriented programming (OOP)

  public void setTaskAsDone(String taskName){
    tasks.stream()
      .filter(x -> x.name.equals(taskName)) //x is one of the tasks, but all tasks go through all the statement, and it will forward it to filter.
      .findFirst()
      .ifPresent(x-> x.isDone = true); // the arrow is like a small action/function that the method can use.
      //.get(); //If a value is present, returns the value, otherwise throws NoSuchElementException.
  }
 
//BONUS:
  // a list of undone tasks - filtration
  // a list of done tasks - filtration
  // get a random quote to stop procastinating
  
}
```

## Getters and setters

You should set setter and getters as well as make a consructor.

```Java

public class Main {
  public static void main(String[] args) {
    var item = new Item();
    item.setName("This is a name");
    var itemName = item.getName();
  }

}
```

```Java
public class Item{
  private String name; // now we cant access this outside of the class like in Main.java
  private int cost; //gold pieces

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


