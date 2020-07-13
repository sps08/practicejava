package ArraysCode;

public class findDuplicateFast {

	public static void main(String[] args) {
	 int arr[] = {2,5,3,6,3,7,5,6,7};
		System.out.println(findDuplicate(arr));

	}

	private static int findDuplicate(int[] arr) {
		
		for(int i =0;i<arr.length;i++){
			if(arr[Math.abs(arr[i])-1] < 0)
				return Math.abs(arr[i]);
			else{
				arr[Math.abs(arr[i])-1] = -arr[Math.abs(arr[i]-1)];
			}
		}
			return -1;
	}
	
}
