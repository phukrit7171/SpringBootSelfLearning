# Spring Boot Self Learning Project

This is a Spring Boot application created for learning purposes.

## Project Overview

This project is a basic Spring Boot web application that demonstrates fundamental concepts of the Spring Boot framework. It's designed as a foundation for learning and experimentation with Spring Boot features.

## Prerequisites

### Before you begin, ensure you have the following installed:

- Java 21 or higher
- Maven 3.6 or higher
- Git (for version control)

## Getting Started

### Clone the Repository

```bash
git clone git@github.com:phukrit7171/SpringBootSelfLearning.git
cd SpringBootSelfLearning
```

### Build the Project

#### To build the project, run

```bash
./mvnw clean package
```

Or if you have Maven installed globally:

```bash
mvn clean package
```

### Run the Application

#### You can run the application in several ways

1. Using Maven:

   ```bash
   ./mvnw spring-boot:run
   ```

2. Running the JAR file after building:

   ```bash
   java -jar target/learning-0.0.1-SNAPSHOT.jar
   ```

3. Directly from the source code:

   ```bash
   ./mvnw clean spring-boot:run
   ```

The application will start on port 8080 by default. You can access it at http://localhost:8080.

## Project Structure

```text

src/
├── main/
│   ├── java/
│   │   └── edu/phukrit/learning/
│   │       └── LearningApplication.java
│   └── resources/
│       ├── application.properties
│       ├── static/
│       └── templates/
└── test/
    └── java/
        └── edu/phukrit/learning/
            └── LearningApplicationTests.java
```

## Dependencies

This project uses the following main dependencies:

- `spring-boot-starter-web`: For building web applications, including RESTful services
- `spring-boot-starter-test`: For testing the application

## Configuration

The application configuration can be found in `src/main/resources/application.properties`:

```properties
spring.application.name=learning
```

## API Endpoints

Currently, this is a basic Spring Boot application. As you develop the application, you can document your API endpoints here.

## Development

To contribute to this project:

1. Fork the repository
2. Create a new branch for your feature
3. Commit your changes
4. Push to your branch
5. Create a pull request

## Testing

To run the tests, use:

```bash
./mvnw test
```

## Built With

- [Spring Boot](https://spring.io/projects/spring-boot) - The web framework used
- [Maven](https://maven.apache.org/) - Dependency management

## Versioning

This project uses [SemVer](http://semver.org/) for versioning.

## Authors

- **Phukrit** - *Initial work*

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details if it exists.

## Acknowledgments

- This project was created for learning purposes
- Inspired by Spring Boot documentation and tutorials
