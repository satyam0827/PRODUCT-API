# 🛒 PRODUCT-API

This is a backend project I built using **Spring Boot** to manage products through REST APIs.
The main goal was to understand how real-world backend systems work — handling data, structuring APIs, and connecting everything cleanly with a database.

---

## 🚀 What this project does

* Create new products
* View all products
* Get product details by ID
* Update product information
* Delete products

Basically, a complete **CRUD-based REST API**.

---

## 🛠️ Tech Stack

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* Hibernate
* MySQL / H2
* Maven

---

## 📂 How the project is structured

I followed a layered approach to keep things clean and scalable:

* **Controller** → handles API requests
* **Service** → contains business logic
* **Repository** → interacts with database
* **Model** → defines product structure

---

## ⚙️ How to run this project

### 1. Clone the repo

```bash
git clone https://github.com/satyam0827/PRODUCT-API.git
cd PRODUCT-API
```

---

### 2. Setup database

Update your `application.properties` with your database details:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_db
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
```

---

### 3. Run the project

```bash
mvn spring-boot:run
```

Then open:

```
http://localhost:8080
```

---

## 📡 API Endpoints

| Method | Endpoint             | Purpose            |
| ------ | -------------------- | ------------------ |
| POST   | `/api/products`      | Add product        |
| GET    | `/api/products`      | Get all products   |
| GET    | `/api/products/{id}` | Get single product |
| PUT    | `/api/products/{id}` | Update product     |
| DELETE | `/api/products/{id}` | Delete product     |

---

## 📦 Example Request

```json
{
  "name": "Laptop",
  "price": 50000,
  "quantity": 10
}
```

---

## 💡 What I learned

While building this project, I got hands-on experience with:

* Designing REST APIs properly
* Structuring backend code (Controller → Service → Repo)
* Using JPA & Hibernate for database operations
* Handling real-world CRUD operations

---

## 🔮 What I plan to improve

* Add authentication (JWT)
* Add pagination & filtering
* Write proper test cases
* Deploy the API online

---

## ⭐ If you found this useful

Give it a star ⭐ — it motivates me to build more projects!
