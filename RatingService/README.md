# RatingService

## Overview
RatingService is a Spring Boot application that manages rating-related information for hotels. It allows users to submit and view ratings for various hotels and integrates with MongoDB for data storage. This service is part of a microservices architecture and registers itself with the Eureka Server for service discovery.

## Features
- **Rating Management**: Provides CRUD operations for managing hotel ratings.
- **Service Discovery**: Registers with Eureka Server for dynamic service discovery.
- **Database Integration**: Uses MongoDB for storing and retrieving rating data.
- **RESTful APIs**: Exposes RESTful endpoints for interacting with ratings.

## Configuration
- **Server Port**: `8083` (Default for RatingService)
- **Database**: MongoDB
- **Eureka Client**: Registers with Eureka for service discovery.

## Setup and Run

1. **Clone the repository**:
   ```bash
   git clone https://github.com/chandrakanthrck/MicroService.git
```
### Navigate to the RatingService directory:

```bash
cd RatingService
```
### Run the application:

```bash
mvn spring-boot:run
```


### Important Endpoints:
- **Ratings API**: [http://localhost:8083](http://localhost:8083) - The base URL for accessing rating-related endpoints.
- **Eureka Dashboard**: [http://localhost:8761](http://localhost:8761) - View the service registered in Eureka.

### Key Dependencies:
- **Spring Boot**
- **Spring Data MongoDB**
- **MongoDB**
- **Spring Cloud Eureka Client**
- **Spring Cloud Netflix**
