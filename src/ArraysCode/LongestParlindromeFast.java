package ArraysCode;

import Java8.execute;

public class LongestParlindromeFast {

	public static void main(String[] args) {
		
		String str = "ppacecarp";
		System.out.println(LongParlindrome(str));
		System.out.println(isParlindrome(str));

	}

	private static boolean isParlindrome(String str) {
		// TODO Auto-generated method stub
		
		int len = str.length();
		boolean isPar = true;
		for(int i =0;i<len;i++){
			if(str.charAt(i)!=str.charAt(len-i-1)){
				isPar = false;
				return isPar;
			}
		}
		return true;
	}

	public static String LongParlindrome(String str) {
		if(str.length() <1 || str == null) return "";

		int start = 0;
		int end = 0;
		for(int i =0 ;i<str.length();i++){
			int len1 = expandFromMiddle(str, i, i);
			int len2 = expandFromMiddle(str, i, i+1);
			int len = Math.max(len1, len2);
			
			if(len >end- start){
				start = i - ((len-1)/2);
				end = i+(len/2);
			}
		}
		return str.substring(start,end+1);
		
	}
	
	
	public static int expandFromMiddle(String str, int left, int right){
		
		if(str == null || left > right) return 0;
		
		while(left>=0 && right <str.length() && str.charAt(left)== str.charAt(right)){
			left--;
			right++;
		}
		return right-left -1;
		
	}

}
