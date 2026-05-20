# Hello World - Maven Java Project

A simple Maven-based Java project demonstrating the basic structure and setup of a Maven application.

## Project Structure

```
hello-world/
├── pom.xml
├── README.md
└── src/
    ├── main/
    │   ├── java/
    │   │   └── com/
    │   │       └── example/
    │   │           └── HelloWorld.java
    │   └── resources/
    └── test/
        └── java/
            └── com/
                └── example/
                    └── HelloWorldTest.java
```

## Prerequisites

- Java 11 or higher
- Maven 3.6.0 or higher

## Building the Project

To build the project, navigate to the project root directory and run:

```bash
mvn clean package
```

This command will:
- Clean any previous build artifacts
- Compile the source code
- Run the tests
- Package the application into a JAR file

## Running the Application

There are multiple ways to run the application:

### Method 1: Using Maven

```bash
mvn exec:java -Dexec.mainClass="com.example.HelloWorld"
```

### Method 2: Using the Compiled JAR

After building with `mvn clean package`, run the JAR file:

```bash
java -jar target/hello-world-app.jar
```

## Running Tests

To run the unit tests:

```bash
mvn test
```

To run a specific test:

```bash
mvn test -Dtest=HelloWorldTest
```

## Common Maven Commands

- `mvn clean` - Remove the target directory and build artifacts
- `mvn compile` - Compile the source code
- `mvn package` - Compile and package the application
- `mvn install` - Install the package into your local Maven repository
- `mvn test` - Run the unit tests
- `mvn clean package` - Full build (clean, compile, test, package)

## Configuration

The project is configured with the following specifications:

- **Java Version**: 11
- **Encoding**: UTF-8
- **Test Framework**: JUnit 4.13.2
- **Main Class**: com.example.HelloWorld

## License

This project is provided as-is for educational purposes.
