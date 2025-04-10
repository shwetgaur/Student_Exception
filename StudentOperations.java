

package lab.Assignment8;

import java.util.ArrayList;

public class StudentOperations {
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) throws DuplicateStudentException {
        for (Student s : students) {
            if (s.getPrn().equals(student.getPrn())) {
                throw new DuplicateStudentException("Student with PRN already exists.");
            }
        }
        students.add(student);
    }

    public void displayAll() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        for (Student s : students) {
            s.display();
        }
    }

    public Student searchByPRN(String prn) throws StudentNotFoundException {
        for (Student s : students) {
            if (s.getPrn().equals(prn)) {
                return s;
            }
        }
        throw new StudentNotFoundException("Student not found with PRN: " + prn);
    }

    public Student searchByName(String name) throws StudentNotFoundException {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        throw new StudentNotFoundException("Student not found with name: " + name);
    }

    public Student searchByPosition(int pos) throws InvalidPositionException {
        if (pos < 0 || pos >= students.size()) {
            throw new InvalidPositionException("Invalid position.");
        }
        return students.get(pos);
    }

    public void updateStudent(String prn, String name, String dob, double marks) throws StudentNotFoundException {
        Student s = searchByPRN(prn);
        s.setName(name);
        s.setDob(dob);
        s.setMarks(marks);
    }

    public void deleteStudent(String prn) throws StudentNotFoundException {
        Student s = searchByPRN(prn);
        students.remove(s);
    }
}
