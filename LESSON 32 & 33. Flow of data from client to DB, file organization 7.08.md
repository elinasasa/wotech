#LESSON 32. 

## Flow of data from client to DB, file organization 7.08

Object - the book, the wine, whatever
Services that write logic.
API/Controler (synonym) -> API is calling the service (service is not part of API but of Business logic) -> then it returns
FLow


<img width="764" alt="Screenshot 2024-08-13 at 21 48 07" src="https://github.com/user-attachments/assets/db3e61b9-88e1-468b-98ed-5ea4b2e107f8">

This is the **clean architecture**. 
![image](https://github.com/user-attachments/assets/b4daa0f1-7718-439d-b244-0cd1cb1b5b68)

the Data/Repository checks eg. - do we have this client? --- the data gets it (asks) from Database. the DB is on a different server, different language. 
API recognizes if you are the correct person by the ID. Business logic tries to understand - is this person real? 

once the data and database confirm that the user is real, business logic can validate the changed username, and update it. 

Controller sends the data back to user, confirming it.

#Database in completely independent from backend. all the 4 "boxes" are independent from each other.

Only thing changing is Data when we update smth - DB, business logic and controller dont chnage. With small exceptions. 

can business logic speak to DB directly? Why a data repository is needed between them? - to avoid that we ask the same "question" many times. bcs there is some logic already in the repo. 

![image](https://github.com/user-attachments/assets/918a1b62-e2ea-467d-9812-dd7aeafba11b)

business logic might not be the same for eg. to enter Gmail, YT and GDrive - you have the profile in all so they actually use only one DB where they take the user data. 

SQL vs my SQL - important to know the difference

SQL is primarily for data storage, querying, etc. in other words CRUD operations.

Create
Read
Update
Delete

= CRUD

DTOs - contain just the data. objects without functionality

This is **clean architecture**. 

## LESSON 33

Entities are almost the same as repositories. 

```java

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

```
this is part of the DatoriumApiApplication code we deleted. 

Many packages create a Module:

![Screenshot 2024-08-14 at 18 36 20](https://github.com/user-attachments/assets/95a9ee3e-5e4d-44c0-9814-1a1baaa86423)

API is a module, business ligoc is a module, etc.. (from pic above)

Two ways to sort the code:
![Screenshot 2024-08-14 at 18 41 45 2](https://github.com/user-attachments/assets/f0911a1b-b9e9-40b7-83ac-761de4fbf7c6)

the left is used more often and its better if there are many things. otherwise the right gets too messy. 

<img width="1390" alt="Screenshot 2024-08-14 at 20 14 14" src="https://github.com/user-attachments/assets/c0dd8de9-bd46-4162-8d4c-cbd1c456783f">

<img width="1265" alt="Screenshot 2024-08-14 at 20 13 47" src="https://github.com/user-attachments/assets/650e06dc-86dc-4a21-aa8d-14e22d212b9f">


