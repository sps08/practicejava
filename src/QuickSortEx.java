
public class QuickSortEx {

	public static void main(String[] args) {
	
		QuickSortEx  ob = new QuickSortEx();
		int[] arr = {10,80,30,90,40,50,70};
		System.out.println("jfsdjfdjk");
		// 90,80,70,30,40,50,10;
		ob.QuickSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

	private  void QuickSort(int[] arr, int low, int high) {
		if(low<high){
			int pi = partion(arr, low, high);
			System.out.println(pi);
			QuickSort(arr, low, pi-1);
			QuickSort(arr, pi+1, high);
			
		}
	}

	private  int partion(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low-1;
		for(int j=low;j<high;j++){
			if(arr[j]< pivot){
				i++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		
		int temp = arr[i+1];
		arr[i+1] =arr[high];
		arr[high] = temp;
		return i+1;
	}
	

}
