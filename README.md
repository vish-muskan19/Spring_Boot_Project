
 # This is a library management system project.

I developed a web application by using Spring Boot.




## Tech Stack

+ Spring Boot
+ Spring Data Jpa
+ MySQl Database
+ Thymeleaf
+ Bootstrap4








## Backend Design

#### Entities

Entities are inspired by the real world entities that can use the applications

1. Author having attributes:
+  AuthorID (Primary Key), Name, Description
2. Book having attributes:
+  BookID (Primary Key), ISBN, Name, serialName, Description
3. Categoryhaving attributes:
+  CategoryID (Primary Key), Name
4. Publisher having attributes:
+ PublisherID (Primary Key), Name


### Relationships Between Entities and ER diagram

+ Author to Book: One-to-Many (An author can write many books, but a book is written by one author.)
+ Book to Author: Many-to-Many (A book can have multiple authors, and an author can write multiple books.)
+ Book to Category: Many-to-Many (A book can belong to multiple categories, and a category can have multiple books.)
+ Book to Publisher: Many-to-Many (A book can be published by multiple publishers, and a publisher can publish multiple books.)




![App Screenshot](https://github.com/vish-muskan19/Spring_Boot_Project/blob/main/Library__Management__System/screenshot/ER%20Digram.png?raw=true)


## Port

```bash
    http://localhost:8090
```

## Screenshots

### Home 
![App Screenshot](https://github.com/vish-muskan19/Spring_Boot_Project/blob/main/Library__Management__System/screenshot/Home.png?raw=true)

### Book 
![App Screenshot](https://github.com/vish-muskan19/Spring_Boot_Project/blob/main/Library__Management__System/screenshot/Book.png?raw=true)

### Add Book 
![App Screenshot](https://github.com/vish-muskan19/Spring_Boot_Project/blob/main/Library__Management__System/screenshot/Add_Book.png?raw=true)


### Search 
![App Screenshot](https://github.com/vish-muskan19/Spring_Boot_Project/blob/main/Library__Management__System/screenshot/Search.png?raw=true)

### Author 
![App Screenshot](https://github.com/vish-muskan19/Spring_Boot_Project/blob/main/Library__Management__System/screenshot/Author.png?raw=true)

### Category 
![App Screenshot](https://github.com/vish-muskan19/Spring_Boot_Project/blob/main/Library__Management__System/screenshot/Category.png?raw=true)

### Publisher 
![App Screenshot](https://github.com/vish-muskan19/Spring_Boot_Project/blob/main/Library__Management__System/screenshot/Publisher.png?raw=true)
