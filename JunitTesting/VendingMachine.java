package JunitTesting;

import java.util.Scanner;

public class VendingMachine {
		

	public static void main(String[] args) 
	{
		int maxAmount=0;
		int count=0;
		
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the amount");
		int amount = sc.nextInt();
		printAmount(amount);
		//while (amount!=0)
		
			
	}

	private static int printAmount(int amount) {
		int arr[] = {2000,500,200,100,50,20,10,5,2,1};
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(amount-arr[i]>0)
			{
				amount=amount-arr[i];
				System.out.println(arr[i]);
				count++;
				break;
			}
			else
				continue;
		}
	//System.out.println(count);
	return printAmount(amount);
	
		// TODO Auto-generated method stub
		
	}
	
	/*public static void printAmount(int maxAmount)
	{int notes=0,amt=0;

		amt=amt-maxAmount;
				notes++;
		System.out.println("total Notes="+notes);
		// TODO Auto-generated method stub
		
	}*/
	

}
