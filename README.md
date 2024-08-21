# Microservices Project

## Overview
This project is a microservices-based architecture that includes four services: HotelService, RatingService, UserService, and ServiceRegistry. Each service is built using Spring Boot and integrates with a central Eureka Server for service registration and discovery.

## Services

### 1. HotelService
- **Description**: Manages hotel-related data.
- **Database**: PostgreSQL
- **Port**: 8082

### 2. RatingService
- **Description**: Manages ratings for hotels.
- **Database**: MongoDB
- **Port**: 8083

### 3. UserService
- **Description**: Manages user-related data.
- **Database**: MySQL
- **Port**: 8081

### 4. ServiceRegistry
- **Description**: Acts as the Eureka Server for service discovery.
- **Port**: 8761

## Project Setup
1. **Clone the repository**:
   ```bash
   git clone <repository-url>
