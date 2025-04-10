# Student Data Entry Application

## 📌 Project Description

This project is a **Java-based Student Data Entry System** that allows storing and validating student information through modular functions and classes. It demonstrates the use of **Custom Exceptions** for maintaining clean and reliable user input and data management.

---

## 💡 Features & Functionalities

The application includes the following features:

| Functionality            | Description                                                                 |
|--------------------------|-----------------------------------------------------------------------------|
| `addStudent()`           | Adds a new student after validating data (name, age, PRN, course, etc.)    |
| `displayStudents()`      | Displays all student records in a structured format                        |
| `searchStudent()`        | Searches student by PRN or Name                                             |
| `updateStudent()`        | Updates an existing student’s data                                          |
| `deleteStudent()`        | Deletes student entry based on PRN                                          |

Each functionality is implemented in its own method within relevant Java class files.

---

## ⚠️ Custom Exception Handling

Custom exceptions are implemented to maintain data integrity. At least **two custom exceptions per feature** are used.

### Examples of Custom Exceptions:

- `InvalidNameException` – Thrown when a student name is empty or invalid.
- `InvalidAgeException` – Thrown if the age is not within a reasonable range.
- `DuplicatePRNException` – Thrown if a student with the same PRN already exists.
- `StudentNotFoundException` – Thrown when attempting to search/delete a non-existent student.
- `InvalidCourseException` – Thrown when a course field is left blank or contains invalid data.
- `EmptyStudentListException` – Thrown when trying to display an empty student list.

---

## 🛠 Code Structure

The application consists of multiple `.java` files, each responsible for a specific class or logic:

- `Main.java` – Entry point of the program.
- `Student.java` – Class representing student data model.
- `StudentManager.java` – Handles core student operations (add, display, search, update, delete).
- `CustomException.java` – Base class for custom exceptions.
- Individual custom exception classes like:
  - `InvalidNameException.java`
  - `InvalidAgeException.java`
  - `DuplicatePRNException.java`
  - `StudentNotFoundException.java`
  - `InvalidCourseException.java`

---

## 📋 Coding Standards Followed

- Proper file naming and modular class structure.
- Clear and consistent naming conventions.
- Logical grouping and separation of concerns.
- Comments provided for each major logic block or operation.
- Reusable and maintainable codebase.

---

## 🔨 How to Run

1. Compile all `.java` files using:
   ```bash
   javac *.java


## 📎 GitHub Repository

All source files, along with commit history for each function and file, can be found in the GitHub repository.

🔗 [GitHub Repository Link](https://github.com/shwetgaur/Student_Exception.git)  

---
   
