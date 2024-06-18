package Arrayof0bjects;
import java.util.Scanner;

class Emp {
    String name;
    String salary;
    int doj;

    // Constructor to initialize Emp object
    Emp(String n, String sal, int date) {
        name = n;
        salary = sal;
        doj = date;
    }

    // Method to display employee details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Date of Joining: " + doj);
    }
}

public class Employees {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of employees:");
        int numberOfEmployees = sc.nextInt();
        sc.nextLine();  // Consume newline left-over

        // Array to store employee objects
        Emp[] employees = new Emp[numberOfEmployees];

        // Reading employee details
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            String salary = sc.nextLine();
            System.out.print("Date of Joining (year): ");
            int doj = sc.nextInt();
            sc.nextLine();  // Consume newline left-over

            // Create a new employee object and add it to the array
            employees[i] = new Emp(name, salary, doj);
        }

        // Displaying employee details
        System.out.println("\nEmployee Details:");
        for (Emp emp : employees) {
            emp.display();
            System.out.println();
        }

        sc.close();
    }
}
