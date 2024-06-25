# LESSON 21
## 30.05. Class2, Modifiers, Static

This is not static.

```Java

public class Main {
  public static void main(String[] args) {
    
    Student student = new Student();
    student.name = "John";
    Student student2 = new Student();
    System.out.println(student2.name); // "null" gets printed, because there is no value.
  }

}
```

```Java
public class Student{
  
  public String name;// to access this we need to create an object (the student)
  public int age;
  
}
```
this is like a template how student behaves, what actions it has. all out properties& methods become true when we fill the values.

Adding Static - its like a global variable

```Java

public class Main {
  public static void main(String[] args) {
    Student.studentCount = 10;
    
    Student student = new Student();
    student.name = "John";
    Student student2 = new Student();
    System.out.println(student2.name); // "null" gets printed, because there is no value.
    System.out.println(student.studentCount);
    System.out.println(student2.studentCount);
    System.out.println(Student.studentCount);

    // Main.main(args); // args = arguments // this makes it run forever.recursion. runs until StackOverflowError.
  }

}
```

```Java
public class Student{
  public static int studentCount = 0; // we make Static if we want this global variable which everyone can use. it will be exactly the same in all the class for every student. Makes it a global variable.
  public String name;// to access this we need to create an object (the student)
  public int age;
  
}
```

Should use the Static only in Main.java, the rest should be objects.

Class is like a template or instruction from what you create objects.

![Screenshot 2024-06-25 at 20 40 29](https://github.com/elinasasa/wotech/assets/165931766/ff152fe5-cf2b-4412-a713-79b5714ddd9d)

We dont create values inside the "template".
There would be another class that fills up the "sand in the bucket"


## example 1

```Java

public class Main {
  public static void main(String[] args) {
    var square1 = new Square (3);
    var square1Perimeter = square1.getPerimeter();
    System.out.println(square1Perimeter);
    
    var square2 = new Square (4);
    var square2Perimeter = square2.getPerimeter();
    System.out.println(square2Perimeter);

    var square3 = new Square (100);
    var square3Perimeter = square3.getPerimeter();
    System.out.println(square3Perimeter);

    var square4 = new Square (1);
    var square4Perimeter = square4.getPerimeter();
    System.out.println(square4Perimeter);
  }

}
```

```Java
public class Square{
  public int sideLenght;
  public Square(int sideLenght){ //its a constructor, have to name it the same as the class
    // new Square(7);
    this.sideLenght = sideLenght; // getting argument form main.java. it will be the same as you provide in constructor
  }
  public int getPerimeter(){ //we dont need to add anything in () because the sideLengh is in the bigger scope so we can access it.
   return sideLenght * 4; 
  
  }
}
```

getField

```Java

public class Main {
  public static void main(String[] args) {
    var square1 = new Square (3);
    var square1Perimeter = square1.getPerimeter();
    var square1FieldSize = square1.getField();
    System.out.println(square1Perimeter);
    System.out.println(square1FieldSize);
    
    
  }

}
```

```Java
public class Square{
  public int sideLenght;
  public Square(int sideLenght){ //its a constructor, have to name it the same as the class
    // new Square(7);
    this.sideLenght = sideLenght; // getting argument form main.java. it will be the same as you provide in constructor
  }
  public int getPerimeter(){ //we dont need to add anything in () because the sideLengh is in the bigger scope so we can access it.
   return sideLenght * 4; 
  
  }
//var square1 = new Square(10);
//var fieldSize = square1.getField();
  public int getField(){
    return sideLenght * sideLenght;
  }
}
```

## example 2 FORK class

```Java

public class Main {
  public static void main(String[] args) {
    var fork = new Fork(4, "Silver");

    System.out.println("Fork is made out of " + fork.material + " has " + fork.spikeCount + " spikes in total. And the sharpness is " + fork.sharpness);

    for(int i = 0; i < 100; i++){
      fork.stab();
    }

    System.out.println("The sharpness after 100 stabs is " + fork.sharpness);
  }

}
```


```Java
public class Fork{
  public int spikeCount;
  public String material;
  public int sharpness = 1000;

  //to use this Fork, we need to create //new Fork(3, "wood")
  public Fork(int spikeCount, String material){ // this is a constructor
    this.spikeCount = spikeCount;
    this.material = material; // it makes sure that the material above is the same that we provide int he constructor
    
  }

  public void stab(){//void bcs we are not gonna return any value. we dont want to return stabness after every stab.
    sharpness = sharpness - 1;
  } // 1000 - 1 = 999; -> 998 ...
  
}

// Fork has 3 or 4 spikes
// Fork was a material (silver, plastic, wood)
// Fork has sharpness in the spikes. 1000
// A fork can stab and whenever a fork stabs, it gets a more dull
// Sharpness is gonna decrease by 1
```

TEAMWORK: 
Glass, water amount, take a sip, how much water is left.
or any other example. think of an object and then think what actions it can do.

![Screenshot 2024-06-25 at 21 49 54](https://github.com/elinasasa/wotech/assets/165931766/e24e8591-e8e3-470c-84bf-7b0f23541bd2)



