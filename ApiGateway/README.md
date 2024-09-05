# ApiGateway Service

## Overview
The **ApiGateway** is a microservice that serves as a single entry point to the other microservices in the system. It routes requests to the appropriate services (such as `HotelService`, `RatingService`, and `UserService`) and provides centralized access through a single API endpoint.

This gateway uses **Spring Cloud Gateway** to manage routing, load balancing, and security across multiple services.

## Features
- **Routing**: Routes requests to the appropriate microservice based on the URL path.
- **Load Balancing**: Distributes the load among the instances of microservices.
- **Cross-Origin Resource Sharing (CORS)**: Manages CORS to allow or restrict resources.
- **Security**: (Optional) Integrates with security layers (can integrate with JWT, OAuth).

## Technologies
- **Spring Boot**
- **Spring Cloud Gateway**
- **Spring Cloud Eureka** (for service discovery)