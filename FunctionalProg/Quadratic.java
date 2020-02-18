package FunctionalProg;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args)
	{
		double x,x1 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of A");
		double a = sc.nextDouble();
		System.out.println("Enter value of B");
		double b = sc.nextDouble();
		System.out.println("Enter value of C");
		double c = sc.nextDouble();
		// TODO Auto-generated method stub
		roots(a,b,c);
	}
	
		private static void roots(double a, double b, double c) {
			double delta = b*b - 4*a*c;
			 double x = (-b + Math.sqrt(delta))/(2*a);
			double x1 = (-b - Math.sqrt(delta))/(2*a);
			System.out.println(x+" "+x1);

		// TODO Auto-generated method stub
		
	}

		
	}

