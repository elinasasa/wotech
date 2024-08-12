###LESSON 30, APIs

<img width="1206" alt="Screenshot 2024-08-12 at 19 47 25" src="https://github.com/user-attachments/assets/5d7f1fbd-2ca8-4e5c-b509-3034f7eea8c5">
 while in the main we have:

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
}
```
