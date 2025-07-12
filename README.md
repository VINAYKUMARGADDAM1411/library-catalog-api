--Library Catalog API--

A simple Java Spring Boot REST API for managing a library's book catalog using in-memory storage.  
This project is part of a Java Internship Assessment.


--Getting Started--

--Prerequisites--

- Java 17 or above
- Maven
- IDE (IntelliJ / Eclipse / VS Code)
- Postman (for testing the API)

--Run the Application--

1. Clone the Repository
   ```bash
   git clone https://github.com/your-username/library-catalog-api.git
   cd library-catalog-api
   ```

2. Open the project in your favorite IDE.

3. Run the main class
   - Open `CatalogApplication.java`
   - Click Run or execute:
     ```bash
     ./mvnw spring-boot:run
     ```

4. The application will start at:  
   ➤ `http://localhost:8080`


 --Tech Stack--

- Java 17
- Spring Boot (Web + DevTools)
- No Database — uses in-memory storage (`HashMap`)
- Postman (for API testing)

--API Endpoints--

| Method | Endpoint                               | Description                    |
|--------|----------------------------------------|--------------------------------|
| POST   | `/api/books`                           | Add a new book                 |
| GET    | `/api/books`                           | Get all books                  |
| GET    | `/api/books/{id}`                      | Get a book by ID               |
| DELETE | `/api/books/{id}`                      | Delete a book by ID            |
| PUT    | `/api/books/{id}/availability?available=false` | Update book availability |


 Sample Requests

➕ Add a Book
POST: `/api/books`  
Body:
```json
{
  "title": "Clean Code",
  "author": "Robert C. Martin",
  "isbn": "9780132350884",
  "available": true
}

Get All Books
GET :`/api/books`

---

Get Book by ID
GET: `/api/books/1`

---

Delete Book
DELETE:`/api/books/1`

---

Update Availability
PUT: `/api/books/1/availability?available=false`

---

## 🧪 Postman Collection

A Postman collection is provided to help you test the API quickly and easily.

https://web.postman.co/workspace/25a3dccf-1f84-48ac-8994-64202f48a889



