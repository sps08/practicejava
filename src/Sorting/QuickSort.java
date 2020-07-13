package Sorting;

import org.omg.Messaging.SyncScopeHelper;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {10,80,30,90,40,50,70};
		
		
		//System.out.println(System.out.println("testing"));
		QuickSort ob = new QuickSort();
		ob.QuickSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

	private void QuickSort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		
		if(low<high){
			int pi = partition(arr, low, high);
			QuickSort(arr, 0, pi-1);
			QuickSort(arr, pi+1, high);
	}

	}

	private int partition(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		int pivot = arr[high];
		int i = low-1;
		for(int j=low;j<high;j++){
			if(arr[j]<pivot){
				i++;
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		 int temp = arr[i+1];
		 arr[i+1]= arr[high];
		 arr[high] = temp;
		 return i+1;
	}


}
