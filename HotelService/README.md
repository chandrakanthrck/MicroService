# HotelService

## Overview
HotelService is a Spring Boot application that provides services for managing hotel-related information. It is a part of the microservices architecture and interacts with other services like UserService and RatingService.

## Features
- CRUD operations for hotels
- Integration with PostgreSQL for data storage
- Eureka Client for service registration and discovery

## Configuration
- Server Port: 8082
- Database: PostgreSQL

## How to Run
1. Ensure that PostgreSQL is running on `localhost:5433`.
2. Run the application using Maven:
   ```bash
   mvn spring-boot:run
