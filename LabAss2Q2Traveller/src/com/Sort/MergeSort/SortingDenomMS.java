package com.Sort.MergeSort;

public class SortingDenomMS {
	public int[] denomSort(int array[]) {
		return mergeSortArray(array,0,array.length-1);
	}
	void merge(int[] arr,int left, int mid, int right) {
		int lftlen = mid-left+1;
		int rtlen = right-mid;
		int leftarray[] = new int[lftlen];
		int rtarray[] = new int[rtlen];
		for (int i=0;i<lftlen;i++) {
			leftarray[i] = arr[left+i];	
		}
		for (int j=0; j<rtlen;j++) {
			rtarray[j] = arr[mid+1+j];
		}
		int i,j,k;
		i=0;j=0;k=left;
		while(i<lftlen && j<rtlen) {
			if(leftarray[i]>rtarray[j]) {
				arr[k] = leftarray[i];
				i++;
			}else {
				arr[k]= rtarray[j];
				j++;
			}k++;
		}
		while(i<lftlen) {
			arr[k]=leftarray[i];
			i++;
			k++;
		}
		while(j<rtlen) {
			arr[k]= rtarray[j];
			j++;
			k++;
		}
	}
	int[] mergeSortArray(int array[], int L, int R) {
		if(L<R) {
			int mid = (L+R)/2;
			mergeSortArray(array,L,mid);
			mergeSortArray(array,mid+1,R);
			
			merge(array,L,mid,R);
		}return array;
	}
}
