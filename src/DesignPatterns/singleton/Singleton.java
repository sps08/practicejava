package DesignPatterns.singleton;

public class Singleton {

	// no try catch //  instance will be created even if we havent called this class. // not thread safe
	
	//1. eager initialization
	
	
	
	//********* public static final Singleton INSTANCE = new Singleton();
	
	// 2. static block initialization    not the best approach
	
	private static Singleton INSTANCE = null;
	public Singleton(){
		
	}
	
	
	//***********************************************************************************************
	/*static{
		try{
			if(INSTANCE == null){
				INSTANCE = new Singleton();
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	public static Singleton getinstance1(){
		return INSTANCE;
	}
	*/
	//******************************************************************************************
	
	// 3. LazY initialization   instance == null is checked in the getInstance block
	
  public static Singleton getinstance(){
	  
	  // not thread safe
	  try{
			if(INSTANCE == null){
				INSTANCE = new Singleton();
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return INSTANCE;
	}
}
