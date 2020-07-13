package DesignPatterns.singleton;

public class ThreadSafeSingleton {


	private static ThreadSafeSingleton INSTANCE = null;

	public ThreadSafeSingleton(){

	}


	// method as suncronized descrease the performance so make  syncronized 
	public static ThreadSafeSingleton getinstance() {
		if(INSTANCE == null){

			synchronized (ThreadSafeSingleton.class) {
				if(INSTANCE == null){
					try{
						Thread.sleep(2000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					INSTANCE = new ThreadSafeSingleton();
				}
			}
		}
		return INSTANCE;
	}
}
