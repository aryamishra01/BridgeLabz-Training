 # Java Functional Programming

### 📅 Day 1 – Java Lambdas, Method References & Functional Interfaces  
**(Date: 27-01-2026)**

## Lambda Expressions
- **Anonymous Functionality**: Lambdas provide a concise way to implement functional interfaces without creating separate classes.
- **Functional Programming Support**: Enables writing clean, readable, and declarative code.
- **Smart Home Lighting**: Triggered lighting patterns based on motion, time, and voice commands using lambdas.
- **E-Commerce Sorting**: Applied dynamic sorting (price, rating, discount) using lambda expressions with `Comparator`.
- **Notification Filtering**: Filtered hospital alerts using lambdas with `Predicate`.

## Method References
- **Lambda Simplification**: Method references offer a shorter and cleaner alternative to lambda expressions.
- **Code Reusability**: Reuses existing methods instead of rewriting logic.
- **Patient ID Printing**: Printed patient IDs using method references in place of lambdas.
- **Name Uppercasing**: Converted employee names using `String::toUpperCase`.
- **Invoice Creation**: Generated invoices using constructor references.

## Functional Interfaces
- **Single Abstract Method (SAM)**: Functional interfaces contain exactly one abstract method.
- **Lambda Foundation**: Lambdas and method references work only with functional interfaces.
- **Built-in Interfaces**: Includes `Predicate`, `Function`, `Consumer`, and `Supplier`.
- **Notification Validation**: Used `Predicate` to validate notification conditions.
- **Data Transformation**: Applied `Function` to transform input data.

### 🔗 Code Link
👉[Lambda Expression & Method Reference](https://github.com/aryamishra01/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/Java8Practice/src/com/lambdaexpressions)
👉[Functional Interface](https://github.com/aryamishra01/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/Java8Practice/src/com/interfaceimplementation)

---

### 📅 Day 2 – Java Streams API & Collectors  
**(Date: 28-01-2026)**

## Streams API
- **Functional Data Processing**: Streams provide a declarative way to process collections without modifying the original data source.
- **Pipeline-Based Execution**: Operations follow a pipeline model – source, intermediate operations, and terminal operation.
- **Lazy Evaluation**: Intermediate operations execute only when a terminal operation is invoked.
- **Stock Price Monitoring**: Processed real-time stock prices using filtering and iteration.
- **IoT Sensor Analysis**: Filtered sensor readings above threshold values efficiently.
- **Event Data Processing**: Transformed and processed attendee lists using stream operations.

## Collectors
- **Result Aggregation Utility**: Collectors are used to gather stream elements into collections or summarized results.
- **Terminal Operation**: `collect()` triggers stream execution and produces a final result.
- **Data Grouping & Partitioning**: Supports grouping and splitting data based on conditions.
- **Employee Salary Grouping**: Grouped employees by department using `groupingBy`.
- **Order Revenue Summary**: Calculated total revenue using `summingDouble`.
- **Word Frequency Analysis**: Counted word occurrences using `groupingBy` with `counting`.

### 🔗 Code Link
👉[Streams API](https://github.com/aryamishra01/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/Java8Practice/src/com/streamsapi)
👉[Collectors](https://github.com/aryamishra01/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/Java8Practice/src/com/collectors)

---

### 📅 Day 3 – Java 8 Scenario-Based Questions Practice  
**(Date: 29–30 Jan 2026)**  

Practised a wide range of **scenario-based problems using Java 8** to understand how functional programming concepts are applied in real-world applications.  

The main objective was to improve problem-solving skills using **modern Java features**, write **clean and readable code**, and replace traditional loops and conditional-heavy logic with **Streams, Lambdas, and Functional Interfaces**.

### Topics Practised in Detail

- **Lambda Expressions**  
  Used lambda expressions to simplify anonymous classes, reduce boilerplate code, and implement behaviour-driven logic in a concise way.

- **Functional Interfaces**  
  Practised built-in functional interfaces such as **Predicate, Function, Consumer, and Supplier** and understood how they help in writing reusable and flexible code.

- **Streams API**  
  Solved multiple collection-based problems involving:
  - Filtering data  
  - Mapping and transformation  
  - Sorting and grouping  
  - Aggregation and reduction operations  

- **Optional Class**  
  Learned how to safely handle null values using **Optional**, avoiding `NullPointerException` and improving code safety and readability.

### Key Learning Outcomes
- Better understanding of **functional programming concepts in Java**  
- Improved ability to solve **real-world scenario-based problems**  
- Learned to write **cleaner, more maintainable Java code**  

🔗 **Code Link:**  
👉[Scenario Based Problems](https://github.com/aryamishra01/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/scenario-based-codebase/Java8ScenarioProblems/src/com/employeesystem)
