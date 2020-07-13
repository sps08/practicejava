package DesignPatterns.singleton;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class runEnum {

	public static void main(String[] args) {
		EnumSingleton s1  = EnumSingleton.GETINSTANCE;
		EnumSingleton s2  = EnumSingleton.GETINSTANCE;

		 System.out.println(s1.hashCode()+" ------ "+ s2.hashCode() );
		 String welcome = s1.welcome();
		 System.out.println(welcome);
		
	}

}
