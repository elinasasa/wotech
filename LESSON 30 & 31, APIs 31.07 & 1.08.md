##LESSON 30, APIs

<img width="1206" alt="Screenshot 2024-08-12 at 19 47 25" src="https://github.com/user-attachments/assets/5d7f1fbd-2ca8-4e5c-b509-3034f7eea8c5">
 while in the DatoriumApiApplication we have:

 ```java
package com.datorium.Datorium.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;



@SpringBootApplication
@RestController
@CrossOrigin
public class DatoriumApiApplication {

	public static void main(String[] args) {
		System.out.println("asd");
		SpringApplication.run(DatoriumApiApplication.class, args);
	}

	@GetMapping("/ping")
	public String ping() {
		return "pong";
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name); // "Hello " + name + "!";
	}

	@GetMapping("/getbook")
	public Book book(){
		var book = new Book();
		book.title = "book title";
		book.author = "book author";

		return book;
	}

	@PostMapping("/postexample")
	public Book addBook(@RequestBody Book book){
		book.title = book.title.toUpperCase();
		return book;
	}
}
```
the result afteR: http://localhost:8080/getbook is adjestent

its a "get" method, and its not sending anything back to backend.

## LESSON 31 1.08
Postman app

<img width="1275" alt="Screenshot 2024-08-12 at 20 49 07" src="https://github.com/user-attachments/assets/22969903-6b34-4690-bf96-c1e62a932572">

Get: get data
Post: update data, change configuration ect. 
Put: add data
Delete: delete data

these are most common ones. 

```java
package com.datorium.Datorium.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;



@SpringBootApplication
@RestController
@CrossOrigin
public class DatoriumApiApplication {

	public static void main(String[] args) {
		System.out.println("asd");
		SpringApplication.run(DatoriumApiApplication.class, args);
	}

	@GetMapping("/ping")
	public String ping() {
		return "pong";
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name); // "Hello " + name + "!";
	}

	@GetMapping("/getbook")
	public Book book(){
		var book = new Book();
		book.title = "book title";
		book.author = "book author";

		return book;
	}

	@PostMapping("/postexample")
	public Book addBook(@RequestBody Book book){
		book.title = book.title.toUpperCase();
		return book;
	}

	@PostMapping("/authorize")
	public User authorize(@RequestBody Credentials credentials){ // username + password
		if(credentials.username.equals("eli") && credentials.password.equals("pass123")){
			var user = new User();
			user.name = "Elina";
			return user;
		}
		return null;
	}
	// We want user to be able to authorize, by using username and password
	// And then we provide a profile of the user (name, surname, age, email)
}
```

```java
package com.datorium.Datorium.API;

public class User {
    public String name;
}
```

```java
package com.datorium.Datorium.API;

public class Credentials {
    public String username;
    public String password;
}
```

<img width="1259" alt="Screenshot 2024-08-12 at 21 31 09" src="https://github.com/user-attachments/assets/8a826650-a9b1-4541-be60-06b260d24495">







