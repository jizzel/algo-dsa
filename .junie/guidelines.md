# Project Development Guidelines

This document provides guidelines and information for developers working on this project.

## Build/Configuration Instructions

### Maven Configuration

The project uses Maven for build management with the following configuration:

- Java version: 21
- Project encoding: UTF-8
- Group ID: org.algodsa
- Artifact ID: java

### Building the Project

To build the project, run:

```bash
cd java
mvn clean install
```

This will compile the code, run the tests, and create a JAR file in the `target` directory.

## Testing Information

### Testing Framework

The project uses JUnit Jupiter (JUnit 5) for testing. Tests are located in the `java/src/test/java/org/algodsa` directory.

### Running Tests

To run all tests:

```bash
cd java
mvn test
```

To run a specific test class:

```bash
cd java
mvn test -Dtest=ClassName
```

For example:

```bash
mvn test -Dtest=StringReverserTest
```

### Creating New Tests

1. Create a new test class in the `java/src/test/java/org/algodsa` directory
2. Use the `@Test` annotation from JUnit Jupiter for test methods
3. Use assertion methods from `org.junit.jupiter.api.Assertions` to verify results
4. Follow the existing pattern of creating separate test methods for different scenarios

Example test class structure:

```java
package test.java.org.algodsa;

import main.java.org.algodsa.YourClass;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class YourClassTest {

    YourClass instance = new YourClass();

    @Test
    void testBasicFunctionality() {
        // Test basic functionality
        assertEquals(expectedValue, instance.method(input));
    }

    @Test
    void testEdgeCase() {
        // Test edge cases
        assertNull(instance.method(null));
    }
}
```

## Additional Development Information

### Code Style

The project follows these code style guidelines:

1. Classes should have proper Javadoc comments describing their purpose
2. Methods should have Javadoc comments including:
   - Description of functionality
   - Time and space complexity analysis
   - Parameter descriptions
   - Return value description
3. Use meaningful variable and method names
4. Include null checks and edge case handling

### Algorithm Implementation Pattern

Each algorithm implementation should:

1. Be placed in its own class in the `java/src/main/java/org/algodsa` directory
2. Include a default constructor
3. Provide detailed documentation including time and space complexity
4. Include references to related problems (e.g., LeetCode problem numbers)
5. Consider providing alternative implementations with different trade-offs

### Testing Pattern

Tests should:

1. Test basic functionality
2. Test edge cases (null inputs, empty strings, etc.)
3. Test special cases relevant to the algorithm
4. Be organized into separate methods for different scenarios
5. Use descriptive method names that explain what is being tested