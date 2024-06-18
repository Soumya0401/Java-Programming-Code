package Inheritance;

class Emp2 {
    private int salary;

    public Emp2(int salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("working as an employee!");
    }

    public int getSalary() {
        return salary;
    }
}
class HRManager extends Emp2 
{
    public HRManager(int salary)
    {
        super(salary);
    }

    public void work() 
    {
        System.out.println("\nManaging employees");
    }

    public void addEmployee() 
    {
        System.out.println("\nAdding new employee!");
    }
}
public class inherit8 {

	public static void main(String[] args) 
	{
	        Emp2 emp = new Emp2(40000);
	        HRManager mgr = new HRManager(70000);

	        emp.work();
	        System.out.println("Employee salary: " + emp.getSalary());

	        mgr.work();
	        System.out.println("Manager salary: " + mgr.getSalary());
	        mgr.addEmployee();

	}

}
