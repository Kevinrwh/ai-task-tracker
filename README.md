# AI Task Tracker

A RESTful API for task management built with Spring Boot and Java 21.

## Features

- **CRUD Operations**: Create, read, update, and delete tasks
- **RESTful API**: Clean HTTP endpoints following REST conventions
- **Error Handling**: Proper HTTP status codes and error responses
- **In-Memory Storage**: Simple task storage (no database required)
- **Spring Boot**: Modern Java framework with embedded Tomcat server
- **Maven Build**: Standard Java build tool with dependency management

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET    | `/tasks` | Get all tasks |
| POST   | `/tasks` | Create a new task |
| PUT    | `/tasks/{id}` | Update an existing task |
| DELETE | `/tasks/{id}` | Delete a task |

### Example Usage

#### Create a Task
```bash
curl -X POST http://localhost:8080/tasks \
  -H "Content-Type: application/json" \
  -d '{"title": "Learn Spring Boot", "completed": false}'
```

#### Get All Tasks
```bash
curl http://localhost:8080/tasks
```

#### Update a Task
```bash
curl -X PUT http://localhost:8080/tasks/1 \
  -H "Content-Type: application/json" \
  -d '{"title": "Learn Spring Boot", "completed": true}'
```

#### Delete a Task
```bash
curl -X DELETE http://localhost:8080/tasks/1
```

## Getting Started

### Prerequisites

- Java 21 or higher
- Maven 3.6+ (or use the included Maven wrapper)

### Running the Application

1. **Clone the repository**
   ```bash
   git clone https://github.com/Kevinrwh/ai-task-tracker.git
   cd ai-task-tracker
   ```

2. **Run the application**
   ```bash
   ./mvnw spring-boot:run
   ```

3. **Access the API**
   - Base URL: http://localhost:8080
   - Tasks endpoint: http://localhost:8080/tasks

### Building the Application

```bash
# Compile
./mvnw clean compile

# Run tests
./mvnw test

# Package as JAR
./mvnw clean package
```

## Project Structure

```
src/
├── main/
│   ├── java/com/kevin/ai_task_tracker/
│   │   ├── AITaskTrackerApplication.java    # Main Spring Boot application
│   │   ├── controller/
│   │   │   └── TaskController.java          # REST API endpoints
│   │   └── model/
│   │       └── Task.java                    # Task entity
│   └── resources/
│       └── application.properties           # Application configuration
└── test/
    └── java/com/kevin/ai_task_tracker/
        └── AITaskTrackerApplicationTests.java # Unit tests
```

## Technology Stack

- **Java 21** - Programming language
- **Spring Boot 3.4.4** - Application framework
- **Spring Web** - REST API framework
- **Maven** - Build and dependency management
- **JUnit 5** - Testing framework
- **Lombok** - Reduces boilerplate code

## Task Model

```json
{
  "id": 1,
  "title": "Task description",
  "completed": false
}
```

## Error Handling

The API returns appropriate HTTP status codes:

- `200 OK` - Successful GET, PUT operations
- `201 Created` - Successful POST operations
- `404 Not Found` - Task not found
- `400 Bad Request` - Invalid request data

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is open source and available under the [MIT License](LICENSE).

## Future Enhancements

- [ ] Database persistence (H2, PostgreSQL, etc.)
- [ ] User authentication and authorization
- [ ] Task categories and tags
- [ ] Due dates and priorities
- [ ] AI-powered task suggestions
- [ ] Web frontend interface
- [ ] Docker containerization
