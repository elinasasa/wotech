# LESSON 20  - CLASSES

A class is a package or description about some kind of object. 

<img width="737" alt="Screenshot 2024-06-13 at 22 18 40" src="https://github.com/elinasasa/wotech/assets/165931766/6deb21b2-eaed-48c9-b53a-06e14caf86d5">

when we create a class Person we can now in the Main.java create a Person which is it own data type

new means creating a new instance of a person. when we see "New" we must think of a reference type immediately. we cannot create 

we create a new property, a description of a person. to access the properties you need to have the codes public (thats why we write **public** class Main

Main.java
```Java



public class Main {
  public static void main(String[] args) {
    Person person = new Person();
    person.name = "Oskars"; // this is like a variable but its inside a class
    person.surname = "Klaumanis";

    Person person2 = new Person();
    person2.name = "Rose";
    person2.surname = "Johnson";
      
      //these two persons are two different instances of the same class

    System.out.println(person.name);
  }

}
```
Person.java
```Java
public class Person{ 
    public String name;
    public String surname;
  
}
```

A FB profile is like an object which contains values like name, surname, picture etc.
Main class is always gonna be the first one. its the entry for programme.

The Person is a custom made class, and add values to it.

the second class is usually either a DTO, like certain descriptions of an object, and the other class could be a service, that works with the DTOs.
DTO - data transfer object

the person.java we dont launch, its only the description of it. 

main,java should only show and do the front end things. but all the other actions should be in another file. thats in ideal world.

Main rules for organizing code into classes - for every purposue there should be only a specific class. there shouldnt be a class that is a "Swiss knife". you dont want to put multible different objects if they dont need to interact with each other, bcs then it gets very messy. 

How do we get the "main" file values to "person" file and vice versa?

When would you use a class and not just a new method within Main? - to create custom objects rather than the usual data types

If the programme would need to show how old is a person (calculating current year - birth year), where would we put a method ? - in the persons class. we would create a new function called getAge and get it from person class.

Method is always inside a class. there can be a class without a method, but cant be method without a class. 
![image](https://github.com/elinasasa/wotech/assets/165931766/10ac4dcb-b574-43bb-9fb7-5ae23b911169)

**To experiment: try creating an array list**
ArrayList<Person> persons = new ArrayList<Person>();
You can do like a "to do" list with and many other things.

----------
** Constructor function:**

a function that launches itself when an object is made in main.java (like an new person)

in Person.java
```Java
public class Person{ 
    public String name;
    public String surname;

// we can create a consturctor = a function that launches itself when an object is made in main.java (like an = new Person(name, surname); ) this way we can set the name and surname of the person.
// you can provide values to constructor
    public Person(String inputName, String inputSurname){ // name goes into inputName and surname goes into inputSurname. and then these are set up for the Person.
        name = inputName;
        surname = inputSurname;
        // we are setting up objects values
    }
}

// so if we create a new Person ("Oskars", "Klaumanis")
```

There is a key word "this" that describes a current class. 

```Java
// main.java


public class Main {
  public static void main(String[] args) {
    Person person = new Person("Oskars", "Klaumanis");

    Person person2 = new Person();
    person2.name = "Rose";
    person2.surname = "Johnson";
      
      //these two persons are two different instances of the same class

    System.out.println(person.name);
    System.out.println(person2.name);
  }

}
```

```Java
//Person.java
public class Person{ 
    public String name;
    public String surname;

// we can create a consturctor = a function that launches itself when an object is made in main.java (like an new person) this way we can set the name and surname of the person
    public Person(String inputName, String inputSurname){
        name = inputName;
        surname = inputSurname;
        // we are setting up objects values

    public Person(); // this is what the class has by default. if we add the above custom made constructor, then we are method overloading(overwriting), therefore we have to make it again if we need.
    }
}
```

## Another example

```Java
//main.java
// a book, that has its author and a book title to it.
// we create a book and then we print out the values of the book in a fancy way.

public class Main {
  public static void main(String[] args) {
    var book = new Book(); // this is an object and we can interact with it
    book.title = "The Hobbit";
    book.author = "J.R.R. Tolkien";
    book.pageCount = 310;

    System.out.println(book.title);
    System.out.println(book.author);
    System.out.println(book.pageCount);
  }

}

```
```Java
//Book.java
public class Book{
  public String title;
  public String author;
  public int pageCount;
}
```

Making the same with a constructor:

```Java
//Main.java
// a book, that has its author and a book title to it.
// we create a book and then we print out the values of the book in a fancy way.

public class Main {
  public static void main(String[] args) {
    var book = new Book("The Hobbit", "J.R.R. Tolkien", 310); // this is an object and we can interact with it

    System.out.println(book.title);
    System.out.println(book.author);
    System.out.println(book.pageCount);
  }

}

```

```Java
//Book.java

public class Book{
  public String title;
  public String author;
  public int pageCount;

  public Book(String title, String author, int pageCount){
    this.title = title; // the word this means that we are gonna use the paramethers of the class above (2nd line)
    this.author = author;
    this.pageCount = pageCount;
  }
}
```

if we wanna create a book 2 but use the old way, we need to add the second (default) constructor:

```Java
// a book, that has its author and a book title to it.
// we create a book and then we print out the values of the book in a fancy way.

public class Main {
  public static void main(String[] args) {
    var book = new Book("The Hobbit", "J.R.R. Tolkien", 310); // this is an object and we can interact with it. here we give parameters. // when we create it this way, we make a reference of the book object

    System.out.println(book.title);
    System.out.println(book.author);
    System.out.println(book.pageCount);

    var book2 = new Book();

    System.out.println(book2.title);
    System.out.println(book2.author);
    System.out.println(book2.pageCount);
    
  }

}

```

```Java
public class Book{
  public String title;
  public String author;
  public int pageCount;

  public Book(String title, String author, int pageCount){
    this.title = title; // the word this means that we are gonna use the paramethers of the class above (2nd line)
    this.author = author;
    this.pageCount = pageCount;

  }
  public Book(){
    this.title = "Unknown";
    this.author = "Unknown";
  
  }
}
```

A class that just does actions is a service. there can be a class without attributes, just methods. (to filter a perseon, to update a specific person) working only with an object of a person class.










