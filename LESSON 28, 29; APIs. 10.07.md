# Lesson 28/ 29; APIs

## Application programming interface
its like an access point. two programmes interacting with each other. back-end service to back-end service.


Backend in like a server. 

Protocols:
- NFC, = Bluetooth
- HTTP = hyper text transfer protocol. this is how web applications communicate with each other. 


Requests. way of communicating. 
Front end sending to back end = request. 

Back end answers = response. Sends back data to front end. 

when you get 404 Page not found error, that means backend didnt have a response. 

F12 button on computer on a website opens up some thingy - we are interested in Payload (or Body). It containsd ata that is needed for the question. 

Oskars as a parameter in the request. both request and response contain payload/body.

Opening developer tools.

![image](https://github.com/elinasasa/wotech/assets/165931766/d3d896d5-2c18-4c59-acb5-f25a2e8b7ce1)

@GetMapping - it an attribute or annotation and this function ads properties to the function, but it doesnt impact the way how the fucntion runs. 

Get method = its the request and the response. 

like the Ping.. pong thing.

<img width="1136" alt="Screenshot 2024-07-11 at 18 23 47" src="https://github.com/elinasasa/wotech/assets/165931766/f0e99364-b088-40f1-88c2-2abeb802aa97">

@RequestParam

localhost:8080/ping

```
@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
```

%s - its a place holder from string. Java string interpolation

this is how we send the name to backend:

http://localhost:8080/hello?name=Elina



with the questionmark. 

## FRAMEWORK

Framework = using a **package** that someone else has already developed. is a part of the programme that we are not creating ourwelves but importing from somewhere else. its like a toolbox. its when you write the code with "import ...", similar how we did with Scanner, ArrayList.

![image](https://github.com/elinasasa/wotech/assets/165931766/0a5f19d6-01a6-4ba3-9e75-970b3939ffc5)


![Screenshot 2024-07-11 at 18 44 46](https://github.com/elinasasa/wotech/assets/165931766/da0fc11b-f8b5-44fa-afa7-7063d3fbd2a9)

@GetMapping("/ping") maps HTTP GET requests to the /ping URL to this specific method.


Each langugaes has its own frameworks.

Spring is one of them: https://spring.io/

##TEAMWORK 

1. Create an array in the endpoint, fill the array with data and access it from the URL

2. Create an object (new class, cheese or wine or whatever) in the endpoint, fill the object, access it from the URL


http://localhost:8080/multiply?number1=9&number2=10


