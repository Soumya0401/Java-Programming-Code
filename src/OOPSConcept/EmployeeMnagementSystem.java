package OOPSConcept;

class Employee2 
{
	  private String name;
	  private String jobTitle;
	  private double salary;

	   Employee2(String name, String jobTitle, double salary) {
	    this.name = name;
	    this.jobTitle = jobTitle;
	    this.salary = salary;
	  }

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public String getJobTitle() {
	    return jobTitle;
	  }

	  public void setJobTitle(String jobTitle) {
	    this.jobTitle = jobTitle;
	  }

	  public double getSalary() {
	    return salary;
	  }

	  public void setSalary(double salary) {
	    this.salary = salary;
	  }

	  public void raiseSalary(double percentage) {
	    salary = salary + salary * percentage / 100;
	  }

	  public void printEmployeeDetails() {
	    System.out.println("Name: " + name);
	    System.out.println("Job Title: " + jobTitle);
	    System.out.println("Salary: " + salary);
	  }
	}


public class EmployeeMnagementSystem {

	public static void main(String[] args) 
	{
		Employee2 employee1 = new Employee2("Soumya", "HR Manager", 40000);
	    Employee2 employee2 = new Employee2("Shivani", "Software Engineer", 60000);
	    System.out.println("\nEmployee Details:");
	    employee1.printEmployeeDetails();
	    employee2.printEmployeeDetails();

	    employee1.raiseSalary(8);
	    employee2.raiseSalary(12);

	    System.out.println("\nAfter raising salary:");
	    System.out.println("\n8% for 'Soumya':");
	    employee1.printEmployeeDetails();
	    System.out.println("\n12% for 'Shivani':");
	    employee2.printEmployeeDetails();
	  }
	}

