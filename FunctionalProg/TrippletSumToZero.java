package FunctionalProg;

import java.util.Scanner;

public class TrippletSumToZero {

	public static void main(String[] args) {
		int sum = 0;
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Array Size");
	int size = sc.nextInt();
	int arr[] = new int[size];
	System.out.println("Enter the values");
	//int sum=0;
	for (int i = 0; i < size; i++)
	{
		arr[i] = sc.nextInt();
	}
	/*for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}*/
	tripplets(arr,size);
	}
	public static void tripplets(int arr[],int size) {
		for (int i = 0; i < size-2; i++) {
			
			for (int j = i+1; j < size-1; j++) {
				
				for (int k = j+1; k < size; k++) {
					if(arr[i]+arr[j]+arr[k]==0)
					{
						//System.out.println("hi");
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					}
				}
				
			}
		}
	}
}
		