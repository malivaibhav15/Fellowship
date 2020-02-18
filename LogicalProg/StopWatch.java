package LogicalProg;

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		StopWatch timer = new StopWatch();
		double sum = 0.0;
		for (int i = 1; i <= n; i++)
		{
			sum = sum+Math.sqrt(i);
		}
		//double time  = timer.elapsedTime();
		//System.out.print("%e(%.2f seconds)\n",sum ,time);
		//double sum1=0.00;
		
		// TODO Auto-generated method stub

	}

}
