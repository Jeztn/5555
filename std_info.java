import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class StudentInfoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\nStudent Information Application");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.next();
                    System.out.print("Enter student age: ");
                    int age = scanner.nextInt();
                    students.add(new Student(name, age));
                    System.out.println("Student added successfully.");
                    break;
                case 2:
                    System.out.println("Student List:");
                    for (Student student : students) {
                        System.out.println("Name: " + student.name + ", Age: " + student.age);
                    }
                    break;
                case 3:
                    System.out.println("Exiting the application.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
