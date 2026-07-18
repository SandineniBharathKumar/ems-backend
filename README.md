# Employee Management System (EMS) - Backend

A Spring Boot REST API developed for the Employee Management System application. It provides CRUD operations for managing employee records and is connected to a MySQL database hosted on Railway.

---

## Live API

Backend API:

https://ems-backend-production-5a36.up.railway.app/api/employees

---

## Features

- Create employee records
- Retrieve employee details
- Update employee information
- Delete employee records
- RESTful API design
- MySQL database integration
- Spring Data JPA and Hibernate implementation

---

## Tech Stack

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- REST APIs

---

## Deployment

- Backend: Railway
- Database: Railway MySQL

---

## API Endpoints

| Method | Endpoint | Description |
|--------|---------|---------|
| GET | /api/employees | Get all employees |
| GET | /api/employees/{id} | Get employee by ID |
| POST | /api/employees | Create employee |
| PUT | /api/employees/{id} | Update employee |
| DELETE | /api/employees/{id} | Delete employee |

---

## Project Structure

```
src
│
├── controller
├── dto
├── entity
├── exception
├── mapper
├── repository
├── service
└── resources
```

---

## Getting Started

Clone the repository:

```bash
git clone https://github.com/SandineniBharathKumar/ems-backend.git
```

Navigate to the project:

```bash
cd ems-backend
```

Build the project:

```bash
./mvnw clean install
```

Run the application:

```bash
./mvnw spring-boot:run
```

---

## Frontend Repository

https://github.com/SandineniBharathKumar/ems-frontend

---

## Author

Sandineni Bharath Kumar

GitHub:
https://github.com/SandineniBharathKumar

---

## License

This project was developed for learning and portfolio purposes.
