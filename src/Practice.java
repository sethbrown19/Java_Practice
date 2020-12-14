import java.util.*;
/** 
 * This program demonstrates console input
 * @author sethb
 * @version 1.10 2020-12-14 
 */
public class Practice
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		// get first input
		System.out.print("What is your name?");
		String name = in.nextLine();
		
		// get second input
		System.out.print("How old are you?");
		int age = in.nextInt();
		
		// display output  on console
		System.out.println("Hello, " + name + ". Next year, you'll be " + (age +1));
	}
	
	

}
