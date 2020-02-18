package FunctionalProg;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of A=");
		double num1 = sc.nextInt();
		System.out.println("Enter the value of B=");
		double num2 = sc.nextInt();
		Dist(num1,num2);
	}
		private static void Dist(double num1, double num2) {
		// TODO Auto-generated method stub
			double square = (num1*num1)+(num2*num2);
			System.out.println(Math.sqrt(square));
	}
		
		
		// TODO Auto-generated method stub

	}


