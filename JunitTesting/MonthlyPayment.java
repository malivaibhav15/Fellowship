package JunitTesting;

import java.util.Scanner;

public class MonthlyPayment {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal amount");
		double principal = sc.nextDouble();
		System.out.println("Enter the no of years");
		double year = sc.nextDouble();
		System.out.println("Enter the Rate Of Interest ");
		double roi = sc.nextDouble();
		monthlyPayment(principal,year,roi);
		
		// TODO Auto-generated method stub

	}

	private static void monthlyPayment(double principal, double year, double roi) {
		// TODO Auto-generated method stub
		double rateofInterest = 0.12*roi;
		double n = 12*year;
		double r1 = 1+rateofInterest;
		double den = Math.pow(r1, (-n));
		double totaldeno = 1-den;
		double payment = (principal*rateofInterest)/totaldeno;
		System.out.println("Payment = "+payment);
	}

}
