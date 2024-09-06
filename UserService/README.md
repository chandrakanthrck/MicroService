# UserService

## Overview
UserService is a Spring Boot application that manages user-related data, including user profiles and associated actions. It integrates with MySQL for data storage and registers itself with Eureka Server for service discovery in the microservices architecture.

## Features
- **User Management**: Provides CRUD operations for managing user data.
- **Service Discovery**: Registers with Eureka Server for dynamic service discovery.
- **Database Integration**: Uses MySQL for storing and retrieving user data.
- **RESTful APIs**: Exposes RESTful endpoints for interacting with user-related data.

## Configuration
- **Server Port**: `8081` (Default for UserService)
- **Database**: MySQL
- **Eureka Client**: Registers with Eureka for service discovery.

## Setup and Run

**Clone the repository**:
```bash
git clone https://github.com/chandrakanthrck/MicroService.git
```
### Navigate to the UserService directory:

```bash
cd UserService
```
### Run the application:

```bash
mvn spring-boot:run
```


### Important Endpoints:
- **UserService API**: [http://localhost:8081](http://localhost:8081) - The base URL for accessing UserService-related endpoints.
- **Eureka Dashboard**: [http://localhost:8761](http://localhost:8761) - View the service registered in Eureka.

### Key Dependencies:
- **Spring Boot**
- **Spring Data MongoDB**
- **MongoDB**
- **Spring Cloud Eureka Client**
- **Spring Cloud Netflix**
