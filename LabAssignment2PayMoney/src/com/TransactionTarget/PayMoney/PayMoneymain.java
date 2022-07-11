package com.TransactionTarget.PayMoney;
public class PayMoneymain {
	public int targetCheck( int[] arr, int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target||target<arr[i]) {
				return i+1;
			}else {
				target = target - arr[i];
			}
		}
		return -1;
	}
	}
