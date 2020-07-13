import org.omg.Messaging.SyncScopeHelper;

public class BinarySearch {

	public static void main(String[] args) {
	 int[] arr = {16,19,20,23,45,56,78,90,96,100};
		
	 int end =arr.length;
	 int item = 78;
	 int beg = 0;
	 	System.out.println(BinarySearch(arr, beg, end, item));
	}
	
	public static int BinarySearch(int[] a, int beg, int end,int item){
		int mid;
		if (end >= beg){
			mid = (beg+end)/2;
			if(item == a[mid]){
				return mid+1;
			}
			else if(item>a[mid]){
				return BinarySearch(a, mid+1, end, item);
			}
			else {
				return BinarySearch(a, beg, mid-1, item);
			}
		}
		return -1;
	}
}
