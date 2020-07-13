package DesignPatterns.singleton;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientTest {

	public static void main(String[] args) {
		
	 //Singleton s1 = new Singleton().getinstance();
	 //Singleton s2 = new Singleton().getinstance();
	
		ExecutorService  executorService = null;
		MyThread mythread = new MyThread();
		try{
			executorService = Executors.newFixedThreadPool(5);
			executorService.execute(mythread);
			executorService.execute(mythread);
			executorService.execute(mythread);
			
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			if(executorService != null){
				executorService.shutdown();
			}
		}
		
	// System.out.println(s1 + " ---- "+ s2);
	}
	
	
	

}
