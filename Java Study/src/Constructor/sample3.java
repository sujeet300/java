package Constructor;

public class sample3 
{

	private int num1;
	private int num2;
	
	private sample3()
	
	{
		num1=10;
		num2=20;
		
	}
	
	private void m3() 
	{
		System.out.println(num1+num2);
		
	}
	
	public static void main(String[] args) 
	
	{
		
		sample3 s3=new sample3();
		s3.m3();
		
	}
	
	
}
