# ServiceRegistry

## Overview
ServiceRegistry is a Spring Boot application that serves as a **Eureka Server** for centralized service registration and discovery in a microservices architecture. It allows different microservices to register themselves and discover other services dynamically, enabling load balancing and fault tolerance.

## Features
- **Centralized Service Registry**: Provides a directory of available microservices.
- **Service Discovery**: Microservices can automatically discover other services.
- **Health Monitoring**: Monitors service health and availability.
- **Fault Tolerance**: Supports dynamic load balancing and service failover.
- **Web Dashboard**: A user-friendly dashboard to view registered services and their statuses.

## Configuration
- **Server Port**: `8761` (Default for Eureka)
- **Eureka Dashboard**: Accessible at [http://localhost:8761/](http://localhost:8761/)

## Setup and Run

1. **Clone the repository**:
   ```bash
   git clone https://github.com/chandrakanthrck/MicroService.git
```
### Navigate to the ServiceRegistry directory:

```bash
cd ServiceRegistry
```
### Run the application:

```bash
mvn spring-boot:run
```

### Important Endpoints:
- **Eureka Dashboard**: [http://localhost:8761](http://localhost:8761) - A web interface to monitor registered services and their health status.

### Key Dependencies:
- **Spring Boot**
- **Spring Cloud Eureka Server**
- **Spring Cloud Netflix**
