package logic;

public class numberrev 

{

	public static void main(String[] args) 
	
	{
	
		int num=123;
		
		int rev=0;
		
		for(int i = num; i>0; i=i/10)
			
		{
			
			int rem = i % 10;      //1%10 = 1 
			rev = rev * 10 + rem;
			
		}
			
			
				
					
				
		
	}
	
	
}
