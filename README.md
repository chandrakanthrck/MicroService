# Microservices Project

## Overview
This project is a microservices-based architecture built using **Spring Boot** and **Spring Cloud**. It includes several independent services, each with its own functionality. Each service communicates via RESTful APIs and integrates with a central **Eureka Server** for service registration and discovery.

## Microservices

1. **HotelService**: Manages hotel-related data such as hotel details, locations, etc.
    - [HotelService README](./hotelservice/README.md)

2. **RatingService**: Manages ratings for hotels and allows users to submit and view ratings.
    - [RatingService README](./ratingservice/README.md)

3. **UserService**: Handles user-related data such as user profiles and associated actions.
    - [UserService README](./userservice/README.md)

4. **ServiceRegistry**: Acts as the **Eureka Server** for service discovery.
    - [ServiceRegistry README](./serviceregistry/README.md)

5. **ApiGateway**: Provides a single entry point for all the services through a gateway.
    - [ApiGateway README](./apigateway/README.md)

## Project Setup

### Prerequisites
- Java 17+
- Maven 3+
- PostgreSQL, MySQL, MongoDB installed locally or accessible via cloud services.

### Clone the repository
To clone this repository, use the following command:
```bash
git clone https://github.com/chandrakanthrck/MicroService/
```
## Setting up Databases

Ensure that your local databases (**PostgreSQL**, **MySQL**, **MongoDB**) are running. You may need to create the respective databases:

- **PostgreSQL** (for HotelService)
- **MongoDB** (for RatingService)
- **MySQL** (for UserService)

Each microservice contains more detailed information about its own setup in their respective README files.

## Config Server Integration

This project integrates with a separate **Spring Cloud Config Server** for centralized configuration management. The Config Server handles environment-specific configurations for all the microservices.

You can find the Config Server repository here:  
[Config Server Repository](https://github.com/chandrakanthrck/microservice-config)

### Setting Up the Config Server
To set up the Config Server, clone the repository and follow the instructions in its README.

```bash
git clone https://github.com/your-username/config-server-repo.git
cd config-server-repo
mvn spring-boot:run
```
Once the Config Server is running, microservices will automatically fetch configurations from it.

## Swagger API Documentation

Each microservice is integrated with **Swagger** for easy API documentation and testing. Once the services are running, you can access the Swagger UI for each service to explore the available API endpoints:

- **HotelService**: [http://localhost:8082/swagger-ui.html](http://localhost:8082/swagger-ui.html)
- **RatingService**: [http://localhost:8083/swagger-ui.html](http://localhost:8083/swagger-ui.html)
- **UserService**: [http://localhost:8081/swagger-ui.html](http://localhost:8081/swagger-ui.html)
- **ApiGateway**: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## Running the Services

To run each microservice, navigate to its respective directory and run:

```bash
mvn spring-boot:run
```

## Accessing the Services

Once the services are running, you can access them on the following ports:

- **Eureka Dashboard**: [http://localhost:8761/](http://localhost:8761/)
- **HotelService**: [http://localhost:8082/](http://localhost:8082/)
- **RatingService**: [http://localhost:8083/](http://localhost:8083/)
- **UserService**: [http://localhost:8081/](http://localhost:8081/)
- **ApiGateway**: [http://localhost:8080/](http://localhost:8080/)

## Key Technologies

- **Spring Boot**
- **Spring Cloud Eureka**
- **Spring Data JPA**
- **PostgreSQL**, **MongoDB**, **MySQL**
- **Swagger** for API documentation
- **Maven** for project management

## Additional Information

Please refer to each service’s individual README file for more detailed instructions and API information:

- [HotelService README](./hotelservice/README.md)
- [RatingService README](./ratingservice/README.md)
- [UserService README](./userservice/README.md)
- [ServiceRegistry README](./serviceregistry/README.md)
- [ApiGateway README](./apigateway/README.md)
