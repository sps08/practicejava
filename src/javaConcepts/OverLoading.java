package javaConcepts;



class A {
	
	public int add(int a , int b){
		System.out.println("I am in A");
		return a+b;
	}
//	public float add(int a , int b){
//		System.out.println("I am in A");
//		return a+b;
//	}
//	
	public float add(float c, int a , int b){
		System.out.println("I am in A");
		return a+b;
	}
	
	public float add(int a, int b, int c ){
		System.out.println("I am in B");
		
		return  (a+b+c);
	}
	
	public Object display(String obj)
	{
		System.out.println("A.display() " + obj);
		return "0";
	}
}

class B extends A{

	@Override
	public String display(String obj)
	{
		System.out.println("B.display() " + obj);
		return "Derived";
	}
}

public class OverLoading {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		A c = new B();
		System.out.println(a.add(2,4));
		System.out.println(b.add(6,8,9));
		c.display("pop");
		
		b.display("test");
		a.display("make");
		//a.display(a);
		

	}

}
