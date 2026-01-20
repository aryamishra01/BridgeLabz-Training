## Week 3: Data Structures Fundamentals  

### 📅 Day 1 – Introduction to Data Structures & Linked Lists  
**(Date: 02-Jan-2026)**

- Learned the fundamentals of **Data Structures** and their importance in efficient problem-solving  
- Understood key features of **Data Structures in Java** such as efficiency, scalability, and abstraction  
- Explored different **types of Data Structures** including Linear and Non-Linear structures  
- Studied **Singly Linked List** concepts, node structure, and one-directional traversal  
- Implemented **Doubly Linked List** with forward and backward traversal using previous and next references  
- Learned **Circular Linked List** where the last node points back to the first node for continuous traversal  
- Analyzed real-world use cases of linked lists such as memory management, scheduling, and navigation systems  

🔗 **Code Link:**  
👉 [LinkedList Programs](https://github.com/aryamishra01/BridgeLabz-Training/tree/dsa-practice/dsa-practice/gcr-codebase/JavaDsaPractice/src/com/linkedlist)

---

### 📅 Day 2 – Stack, Queue & HashMap  
**(Date: 03-Jan-2026)**

- Learned the concept of **Stack** (LIFO – Last In First Out) and its core operations: push, pop, peek  
- Implemented Stack using **arrays and Java Collections**  
- Understood real-world applications of Stack such as function calls, undo/redo, and expression evaluation  
- Learned the concept of **Queue** (FIFO – First In First Out) and operations: enqueue, dequeue, front  
- Implemented Queue using **arrays and LinkedList**  
- Studied applications of Queue in scheduling, buffering, and task management  
- Explored **HashMap** and the concept of **Hashing**  
- Understood **Hashing Function**, key-value pairs, collision handling, and performance benefits  
- Analyzed average time complexity of HashMap operations as **O(1)**  

🔗 **Code Link:**   
👉 [Stack, Queue & HashMap Programs](https://github.com/aryamishra01/BridgeLabz-Training/tree/dsa-practice/dsa-practice/gcr-codebase/JavaDsaPractice/src/com)

---

### 📅 Day 3 – Sorting Algorithms  
**(Date: 05-Jan-2026)**

- Learned the fundamentals of **sorting algorithms** and their importance in data organization  
- Implemented **Bubble Sort** to understand basic comparison-based sorting  
- Studied **Selection Sort** by repeatedly selecting the minimum element  
- Implemented **Insertion Sort** for building a sorted array incrementally  
- Learned **Counting Sort**, a non-comparison-based sorting algorithm for limited integer ranges  
- Implemented **Merge Sort** using the divide-and-conquer approach  
- Studied **Quick Sort** with pivot-based partitioning for efficient sorting  
- Implemented **Heap Sort** using a binary heap data structure  
- Understood use cases and performance trade-offs of each sorting algorithm  

🔗 **Code Link:**  
👉 [Sorting Algorithms Programs](https://github.com/aryamishra01/BridgeLabz-Training/tree/dsa-practice/dsa-practice/gcr-codebase/JavaDsaPractice/src/com/sorting)

---

### 📅 Day 4 – Strings, File Handling & Searching Algorithms  
**(Date: 06-Jan-2026)**

#### 1️⃣ StringBuilder
- Explored **StringBuilder** for mutable strings.  
- Practiced operations like **append**, **insert**, **delete**, and **reverse** for efficient string manipulation.  
- Example: Reversing a string using `StringBuilder.reverse()` method.

🔗 **Code Link:**  
👉 [StringBuilder Programs](https://github.com/aryamishra01/BridgeLabz-Training/tree/dsa-practice/dsa-practice/gcr-codebase/JavaDsaPractice/src/com/stringbuilder)

#### 2️⃣ StringBuffer
- Studied **StringBuffer**, which is similar to StringBuilder but **thread-safe**.  
- Implemented examples to understand synchronization overhead and usage scenarios.

🔗 **Code Link:**  
👉 [StringBuffer Programs](https://github.com/aryamishra01/BridgeLabz-Training/tree/dsa-practice/dsa-practice/gcr-codebase/JavaDsaPractice/src/com/stringbuffer)

#### 3️⃣ FileReader
- Learned to use **FileReader** to read data from files character by character.  
- Handled file-related exceptions to ensure robust file operations.

🔗 **Code Link:**  
👉 [FileReader Programs](https://github.com/aryamishra01/BridgeLabz-Training/tree/dsa-practice/dsa-practice/gcr-codebase/JavaDsaPractice/src/com/filereader)

#### 4️⃣ InputStreamReader
- Implemented **InputStreamReader** along with **BufferedReader** to read **user input from the console** efficiently.  
- Example: Reading multiple lines until the user types "exit".
  
🔗 **Code Link:**  
👉 [InputStreamReader Programs](https://githubgithub.com/aryamishra01/BridgeLabz-Training/tree/dsa-practice/dsa-practice/gcr-codebase/JavaDsaPractice/src/com/inputstreamreader)

#### 5️⃣ Linear Search
- Solved problems using **Linear Search**, including:  
- Finding an element in an unsorted list  
- Finding the **first missing positive integer**  
- Time complexity: **O(n)**, suitable for small or unsorted datasets.

🔗 **Code Link:**  
👉 [LinearSearch Programs](https://github.com/aryamishra01/BridgeLabz-Training/tree/dsa-practice/dsa-practice/gcr-codebase/JavaDsaPractice/src/com/linearsearch)

#### 6️⃣ Binary Search
- Applied **Binary Search** to efficiently locate the index of a target element in **sorted arrays**.  
- Understood **divide-and-conquer logic** and midpoint calculations.  
- Time complexity: **O(log n)**, much faster than linear search for large datasets.
  

🔗 **Code Link:**  
👉 [BinarySearch Programs](https://github.com/aryamishra01/BridgeLabz-Training/tree/dsa-practice/dsa-practice/gcr-codebase/JavaDsaPractice/src/com/binarysearch)

#### 7️⃣ Challenge Problems
- Solved combined problems to practice **String operations and searching algorithms**:

1. **LinearAndBinarySearchProgram.java** – Finds the first missing positive integer using Linear Search and locates a target element index using Binary Search.  
2. **StringConcatComparison.java** – Compares the performance of **String**, **StringBuilder**, and **StringBuffer** during repeated concatenation operations.  
3. **WordCountComparison.java** – Reads a file and compares different approaches to count words, demonstrating efficient use of **FileReader** and **BufferedReader**.

🔗 **Code Link:**  
👉 [Challenge Problems](https://github.com/aryamishra01/BridgeLabz-Training/tree/dsa-practice/dsa-practice/gcr-codebase/JavaDsaPractice/src/com/challengeproblems)

---

### 📅 Day 5 – Runtime Analysis & Big-O Notation 
**(Date: 06-Jan-2026)**

- Learned the fundamentals of **runtime analysis** to evaluate program efficiency  
- Understood **time complexity (Big-O notation)** and its role in measuring scalability  
- Implemented **DataStructureSearchComparison.java** to compare search performance across data structures  
- Analyzed **FibonacciPerformanceComparison.java** by comparing recursive and iterative approaches  
- Implemented **FileReadingPerformance.java** to measure execution time of different file reading techniques  
- Studied **SearchPerformanceComparison.java** to analyze Linear Search vs Binary Search performance  
- Implemented **SortingPerformanceComparison.java** to compare execution time of multiple sorting algorithms  
- Analyzed **StringConcatenationPerformance.java** to compare String, StringBuilder, and StringBuffer efficiency  
- Understood practical **performance trade-offs** based on execution time and input size  

🔗 **Code Link:**  
👉 [Runtime Analysis Programs](https://github.com/aryamishra01/BridgeLabz-Training/tree/dsa-practice/dsa-practice/gcr-codebase/JavaDsaPractice/src/com/runtimeanalysis)

---

### 📘 Day 6 – DSA Scenario-Based Problems  
**(Date: 10-Jan-2026)** 

## Scenario-Based Implementations  
- **AmbulanceRoute – Emergency Patient Navigation**  
  Circular linked list simulation for navigating hospital units and redirecting patients.

- **BookShelf – Library Book Management**  
  Linked list–based system to add, search, and remove books dynamically.

- **BrowserBuddy – Tab & History Management**  
  Stack and linked list implementation to manage browser tabs and browsing history.

- Focused on applying **DSA concepts** (Linked List, Circular Linked List, Stack) in real-world scenarios  
- Enhanced logical thinking and data-structure–based problem solving using Java  

🔗 **DSA Scenario Code Link:**  
👉 [DSA Scenario Problems](https://github.com/aryamishra01/BridgeLabz-Training/tree/dsa-practice/dsa-practice/scenario-based-codebase/DsaScenarioProblems/src/com/day1)

---

### 📘 Day 7 – DSA Scenario-Based Problems  
**(Date: 12-Jan-2026)**

## Scenario-Based Implementations  

- **BookShelf – Library Organizer**  
  Manage books dynamically using linked list.  
  **Files:** `Book.java`, `Library.java`, `BookShelfMain.java`

- **CallCenter – Customer Support Management**  
  Queue-based customer handling system.  
  **Files:** `Customer.java`, `CustomerManagement.java`, `CustomerServiceMain.java`

- **TextEditor – Undo/Redo Simulation**  
  Stack simulation for text actions.  
  **Files:** `Action.java`, `TextEditor.java`, `TextEditorMain.java`

- **TrafficManager – Roundabout Traffic Flow**  
  Circular linked list simulation for vehicles.  
  **Files:** `Vehicle.java`, `Roundabout.java`, `TrafficManagerMain.java`

- **TrainCompanion – Route & Compartment Management**  
  Linked list–based train system.  
  **Files:** `Compartment.java`, `TrainRoute.java`, `TrainCompanionMain.java`

🔗 **Code:**  
👉 [DSA Scenario Problems](https://github.com/aryamishra01/BridgeLabz-Training/tree/dsa-practice/dsa-practice/scenario-based-codebase/DsaScenarioProblems/src/com/day2)

---

### 📘 Day 8 – DSA Scenario-Based Problems  
**(Date: 13-Jan-2026)** 

## Scenario-Based Implementations  
- **ExamProctor – Online Exam Management**  
  Class-based system to manage exams, students, and proctoring functionality.  
  - `Exam.java` – Exam details and configurations  
  - `ExamProctor.java` – Logic to assign exams and monitor students  
  - `ExamProctorMain.java` – Main driver to simulate exam sessions  

- **ParcelTracker – Shipment Tracking System**  
  Track parcels across stages using linked list nodes.  
  - `ParcelTracker.java` – Core logic for parcel tracking  
  - `ParcelTrackerMain.java` – Main driver to simulate parcel flow  
  - `StageNode.java` – Node representing each stage of shipment  

- **SmartCheckout – Supermarket Billing Queue**  
  Queue and HashMap–based system to manage customers, stock, and billing.  
  - `Customer.java` – Customer details and cart items  
  - `Inventory.java` – Items, prices, and stock management  
  - `SmartCheckoutMain.java` – Main driver for checkout simulation  

- Focused on applying **DSA and OOP concepts** (Queue, HashMap, Linked List) in practical scenarios  
- Enhanced understanding of **real-world problem solving** using Java  

🔗 **DSA Scenario Code Link:**  
👉 [DSA Scenario Problems](https://github.com/aryamishra01/BridgeLabz-Training/tree/java-oops-practice/java-oops-practice/scenario-based-codebase/OopsScenarioProblems/src/com/day3)

---

### 📘 Day 9 – Sorting Algorithms with Real-Life Scenarios  
**(Date: 15-Jan-2026)**

## Scenario-Based Implementations  

- **EventManager – Ticket Price Optimizer (Quick Sort)**  
  Sorts event tickets based on price using Quick Sort for fast performance.  
  - `Ticket.java` – Represents ticket details (price, event name, seat type)  
  - `EventManagerUsingQuickSort.java` – Implements Quick Sort logic for ticket sorting  

- **ExamCell – Student Rank Generator (Merge Sort)**  
  Generates student rank list by merging and sorting scores from different centers.  
  - `Student.java` – Stores student details and exam scores  
  - `ExamCellUsingMergeSort.java` – Implements Merge Sort for ranking students  

- **HospitalQueue – Patient Priority Sorting (Bubble Sort)**  
  Sorts patients based on urgency level using Bubble Sort for small datasets.  
  - `Patient.java` – Patient details and priority level  
  - `HospitalQueueUsingBubbleSort.java` – Bubble Sort implementation for patient queue  

- **SmartShelf – Auto-Sort Borrowed Books (Insertion Sort)**  
  Maintains a sorted list of books when new books are added.  
  - `Book.java` – Book details like title and author  
  - `SmartShelfUsingInsertionSort.java` – Insertion Sort logic for dynamic book sorting  

- **ZipZipMart – Sales Data Analyzer (Merge Sort)**  
  Analyzes and sorts sales records for reporting and trend analysis.  
  - `Sale.java` – Represents product sales data  
  - `ZipZipMartUsingMergeSort.java` – Uses Merge Sort to organize sales records  

## 🔍 Key Concepts Practiced  
- Quick Sort  
- Merge Sort  
- Bubble Sort  
- Insertion Sort  
- Time Complexity Comparison  
- Real-world problem modeling using Java classes  

## 🎯 Learning Outcomes  
- Understood when to use different sorting algorithms  
- Implemented sorting without built-in utilities  
- Improved problem-solving using scenario-based coding  

🔗 **DSA Scenario Code Link:**  
👉 [Sorting Scenarios](https://github.com/aryamishra01/BridgeLabz-Training/tree/java-oops-practice/java-oops-practice/scenario-based-codebase/OopsScenarioProblems/src/com/day4)

---

### 📘 Day 10 – Sorting Algorithms with Practical Systems  
**(Date: 16-Jan-2026)**

## Scenario-Based Implementations  

- **CinemaHouse – Movie Time Sorting (Bubble Sort)**  
  Sorts daily movie show timings using Bubble Sort since the dataset is small and manually updated.  
  - `Movie.java` – Stores movie name and show time  
  - `CinemaHouse.java` – Manages movie schedule list  
  - `CinemaHouseUsingBubbleSort.java` – Bubble Sort logic to sort show timings  

- **CropMonitor – Sensor Data Analyzer (Quick Sort)**  
  Sorts crop sensor data like temperature and moisture levels using Quick Sort for faster analysis.  
  - `SensorData.java` – Represents real-time crop sensor readings  
  - `CropMonitor.java` – Handles sensor data collection  
  - `CropMonitorUsingQuickSort.java` – Quick Sort implementation for sensor data sorting  

- **RoboWarehouse – Package Sorting System (Insertion Sort)**  
  Dynamically inserts and sorts packages by weight/ID as they arrive in the warehouse.  
  - `Package.java` – Package details such as ID and weight  
  - `RoboWarehouse.java` – Manages incoming packages  
  - `RoboWarehouseUsingInsertionSort.java` – Insertion Sort for real-time package ordering  

## 🔍 Key Concepts Practiced  
- Bubble Sort for small datasets  
- Quick Sort for large and unsorted data  
- Insertion Sort for nearly sorted data  
- Choosing optimal algorithms based on use case  

## 🎯 Learning Outcomes  
- Applied sorting techniques to real-world inspired systems  
- Improved understanding of algorithm selection  
- Strengthened Java class design with DSA logic  

🔗 **DSA Scenario Code Link:**  
👉 [Sorting Scenarios](https://github.com/aryamishra01/BridgeLabz-Training/tree/java-oops-practice/java-oops-practice/scenario-based-codebase/OopsScenarioProblems/src/com/day5)

---

### 📘 Day 11 – Sorting Algorithms in Management Systems  
**(Date: 17-Jan-2026)**

## Scenario-Based Implementations  

- **ArtExpo – Artwork Arrangement System (Insertion Sort)**  
  Maintains a sorted list of artists and artworks as new entries are added for exhibition.  
  - `Artist.java` – Stores artist details and artwork info  
  - `ArtExpo.java` – Manages exhibition entries  
  - `ArtExpoUsingInsertionSort.java` – Insertion Sort for arranging artworks  

- **FleetManager – Vehicle Dispatch Optimizer (Merge Sort)**  
  Sorts vehicles based on capacity or availability for efficient fleet dispatching.  
  - `Vehicle.java` – Vehicle details such as number, capacity, and status  
  - `FleetManager.java` – Handles fleet operations  
  - `FleetManagerUsingMergeSort.java` – Merge Sort for large vehicle datasets  

- **IceCreamRush – Flavor Popularity Sorting (Bubble Sort)**  
  Sorts ice cream flavors based on sales or demand using Bubble Sort for small daily datasets.  
  - `Flavor.java` – Flavor name and sales count  
  - `IceCreamRush.java` – Manages daily flavor sales  
  - `IceCreamRushUsingBubbleSort.java` – Bubble Sort logic for popularity sorting  

- **SmartLibrary – Auto-Sort Borrowed Books (Insertion Sort)**  
  Keeps borrowed books sorted alphabetically as new books are issued.  
  - `Book.java` – Book title, author, and ID  
  - `SmartLibrary.java` – Manages borrowed book list  
  - `SmartLibraryUsingInsertionSort.java` – Insertion Sort for maintaining sorted order  

## 🔍 Key Concepts Practiced  
- Insertion Sort for dynamic data insertion  
- Merge Sort for large structured datasets  
- Bubble Sort for small, frequently updated lists  
- Real-world system modeling using Java classes  

## 🎯 Learning Outcomes  
- Learned to map business problems to suitable sorting algorithms  
- Improved efficiency by choosing correct sorting strategies  
- Strengthened OOP + DSA integration in Java  

🔗 **DSA Scenario Code Link:**  
👉 [Sorting Scenarios](https://github.com/aryamishra01/BridgeLabz-Training/tree/java-oops-practice/java-oops-practice/scenario-based-codebase/OopsScenarioProblems/src/com/day6)

---

### 📘 Day 12 –   Sorting Algorithms Problems
**(Date: 13-Jan-2026)**

## Scenario-Based Implementations  

- **EduResults – Student Result Management System**  
  Manages student marks and displays results using basic OOP concepts.  
  - `Student.java` – Stores student details and marks  
  - `StudentResultApp.java` – Main application to calculate and display results  

- **FitnessTracker – Daily Activity Tracking System**  
  Tracks user fitness activities like steps, calories, and workout duration.  
  - `User.java` – Stores user profile and fitness data  
  - `FitnessTrackerApp.java` – Tracks and displays daily fitness summary  

- **FlashDealz – Product Discount Management System**  
  Manages products and applies discount logic for flash sales.  
  - `Product.java` – Product details like name, price, and discount  
  - `FlashDealzApp.java` – Applies discounts and shows final prices  

## 🔍 Key Concepts Practiced  
- Classes and Objects  
- Encapsulation using private variables and public methods  
- Constructors for initializing objects  
- Basic business logic implementation  

## 🎯 Learning Outcomes  
- Built real-world mini applications using Java OOP  
- Improved understanding of object interaction  
- Learned how to structure small Java projects logically  

🔗 **DSA Scenario Code Link:**  
👉 [Sorting Scenarios](https://github.com/aryamishra01/BridgeLabz-Training/tree/java-oops-practice/java-oops-practice/scenario-based-codebase/OopsScenarioProblems/src/com/day7)

---
