package ArraysCode;

public class FindNonRepeatingCharacterFast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "asatinder";
		System.out.println(findNonRepeatingChar(str));

	}

	private static char findNonRepeatingChar(String str) {
		// TODO Auto-generated method stub
		int[] char_count = new int[26];
		 for(char c: str.toCharArray())
			 char_count[c-'a']++;
		 
		 for(char c: str.toCharArray()){
			 if(char_count [c-'a'] ==1 )return c;
		 }
		 return '-';
		 
		
	}

}
