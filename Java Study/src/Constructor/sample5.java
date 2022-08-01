package Constructor;

public class sample5

//constructor with parameter

{
	
	String num1;
	String num2;
	
	sample5 (String a, String b)
	
	{
		num1=a;
		num2=b;
		
	}
	
	public void multiplication() 
	{
		
		System.out.println(num1 + num2);
		
	}
	
	public void addition()
	
	{
		
		System.out.println(num1 + num2);
	}
	
	public static void main(String[] args) 
	
	
	{
		sample5 s1=new sample5("sujeet","Rahul");
		s1.addition();	
		s1.multiplication();
		
		
	}
	
	
	

}
