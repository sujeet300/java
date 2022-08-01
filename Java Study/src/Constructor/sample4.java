package Constructor;

public class sample4 

//constructor with parameter

{
	
	int num1;
	int num2;
	
	sample4(int a, int b)
	
	{
		num1=a;
		num2=b;
		
	}
	
	public void multiplication() 
	{
		
		System.out.println(num1*num2);
		
	}
	
	public void addition()
	
	{
		
		System.out.println(num1+num2);
	}
	
	public static void main(String[] args) 
	
	
	{
		sample4 s1=new sample4(2,4);
		s1.addition();
		s1.multiplication();
		
		
	}
	
	
	

}
