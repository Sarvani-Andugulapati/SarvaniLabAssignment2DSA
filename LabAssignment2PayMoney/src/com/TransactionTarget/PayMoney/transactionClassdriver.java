package com.TransactionTarget.PayMoney;
import java.util.Scanner;
public class transactionClassdriver {
static Scanner sc = new Scanner(System.in);
static int size;
public static void main(String[] args) {
	PayMoneymain pm = new PayMoneymain();
System.out.println("Please enter the number of transactions for today\n");
 size = sc.nextInt();
int[] Trans = new int[size];
for(int i=0;i<size; i++) {
	System.out.println("Enter the achieved money for transaction"+" "+(i+1)+ "\n");
	Trans[i]=sc.nextInt();
}
System.out.println("Enter the total targets to be achieved");
int len = sc.nextInt();
int[] target = new int[len];
for(int i=0;i<len;i++) {
System.out.println("Enter the amount in crores which you want to achieve");
target[i] = sc.nextInt();
int temp = target[i];
int days = pm.targetCheck(Trans, temp);
if(days==-1) {
	System.out.println("The target could not be achieved");
}else {
	System.out.println("The target"+" "+target[i]+" "+"is achieved in:"+days+" "+"days");
}
}
}
public void displayTrans(int Transaction[]) {
	for(int i=0; i<size; i++) {
		System.out.println(" transactions for the day are:"+" "+Transaction[i]+"\n");
	}
}
}