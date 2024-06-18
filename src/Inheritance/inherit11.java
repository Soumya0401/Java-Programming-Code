package Inheritance;

class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Em1 extends Person {
    private int employeeId;
    private String jobTitle;

    public Em1(String firstName, String lastName, int employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String getLastName() {
        return super.getLastName() + ", " + jobTitle;
    }
}
public class inherit11 {

	public static void main(String[] args) 
	{
		Em1 employee1 = new Em1("Kortney", "Rosalee", 4451, "HR Manager");
	      System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + " (" + employee1.getEmployeeId() + ")");
		  Em1 employee2 = new Em1("Junior", "Philipa", 4452, "Software Manager");
	      System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + " (" + employee2.getEmployeeId() + ")");

	}
}
