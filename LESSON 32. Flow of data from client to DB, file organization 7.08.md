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
