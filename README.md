# Spring Plant Tracker 🌱

A full CRUD REST API for tracking indoor plants and watering schedules, built with Spring Boot. This project was built to strengthen backend fundamentals — REST API design, layered architecture, and working with a persistence layer through Spring Data JPA.

## Skills Practiced

- **REST API design** — implementing standard HTTP methods (GET, POST, PUT, DELETE) with proper resource-based routing (`/api/v1/plants`)
- **Layered architecture** — separating concerns across controller, service, and repository layers so business logic, data access, and request handling don't mix
- **Spring Data JPA** — mapping a Java class to a database table using a JPA entity, and using a repository interface to handle persistence without writing raw SQL
- **Dependency injection** — wiring the service and repository layers together using Spring's constructor-based injection
- **Database fundamentals** — working with an in-memory H2 database and inspecting it directly through a browser console

## Architecture

The project follows a layered architecture, a common backend pattern for keeping code organized and easy to extend:

```
controller/   → Handles HTTP requests and responses
service/      → Contains business logic
repository/   → Handles data access (Spring Data JPA)
model/        → Defines the Plant entity
```

## Features

- Add a new plant with a name and last-watered date
- View all tracked plants
- Update a plant's name or last-watered date
- Remove a plant from tracking
