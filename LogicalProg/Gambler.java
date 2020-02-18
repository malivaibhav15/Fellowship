package LogicalProg;

import java.util.Scanner;

public class Gambler {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Stake of the Gambler");
		int stake = sc.nextInt();
		System.out.println("Enter the Goal of the Gambler");
		int goal = sc.nextInt();
		System.out.println("Enter the number of the trail by the Gambler");
		int trial  = sc.nextInt();
		int bet = 0;
		int win=0;
		for (int i = 0; i < trial; i++)
		{
			int cash = stake;
			while (cash>0&&cash<goal) {
				bet++;
				if(Math.random()<0.5)
					cash++;
				else {
					cash--;
				}
				if(cash==goal)
					win++;
			}
					}
		System.out.println("Win "+win);
		System.out.println("Winning Percentage "+100*win/trial);
		System.out.println("Average="+1*bet/trial);
		

	}

}
