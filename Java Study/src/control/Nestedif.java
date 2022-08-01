package control;

public class Nestedif
{
	
	public static void main(String[] args) 
	{
		
		int age=17;
		int weight=45;
		
		if(age>=18)
			
		{
			
			System.out.println("ok for age");
			
			if(weight<=45)
			{
				System.out.println("qualified for blood donation");
			}
			
			else 
				
			{
				
				System.out.println("Weight is less not qualified");
			}
			
		}
		else
		{
			System.out.println("Age is less not qualified");
		}
	}

}
