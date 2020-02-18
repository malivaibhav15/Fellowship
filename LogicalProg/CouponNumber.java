package LogicalProg;

import java.util.Scanner;

public class CouponNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int count = collect(n);
		System.out.println(count);

	}

	private static int collect(int n) {
		boolean[] collected = new boolean[n];
		int count =0;
		int distinct=0;
		while (distinct <  n )
		{
			int value = getCoupon(n);
			count++;
			if(!collected[value])
			{
				distinct++;
				collected[value]= true;
			}
		//return count;	
		}
		return count;
		
	}

	private static int getCoupon(int n) {
		// TODO Auto-generated method stub
		return (int) (Math.random()*n);
	}

}
