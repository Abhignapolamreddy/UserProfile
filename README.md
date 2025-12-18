UseProfile
A A Spring Boot backend API for managing users, hospital, patients, adimn Demonstrates understanding of RESTful APIs, JPA relationships (1:1, 1:N, N:M), input validation, pagination, and custom exception handling.

Technology Stack
Java 17+
Spring Boot 3.x
Spring Data JPA
MySQL Database
Maven
Database Setup
This project uses MySQL as the database.

1. Create Database
CREATE DATABASE task;

### 2. Add MySQL Connector Dependency

In your `pom.xml`:

```xml
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <version>8.1.0</version>
</dependency>
3. Configure application.properties
# MySQL Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/hospital
spring.datasource.username=root
spring.datasource.password=*****
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# JPA / Hibernate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

# Server
server.port=8080
Build and Run
mvn clean install
mvn spring-boot:run
The application will start at: http://localhost:8080

