
public class StaticTest 
{

	public static void main(String[] args) 
	{
		// filling the staff array with three Employee objects
		var staff = new Employee[3];
		staff[0] = new Employee("tom", 40000);
		staff[1] = new Employee("dick", 60000);
		staff[2] = new Employee("harry", 45000);
		
		// print out information for all Employee objects
		for (Employee e : staff) 
		{
			e.setId();
			System.out.printf("name = " + e.getName() + ", id = " + e.getId() + ", salary = ", + e.getSalary());			
		}
		int n = Employee.getNextId(); // calls static method
		System.out.println("Next available id = " + n);
	}

}

class Employee
{
	private static int nextId = 1;
	
	private String name;
	private double salary;
	private int id;
	
	public Employee(String n, double s) 
	{
		name = n;
		salary = s;
		id = 0;
	}
	public String getName() 
	{
		return name;
	}
	public double getSalary() 
	{
		return salary;
	}
	public int getId() 
	{
		return id;
	}
	public void setId() 
	{
		id = nextId; // set id to next available id
		nextId++;
	}
	public static int getNextId() 
	{
		return nextId; // returns static field
	}
	public static void main(String args[]) // unit test
	{
		var e = new Employee("harry", 50000);
		System.out.println(e.getName() + " " + e.getSalary());
	}
}