package logic;

import java.util.Scanner;

public class inputfromuser
{
	
	public static void main(String[] args) 
	{
	
		Scanner s=new Scanner(System.in);
		System.out.print("Enter student name:");
		
	String name = s.next();
	
	System.out.println(name);
	
	System.out.println("Enter num1");
	
	int num1 = s.nextInt();
	
	System.out.println("Enter num2");
		
	int num2 = s.nextInt();
	
	System.out.println("Addition="+(num1+num2));
	
	}

	
	
	
	

}
