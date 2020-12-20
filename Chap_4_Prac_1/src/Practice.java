import java.time.*;

public class Practice {

	public static void main(String[] args)
	{
		LocalDate date = LocalDate.now();
		
		int mon = date.getMonthValue();
		int today = date.getDayOfMonth();
		
		date = date.minusDays(today - 1);// set to start of month
		DayOfWeek weekday = date.getDayOfWeek();
		int val = weekday.getValue(); // 1 = Monday, ... 7 = Sunday
		
		System.out.println("Mon Tue Wed Thu Fri Sat Sun");
		for (int i = 1; i < val; i++)
			System.out.print("    ");
		
		while (date.getMonthValue() == mon) 
		{
			System.out.printf("%3d", date.getDayOfMonth());
			if (date.getDayOfMonth() == today)
				System.out.print("*");
			else
				System.out.print(" ");
			date = date.plusDays(1);
			if (date.getDayOfWeek().getValue() == 1) System.out.println();
		}
		if (date.getDayOfWeek().getValue() != 1) System.out.println();
	}

}
