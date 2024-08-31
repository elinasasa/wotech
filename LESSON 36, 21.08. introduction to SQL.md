## LESSON 36

## 21.08. introduction to SQL

# DATABASE

SQL is a database

https://survey.stackoverflow.co/2024/technology/

<img width="1316" alt="Screenshot 2024-08-31 at 18 22 28" src="https://github.com/user-attachments/assets/ca395097-7c3c-4843-8f4f-baa909c54464">

SQL = Structures Querry Language

the many types of SQLs are j ust like different brands (like different producers of milk)

Many SQL databases are because different databases are optimized for different use cases, architectures, and workloads etc.

When the first SQL standard was approved, there were already several implementations of SQL. Those then had to change to conform. Meanwhile, they were also changing to solve new problems or problems unaddressed in the standard.


![image](https://github.com/user-attachments/assets/6c6bad9c-c56f-41ed-b9e7-053e91920fdf)
SQL Data is organized in tables, like excel.

MongoDB is organized as JSON

In SQL there are relationships, thats a benefit. in document DB like MongoDB you cant.

Advantage of document DB over SQL - flexibility. in MongoDB can have different structures not only tables, more flexible in this sense. its easeir to add other new data, smth that others dont have. or very detaield data.
this wors for data that has a lot of embeded documents. 

useful excel fomula = vlookup(..)

for data analytics would use python of BItools

Working with data here: https://sqliteonline.com/

SQLLite

* means all

![image](https://github.com/user-attachments/assets/708b719a-6f14-4b23-95a0-10c985b24d70)

you can alsos elect specific columns

```SELECT Name, Surname, City FROM Owners; ```

selecting all pets whoes age is 11.

```SELECT * FROM Pets WHERE Age=11; ```

```SELECT * FROM Pets WHERE Age>11; ```

```SELECT * FROM Pets WHERE Kind='Cat'; ```

```SELECT * FROM Pets WHERE Kind='Dog' AND Age<5; ``` 

```SELECT PetId, Name FROM Pets WHERE Kind='Dog' AND Age<5; ```

where name contains "s":

```  SELECT * FROM Pets WHERE Kind = 'Dog' AND Name LIKE '%S%'; ```

make it's case sensitive:
```SELECT * FROM Pets WHERE Kind = 'Dog' AND Name GLOB '*si*';```

```SELECT * FROM Pets WHERE LENGTH(Name) < 3;```









