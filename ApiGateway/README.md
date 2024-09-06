# ApiGateway

## Overview
ApiGateway is a Spring Boot application that acts as a gateway for all microservices in the system. It provides a single entry point for client requests, routing them to the appropriate microservices. The ApiGateway integrates with Eureka for service discovery and dynamic routing, offering load balancing and security features.

## Features
- **Centralized Routing**: Routes client requests to the appropriate microservice.
- **Service Discovery**: Integrates with Eureka Server for dynamic routing of requests.
- **Load Balancing**: Distributes incoming requests across multiple instances of microservices.
- **Security**: Acts as a gatekeeper, providing centralized authentication and security features.

## Configuration
- **Server Port**: `8080` (Default for ApiGateway)
- **Eureka Client**: Registers with Eureka for dynamic service discovery.

## Setup and Run

**Clone the repository**:
```bash
git clone https://github.com/chandrakanthrck/MicroService.git
```
### Navigate to the ApiGateway directory:

```bash
cd ApiGateway
```
### Run the application:

```bash
mvn spring-boot:run
```


### Important Endpoints:
- **Ratings API**: [http://localhost:8080](http://localhost:8080) - The base URL for accessing rating-related endpoints.
- **Eureka Dashboard**: [http://localhost:8761](http://localhost:8761) - View the service registered in Eureka.

- ### Key Dependencies:
- **Spring Boot**
- **Spring Data MongoDB**
- **MongoDB**
- **Spring Cloud Eureka Client**
- **Spring Cloud Netflix**
