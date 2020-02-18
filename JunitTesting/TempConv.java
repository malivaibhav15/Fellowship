package JunitTesting;

import java.util.Scanner;

public class TempConv {

	public static void main(String[] args)
	{
		int choice;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the choice 1.Celsius to fahrenheit 2.fahrenheit to Celsius ");
	choice = sc.nextInt();
	TempConversion(choice);
	// TODO Auto-generated method stub

	}

	private static void TempConversion(int choice) {
		// TODO Auto-generated method stub
		double f;
		if(choice==1)
		{Scanner sc = new Scanner(System.in);
			System.out.println("Enter the temperature in Celsius");
			double c = sc.nextInt();
			f=c*1.8+32;
			System.out.println(f+"°F");
			
		}
		else if(choice==2)
		{Scanner sc = new Scanner(System.in);
			System.out.println("Enter the temperature in fahrenheit");
			double c = sc.nextInt();
			f=c- 32 * 5/9;
			System.out.println(f+"°C");
			
		}
	}

}
