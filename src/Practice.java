import java.nio.file.Path;
import java.util.*;
/** 
 * 
 * @author sethb
 * @version 1.10 2020-12-14 
 */
public class Practice
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter your salary: ");
		double yourSalary = in.nextDouble();
		System.out.print("Please enter your sales in whole dollars: ");
		double yourSales = in.nextDouble();
		
		double target = 5000;
		if (yourSales >= target)
		{
			String performance = "Satisfactory";
			double bonus = 100 + (0.01 * (yourSalary - target));
			double newSalary = yourSalary + bonus;
			System.out.println("You have passed your target and performance is " + performance + ". Your new salary is " + newSalary + ".");
		}
		else 
		{
			String performance = "Unsatisfactory";
			double bonus = 0;
			System.out.println("You have not met your target and performance is " + performance + ". Your salary remains the same.");
		}
		
	}
	
}
