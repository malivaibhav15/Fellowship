package FunctionalProg;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature");
		double temp = sc.nextDouble();
		System.out.println("Enter the Wind Speed");
		double wind = sc.nextDouble();
		double d = Math.pow(wind, 0.16);
		theWindChill(temp,d);
		
		// TODO Auto-generated method stub

	}

	private static void theWindChill(double temp, double d) {
		
		double result = 35.75+0.6215*temp+(0.4275*temp-35.75)*d;
		System.out.println("the effective temperature="+result );
		// TODO Auto-generated method stub
		
	}

}
