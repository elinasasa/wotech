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





