package specifer;

public class sample 
{
	private int a;
	
	private sample()
	
	{
		
		a=10;
	}
	
	private void m1()
	
	{
		
		System.out.println(a);
		
	}
	
	public static void main(String[] args) 
	
	{
	
		sample s1=new sample();
		s1.m1();
		System.out.println(s1.a);
	}
	
}
