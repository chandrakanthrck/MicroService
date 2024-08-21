# RatingService

## Overview
RatingService is a Spring Boot application that manages rating-related information. It interacts with MongoDB for data storage and registers with the Eureka Server for service discovery.

## Features
- CRUD operations for ratings
- Integration with MongoDB for data storage
- Eureka Client for service registration and discovery

## Configuration
- Server Port: 8083
- Database: MongoDB

## How to Run
1. Ensure that MongoDB is running on `localhost:27017`.
2. Run the application using Maven:
   ```bash
   mvn spring-boot:run
