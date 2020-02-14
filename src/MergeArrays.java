import java.util.Arrays;

public class MergeArrays {

	static int arr1[] = new int[]{1, 5, 9, 10, 15, 20,40};//i m 
    static int arr2[] = new int[]{2, 3, 8, 40}; //j n
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(arr1.length);
		merge(arr1.length,arr2.length); 
        System.out.print("After Merging nFirst Array: "); 
        System.out.println(Arrays.toString(arr1)); 
        System.out.print("Second Array:  "); 
        System.out.println(Arrays.toString(arr2)); 

	}

	private static void merge(int m, int n) {
		
		for(int j = n-1;j>=0;j--){
			  
			int i,  last=arr1[m-1];
			for( i=m-2;i>=0 && arr1[i]>arr2[j];i-- ){
				arr1[i+1]= arr1[i];
			}
			
			if( last > arr2[j]){
				arr1[i+1] = arr2[j];
				arr2[j]= last;
			}   
		}
		
		
	}

}
