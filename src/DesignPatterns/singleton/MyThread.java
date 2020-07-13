package DesignPatterns.singleton;

public class MyThread implements Runnable{

	@Override
	public void run() {
		ThreadSafeSingleton s1 = new ThreadSafeSingleton().getinstance();
		System.out.println(Thread.currentThread().getName() + "====" + s1.hashCode());

		//Singleton s2 = new Singleton().getinstance();

	}
}