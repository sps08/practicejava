package Sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = {5,8,1,7,9};
		int rsult[] = insertionSort(arr);
		
		Arrays.stream(rsult).forEach(System.out::println);

	}

	private static int[] insertionSort(int[] arr) {
		
		for (int i =1;i<arr.length;i++){
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j] > key){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1]= key;
		}
		return arr;
		
	}

}
