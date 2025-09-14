# Product Inventory REST API 🛍️

A comprehensive REST API for managing a product inventory, built with Java and Spring Boot. This project demonstrates a robust, layered architecture and professional-grade error handling.

## Tech Stack
- **Java 17+**
- **Spring Boot 3+**
- **Spring Data JPA / Hibernate**
- **MySQL**
- **Maven**

## Key Features
-   **Full CRUD Functionality**: Complete Create, Read, Update, and Delete operations for products.
-   **RESTful API Design**: Clear and conventional endpoints for managing resources.
-   **Layered Architecture**: A clean separation of concerns between the Controller (web), Service (business logic), and Repository (data access) layers.
-   **Centralized Exception Handling**: A global exception handler (`@RestControllerAdvice`) provides consistent and clean error responses for scenarios like "not found" (`404`) or "bad request" (`400`).

## API Endpoints

The base URL for all endpoints is `/api`.

| Method | Endpoint              | Description                    |
| :---   | :---                  | :---                           |
| `GET`    | `/products`           | Retrieves a list of all products.    |
| `GET`    | `/products/{id}`      | Retrieves a single product by its unique ID. |
| `POST`   | `/products`           | Creates a new product.         |
| `PUT`    | `/products/{id}`      | Updates an existing product.   |
| `DELETE` | `/products/{id}`      | Deletes a product by its ID.   |

## How to Run Locally

1.  **Clone the Repository**
    ```bash
    git clone [https://github.com/your-username/your-repo-name.git](https://github.com/your-username/your-repo-name.git)
    ```

2.  **Set Up MySQL**
    * Create a new database in your local MySQL instance (e.g., `inventory_db`).
    * Open the `src/main/resources/application.properties` file.
    * Update the `spring.datasource.url`, `spring.datasource.username`, and `spring.datasource.password` properties with your local MySQL credentials.

3.  **Build and Run the Application**
    * You can run the application directly from your IDE (like IntelliJ or VS Code).
    * Alternatively, you can build and run it using Maven:
    ```bash
    # Build the project
    mvn clean install

    # Run the application
    mvn spring-boot:run
    ```
    The application will start on `http://localhost:8080`.
