# Spring Cloud Gateway Microservices

A sample microservices project using **Spring Boot**, **Spring Cloud Gateway**, and **Eureka** for service discovery.

---

## Services

| Service           | Port  |
|------------------|-------|
| Eureka Server     | 8761  |
| User Service      | 8081  |
| Product Service   | 8082  |
| Gateway           | 8080  |

---

## Running the Application

1. Start **Eureka Server**  
2. Start **User Service**  
3. Start **Product Service**  
4. Start **Gateway**  

---

## API Endpoints

| URL                                   | Service        |
|--------------------------------------|----------------|
| `http://localhost:8080/users/1`      | User Service   |
| `http://localhost:8080/products/1`   | Product Service|

---

## Notes

- Check **Eureka Dashboard** at `http://localhost:8761` to see running services.  
- If you get **503**, the microservice may not be running.  
- If you get **404**, check the URL or route configuration.
