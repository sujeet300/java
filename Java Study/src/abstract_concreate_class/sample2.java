package abstract_concreate_class;

public class sample2 extends sample1

{

	public void m2()
	{
		
		System.out.println("m2 completed");
	}
		
	public void m3()
	{
		
		System.out.println("m3 completed");
		
	}

	
	public static void main(String[] args) 
	{
	
		sample2 s1=new sample2();
		s1.m1();
		s1.m2();
		s1.m3();
		
	}
	
}
