package com.Expense.main;
import com.CurrencyDenom.notes.*;
import com.Sort.MergeSort.*;
public class TravelerExpmain {
	static int[] denominations;
	static int[] sorteddenom;
	static int amt;
	public static void main(String[] args) {
	SortingDenomMS ms = new SortingDenomMS();
	CurrencyDenom cd = new CurrencyDenom();
	NotesCalc nt = new NotesCalc();
	denominations = cd.CurrencyDenomination();
	sorteddenom = ms.denomSort(denominations);
	cd.DisplayDenom(denominations);
	nt.notesCalculate(cd.money, denominations);
}
}
