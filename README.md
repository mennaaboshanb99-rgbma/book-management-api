# Book Management API

A RESTful API project for managing books, built using Java and Spring Boot.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven
- Postman

## Features

- Add a new book
- Display all books
- Display a book by ID
- Update a book
- Delete a book

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/Book` | Add a new book |
| GET | `/Book` | Display all books |
| GET | `/Book/{id}` | Display a book by ID |
| PUT | `/Book/{id}` | Update a book |
| DELETE | `/Book/{id}` | Delete a book |

## How to Run

1. Clone the repository.
2. Open the project in your IDE.
3. Run the Spring Boot application.
4. Test the APIs using Postman.

## Author

Menna Aboshanab
## API Testing

### Add Book
![Add Book](screenshots/POST-Add-Book.png)

### Get All Books
![Get All Books](screenshots/GET-All-Books.png)

### Get Book By ID
![Get Book By ID](screenshots/GET-Book-By-ID.png)

### Update Book
![Update Book](screenshots/PUT-Update-Book.png)

### Delete Book
![Delete Book](screenshots/DELETE-Book.png)