# UserService

## Overview
UserService is a Spring Boot application that handles user-related information. It integrates with MySQL for data storage and is registered with the Eureka Server for service discovery.

## Features
- CRUD operations for users
- Integration with MySQL for data storage
- Eureka Client for service registration and discovery

## Configuration
- Server Port: 8081
- Database: MySQL

## How to Run
1. Ensure that MySQL is running on `localhost:3306`.
2. Run the application using Maven:
   ```bash
   mvn spring-boot:run
