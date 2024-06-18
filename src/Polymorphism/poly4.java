package Polymorphism;
class Employee
{
    private String name;
    private String role;

    public Employee(String name, String role)
    {
        this.name = name;
        this.role = role;
    }

    public String getName() 
    {
        return name;
    }

    public String getRole() 
    {
        return role;
    }

    public double calculateSalary()
    {
        return 0.0;
    }
}
class Manager extends Employee 
{
    private double baseSalary;
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) 
    {
        super(name, "Manager");
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() 
    {
        return baseSalary + bonus;
    }
}
class Programmer extends Employee 
{
    private double baseSalary;
    private double overtimePay;

    public Programmer(String name, double baseSalary, double overtimePay) 
    {
        super(name, "Programmer");
        this.baseSalary = baseSalary;
        this.overtimePay = overtimePay;
    }

    @Override
    public double calculateSalary() 
    {
        return baseSalary + overtimePay;
    }
}
public class poly4 {

	public static void main(String[] args) 
	{
		class Programmer extends Employee 
		{
		    private double baseSalary;
		    private double overtimePay;

		    public Programmer(String name, double baseSalary, double overtimePay)
		    {
		        super(name, "Programmer");
		        this.baseSalary = baseSalary;
		        this.overtimePay = overtimePay;
		    }

		    @Override
		    public double calculateSalary()
		    {
		        return baseSalary + overtimePay;
		    }
		}
	}
}
