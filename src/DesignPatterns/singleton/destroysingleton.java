package DesignPatterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class destroysingleton {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//		 Singleton s1 = new Singleton().getinstance();
//		 Singleton s2 = new Singleton().getinstance();
		 
		// System.out.println(s1.hashCode()+" ------ "+ s2.hashCode() );
		
		
		//Singleton Destroy
		
		Singleton s1 = new Singleton().getinstance();
		Singleton s2 = null;
		
		Constructor<?>[] constructors =  Singleton.class.getDeclaredConstructors();
		for(Constructor<?> cons : constructors){
			cons.setAccessible(true);
			Object  object = cons.newInstance();
			s2 = (Singleton)object;
			
			break;
		}
		
		 System.out.println(s1.hashCode()+" ------ "+ s2.hashCode() );
			
	}

}
