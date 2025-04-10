package lab.Assignment8;

/*
Name: Shwet Gaur
PRN: 23070126126
Batch: B2
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentOperations ops = new StudentOperations();
        boolean running = true;

        while (running) {
            System.out.println("\n--- Student Data Entry Menu ---");
            System.out.println("1. Add Student\n2. Display All\n3. Search\n4. Update\n5. Delete\n6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();  // consume newline

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter PRN: ");
                        String prn = sc.nextLine();
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter DoB: ");
                        String dob = sc.nextLine();
                        System.out.print("Enter Marks: ");
                        double marks = sc.nextDouble();
                        ops.addStudent(new Student(prn, name, dob, marks));
                        break;

                    case 2:
                        ops.displayAll();
                        break;

                    case 3:
                        System.out.print("Search by: 1) PRN  2) Name  3) Position: ");
                        int sChoice = sc.nextInt(); sc.nextLine();
                        if (sChoice == 1) {
                            System.out.print("Enter PRN: ");
                            Student s = ops.searchByPRN(sc.nextLine());
                            s.display();
                        } else if (sChoice == 2) {
                            System.out.print("Enter Name: ");
                            Student s = ops.searchByName(sc.nextLine());
                            s.display();
                        } else if (sChoice == 3) {
                            System.out.print("Enter Position: ");
                            Student s = ops.searchByPosition(sc.nextInt());
                            s.display();
                        }
                        break;

                    case 4:
                        System.out.print("Enter PRN of student to update: ");
                        prn = sc.nextLine();
                        System.out.print("Enter New Name: ");
                        name = sc.nextLine();
                        System.out.print("Enter New DoB: ");
                        dob = sc.nextLine();
                        System.out.print("Enter New Marks: ");
                        marks = sc.nextDouble();
                        ops.updateStudent(prn, name, dob, marks);
                        break;

                    case 5:
                        System.out.print("Enter PRN to delete: ");
                        ops.deleteStudent(sc.nextLine());
                        break;

                    case 6:
                        running = false;
                        break;

                    default:
                        throw new InvalidInputException("Invalid menu choice.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        sc.close();
    }
}
