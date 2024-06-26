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
    createTask();
    showTodoList();
    // Create a menu:
    // Put it in a while loop
    // use scaner
    // if the user presses 1, we call CreateTask
    // if the user presses 2, we call showTodoList
    // if the user presses 3, mark a task with isDone = true
    // if the user presses x, close the loop
    

  }

  public static void createTask(){
    Scanner scanner = new Scanner (System.in);
    // Input the task name
    System.out.println("Please input the name of the task");
    var name = scanner.nextLine();
    // Input the task description
     System.out.println("Please input the description of the task");
    var description = scanner.nextLine();

    scanner.close();

    var task = new Task(name, description);
    taskManager.addTask(task); //
  }

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
 
//BONUS:
  // a list of undone tasks - filtration
  // a list of done tasks - filtration
  // get a random quote to stop procastinating
  
}
```


