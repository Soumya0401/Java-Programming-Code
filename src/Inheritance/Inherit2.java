package Inheritance;

class Member {
    String Name;
    int age;
    String Phone_Num;
    String Address;
    float Salary;

    public void printSalary() {
        System.out.println("Salary of Employee: " + Salary);
    }
}

class Employee extends Member {
    String specialization;

    // Getters and Setters for Employee specific fields
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }
}

class Manager extends Member {
    String department;

    // Getters and Setters for Manager specific fields
    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}

public class Inherit2 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.Name = "Ram";
        e.age = 25;
        e.Phone_Num = "88997766";
        e.Salary = 7865.90f;
        e.setSpecialization("HR");

        System.out.println("Employee Details:");
        System.out.println("Name: " + e.Name);
        System.out.println("Age: " + e.age);
        System.out.println("Phone Number: " + e.Phone_Num);
        System.out.println("Salary: " + e.Salary);
        System.out.println("Specialization: " + e.getSpecialization());
        e.printSalary(); // Calling inherited method

        System.out.println();

        Manager m = new Manager();
        m.Name = "Mohan";
        m.age = 27;
        m.Phone_Num = "88995566";
        m.Salary = 80000.90f;
        m.setDepartment("IT and Services");

        System.out.println("Manager Details:");
        System.out.println("Name: " + m.Name);
        System.out.println("Age: " + m.age);
        System.out.println("Phone Number: " + m.Phone_Num);
        System.out.println("Salary: " + m.Salary);
        System.out.println("Department: " + m.getDepartment());
        m.printSalary(); // Calling inherited method
    }
}
