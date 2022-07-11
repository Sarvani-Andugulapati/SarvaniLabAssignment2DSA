package com.CurrencyDenom.notes;
public class NotesCalc {
public void notesCalculate(int pay, int[] arr) {
	int ntcount[] = new int[arr.length];
	try {
		for(int i=0; i< arr.length;i++ ) {
		if(pay>=arr[i]) {
			ntcount[i] = (int)(pay/arr[i]);
			pay = pay-arr[i]*ntcount[i];
		}
	}
	if(pay>0) {
		System.out.println("Exact amount cannot be given with highest denomination");
	}else {
		System.out.println("Your payment approach inorder to give minimum number of notes:");
		for(int i=0;i<ntcount.length;i++) {
			if(ntcount[i]!=0) {
				System.out.println(arr[i]+":"+" "+ntcount[i]);
			}
		}
	}
	}
	catch(ArithmeticException e) {
		System.out.println("Exception occured");
	}
}
}
