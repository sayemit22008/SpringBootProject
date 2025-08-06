# Student Grading System

A Spring Boot application for managing student grades with automatic grading calculations.

## Features

- **Add Student Records**: Input student name and three class test marks
- **Automatic Grade Calculation**: Calculates average of three test marks
- **Grading System** (based on marks out of 20):
  - **Excellent**: Average ≥ 16/20 (80%)
  - **Good**: Average ≥ 15/20 (75%)
  - **Try Harder**: Average < 15/20 (75%)
- **Database Storage**: Student information and grades saved to MySQL database
- **Web Interface**: User-friendly web interface built with Thymeleaf and Bootstrap
- **CRUD Operations**: Create, Read, Update, and Delete student records
- **REST API**: RESTful endpoints for programmatic access

## Prerequisites

Before running this application, ensure you have:

1. **Java 21** or higher installed
2. **Maven 3.6+** installed
3. **MySQL 8.0+** installed and running
4. **IntelliJ IDEA** (recommended IDE)

## Database Setup

1. Start your MySQL server
2. Create a database (the application will create it automatically if it doesn't exist):
   ```sql
   CREATE DATABASE sms;
   ```
3. Database credentials are configured as:
   ```properties
   spring.datasource.username=root
   spring.datasource.password=22008
   ```

## Running the Application

### Method 1: Using Maven (Command Line)
```bash
# Navigate to project directory
cd student-grading-system

# Run the application
mvn spring-boot:run
```

### Method 2: Using IntelliJ IDEA
1. Open IntelliJ IDEA
2. File → Open → Select the `student-grading-system` folder
3. Wait for Maven to import dependencies
4. Run the `StudentGradingSystemApplication.java` class

### Method 3: Package and Run JAR
```bash
# Build the project
mvn clean package

# Run the JAR file
java -jar target/student-grading-system-0.0.1-SNAPSHOT.jar
```

## Access the Application

Once the application is running:

- **Web Interface**: http://localhost:8080
- **REST API Base URL**: http://localhost:8080/api/students

## REST API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/students` | Get all students |
| GET | `/api/students/{id}` | Get student by ID |
| POST | `/api/students/create` | Create new student |
| PUT | `/api/students/{id}` | Update student |
| DELETE | `/api/students/{id}` | Delete student |

### Sample JSON for Creating/Updating Student:
```json
{
  "name": "John Doe",
  "classTest1": 18.5,
  "classTest2": 19.0,
  "classTest3": 16.5
}
```

## Project Structure

```
student-grading-system/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/studentgrading/
│   │   │       ├── StudentGradingSystemApplication.java
│   │   │       ├── controller/
│   │   │       │   ├── StudentController.java (REST API)
│   │   │       │   └── WebController.java (Web Interface)
│   │   │       ├── entity/
│   │   │       │   └── Student.java
│   │   │       ├── repository/
│   │   │       │   └── StudentRepository.java
│   │   │       └── service/
│   │   │           └── StudentService.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── templates/
│   │           ├── index.html
│   │           ├── add-student.html
│   │           └── edit-student.html
│   └── test/
└── pom.xml
```

## Technologies Used

- **Spring Boot 3.2.0**
- **Spring Data JPA**
- **Spring Web**
- **Thymeleaf** (Template Engine)
- **MySQL** (Database)
- **Bootstrap 5** (Frontend Styling)
- **Maven** (Build Tool)

## IntelliJ IDEA Configuration

This project is fully compatible with IntelliJ IDEA:

1. **Import Project**: File → Open → Select project folder
2. **Maven Auto-Import**: Should be enabled automatically
3. **Run Configuration**: IntelliJ will detect the main class automatically
4. **Database Integration**: Use IntelliJ's Database tool window to connect to MySQL

## Development Notes

- The application uses Spring Boot DevTools for hot reloading during development
- Hibernate DDL is set to `update` to automatically create/update database schema
- SQL queries are logged in the console for debugging (can be disabled in production)

## Troubleshooting

### Common Issues:

1. **Database Connection Error**: 
   - Ensure MySQL is running
   - Check username/password in `application.properties`

2. **Port Already in Use**:
   - Change the port in `application.properties`: `server.port=8081`

3. **Maven Dependencies Not Loading**:
   - Run `mvn clean install` in terminal
   - In IntelliJ: File → Reload Maven Project

## License

This project is created for educational purposes.
