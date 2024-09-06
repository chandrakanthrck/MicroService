# HotelService

## Overview
HotelService is a Spring Boot application that manages hotel-related data, such as hotel details and locations. It integrates with PostgreSQL for data storage and registers itself with Eureka Server for service discovery in the microservices architecture.

## Features
- **Hotel Management**: Provides CRUD operations for managing hotel data.
- **Service Discovery**: Registers with Eureka Server for dynamic service discovery.
- **Database Integration**: Uses PostgreSQL for storing and retrieving hotel data.
- **RESTful APIs**: Exposes RESTful endpoints for interacting with hotel-related data.

## Configuration
- **Server Port**: `8082` (Default for HotelService)
- **Database**: PostgreSQL
- **Eureka Client**: Registers with Eureka for service discovery.

## Setup and Run
**Clone the repository**:
```bash
git clone https://github.com/chandrakanthrck/MicroService.git
```
### Navigate to the RatingService directory:
```bash
cd HotelService
```
### Run the application:
```bash
mvn spring-boot:run
```


### Important Endpoints:
- **Ratings API**: [http://localhost:8082](http://localhost:8082) - The base URL for accessing rating-related endpoints.
- **Eureka Dashboard**: [http://localhost:8761](http://localhost:8761) - View the service registered in Eureka.

### Key Dependencies:
- **Spring Boot**
- **Spring Data MongoDB**
- **MongoDB**
- **Spring Cloud Eureka Client**
- **Spring Cloud Netflix**
