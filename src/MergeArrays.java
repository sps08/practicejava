import java.util.Arrays;
import java.util.HashMap;

public class MergeArrays {

	static int arr1[] = new int[]{1, 5, 9, 10, 15, 20,40};//i m 
    static int arr2[] = new int[]{2, 3, 8, 40}; //j n
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1233,4,6,90,777};
		//findNumbers(nums);
//		System.out.println(arr1.length);
//		merge(arr1.length,arr2.length); 
//        System.out.print("After Merging nFirst Array: "); 
//        System.out.println(Arrays.toString(arr1)); 
//        System.out.print("Second Array:  "); 
//        System.out.println(Arrays.toString(arr2)); 

		
		
		int[][] points = {{1,1},{3,4},{-1,0}};
		//minTimetovisitpoints(points);
		
		
		String[] words = {"hJat","hat","cat","mat"}; 
		String chars = "atachm";
		countCharacters(words, chars);
	}

	private static void countCharacters(String[] words, String chars) {
		
		int count=0;
		//System.out.println(cmap);
		for(String word : words){
			
			if(word.toLowerCase()==word){
				System.out.println("true--");
			}else{
				System.out.println("false..");
			}
			if (isValidWord(word, chars)==true){
				count=count+word.length();
				System.out.println(count + "---count");
			}	
		} 
		
	}

	private static boolean isValidWord(String word, String chars) {
		
		boolean valid = true;
		HashMap<Character, Integer> cmap = new HashMap<>();
		char[] carr = chars.toCharArray();
		for(char c : carr ){
			if(cmap.containsKey(c)){
				cmap.put(c, cmap.get(c)+1);
			} else{
				cmap.put(c, 1);
			}
		}
		
		
		System.out.println(word.length());
		for(int i=0;i<word.length();i++){
			char w = word.charAt(i);
			System.out.println(w);
		//	System.out.println(cmap.get(w));
			if(cmap.get(w)== null){
				valid = false;
				System.out.println("here --");
				break;
			} else  {
				cmap.put(w, cmap.get(w)-1);
		
			}
		}
		return valid;
	}

	
	
	
	
	
	private static void minTimetovisitpoints(int[][] points) {
		int res =0;
		for(int i=0;i<points.length-1;i++){
			res = res + Math.max(Math.abs(points[i+1][0]-points[i][0]),
					Math.abs(points[i+1][1]-points[i][1]));
		}	
		System.out.println(res);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	private static void findNumbers(int[] nums) {
		// TODO Auto-generated method stub
		int count = 0;
		//System.out.println(nums.length);
		for (int i=0;i<nums.length;i++){
			//System.out.println(nums[i]%2);
			int c =0;
			while(nums[i]!=0){
				nums[i]=nums[i]/10;
				c++;
			}
			System.out.println(c);
			if(c%2==0){
				count++;
			}
		}
		
		System.out.println(count);
	}

	private static void merge(int m, int n) {
		
		for(int j=n-1;j>=0;j--){
			  
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
