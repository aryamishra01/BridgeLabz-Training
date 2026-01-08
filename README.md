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
