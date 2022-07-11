package com.CurrencyDenom.notes;
import java.util.Scanner;
public class CurrencyDenom {
	public int money;
	public CurrencyDenom() {
	}
	public  int[] CurrencyDenomination() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the amount to be payed\n");
		 money = sc.nextInt();
		System.out.println("Enter the no of currency denominations for the country\n");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Please enter the denominations\n");
		for(int i=0; i<size; i++) {	
			arr[i] = sc.nextInt();
		}sc.close();
		return arr;	
	}
	public void DisplayDenom(int[] denom) {
		System.out.println("The denominations are:"+" ");
		for(int i=0;i<denom.length;i++) {
			System.out.print(denom[i]+" "+"\n");
	}
}
}
