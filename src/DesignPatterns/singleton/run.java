package DesignPatterns.singleton;

public class run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BillPughSingleton single1 = BillPughSingleton.getInstance();
		BillPughSingleton single2 = BillPughSingleton.getInstance();
	
		
		System.out.println(single1.hashCode() + " ---  "+ single2.hashCode());
	}

}
