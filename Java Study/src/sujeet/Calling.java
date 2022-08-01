package sujeet;

public class Calling 

{
public static void main(String[] args) 

{

	m1(); //static regular method call from same class
	call.m2();
	
	Calling copy=new Calling ();
	
	
copy.m3();

call duplicate=new call();

duplicate.m4();

	
	
}
	
	public static void m1()//static regular method
	
	{
		
		System.out.println("hi");
		
	}
	
	public void m3()
	
	{
		
		System.out.println("Call for non static method from same class");
	}
	
}
