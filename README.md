# Task-Management-System
Task Management System
# Task Management System

A backend application for managing users, projects, and tasks.

This project is built with Java and Spring Boot and is designed as a realistic backend application for my GitHub portfolio.

## 🎯 Project Goals

The main goals of this project are:

* Build a realistic Java backend application
* Develop a RESTful API
* Design and use a relational database
* Apply a clean layered architecture
* Implement validation and exception handling
* Write unit and integration tests
* Use Docker for the PostgreSQL database
* Follow clean and maintainable coding practices

## 🛠️ Technologies

* Java 21
* Spring Boot
* Spring Data JPA
* Hibernate
* PostgreSQL 16
* Maven
* Docker
* JUnit 5
* Mockito
* REST API

## 🏗️ Architecture

The application follows a layered architecture:

```text
Client
   │
   ▼
Controller
   │
   ▼
Service
   │
   ▼
Repository
   │
   ▼
PostgreSQL
```

### Controller Layer

Handles HTTP requests and responses.

### Service Layer

Contains the business logic of the application.

### Repository Layer

Handles database access using Spring Data JPA.

### Entity Layer

Represents the objects stored in the database.

### DTO Layer

Separates the API models from the database entities.

## 📦 Domain Model

The application will contain the following main entities:

* User
* Project
* Task

The relationships between these entities will be designed and documented during development.

## 🗄️ Database

The application uses PostgreSQL 16 as its relational database.

PostgreSQL runs inside a Docker container.

```text
Spring Boot
     │
     ▼
PostgreSQL
     │
     ▼
task_management database
```

## 🧪 Testing

Testing is an important part of this project.

The testing strategy will include:

* Unit tests
* Service tests
* Repository tests
* Controller tests
* Integration tests

The project currently includes a Spring Boot application context test.

## 🐳 Docker

PostgreSQL is managed using Docker Compose.

Start PostgreSQL:

```bash
docker compose up -d
```

Stop PostgreSQL:

```bash
docker compose down
```

## 🚀 How to Run

### Prerequisites

Make sure the following are installed:

* Java 21
* Maven
* Docker Desktop

### Start the Database

```bash
docker compose up -d
```

### Build the Application

```bash
mvn clean install
```

### Run the Application

```bash
mvn spring-boot:run
```

## 📋 Development Roadmap

### Project Setup

* [x] Create Spring Boot project
* [x] Configure Maven
* [x] Configure PostgreSQL
* [x] Configure Docker
* [x] Connect Spring Boot to PostgreSQL
* [x] Verify application context

### Database Design

* [ ] Design User entity
* [ ] Design Project entity
* [ ] Design Task entity
* [ ] Define relationships
* [ ] Define database constraints

### Backend Development

* [ ] Implement entities
* [ ] Implement repositories
* [ ] Implement services
* [ ] Implement DTOs
* [ ] Implement REST controllers
* [ ] Add validation
* [ ] Add exception handling

### Testing

* [ ] Unit tests
* [ ] Repository tests
* [ ] Controller tests
* [ ] Integration tests

### API Documentation

* [ ] Add Swagger / OpenAPI
* [ ] Document REST endpoints
* [ ] Add example requests and responses

### Future Improvements

* [ ] Authentication
* [ ] Authorization
* [ ] Pagination
* [ ] Filtering and sorting
* [ ] Logging
* [ ] CI/CD
* [ ] Production Docker setup

## 💡 Design Decisions

Technical decisions and their reasoning will be documented throughout the development of the project.

Examples:

* Why PostgreSQL was chosen
* Why layered architecture is used
* Why DTOs are used
* How entity relationships are designed
* How transactions are handled
* How validation and exception handling are implemented

## 📚 What I Learned

This section will be updated during development with important technical concepts, problems, and solutions.

## 🔮 Future Improvements

Possible future improvements include:

* JWT authentication
* Role-based authorization
* Advanced task filtering
* Pagination and sorting
* Audit logging
* CI/CD pipeline
* Cloud deployment

## 📄 License

This project is a personal portfolio and learning project.
