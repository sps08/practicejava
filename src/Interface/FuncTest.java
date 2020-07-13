package Interface;

import java.awt.List;
import java.util.ArrayList;
import java.util.function.Consumer;

public class FuncTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//createThreadUsingAnonymusClass();
		createThreadUsingLambda();
		
		
		ArrayList<String> myList = new ArrayList<>();
		myList.add("Anderson");
		myList.add("george");
		myList.add("Rocky");
		
//		myList.forEach(new Consumer<String>() {
//
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//			}
//		});
	
		
		myList.forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
//		MyInterface my = new MyInterface(){
//
//			@Override
//			public void method1() {
//				System.out.println("This is executed using lambda .....");
//			}
//			
//		};
		
		
		MyInterface my = ()-> System.out.println("This is executed using lambda .....");
		my.method1();
		
	}

	
	
	
	////below code is ugly and need changed with java8

	private static void createThreadUsingLambda() {
		//TODO Auto-generated method stub
		
		Runnable r  = ()-> {System.out.println("My Task is executing..."); };
		
		Thread thread = new Thread(r);
		thread.start();
		
	}




	private static void createThreadUsingAnonymusClass(){
		Runnable r = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("My Task is executing...");
				
			}
		};
		Thread thread = new Thread(r);
		thread.start();
		
		/// two .class file will be generated in bin folder

	}
}
