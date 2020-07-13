package Interface;
import java.lang.FunctionalInterface;

@FunctionalInterface
public interface MyInterface2 extends MyInterface {
	default void method2(){
		System.out.println("testing default");
		
		
		////other method type will not work
	}

}
