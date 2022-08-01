package logic;

import java.util.Scanner;

public class spacecountstring 
{

	public static void main(String[] args) 
	
	{
	
		System.out.println("Enter name");
		Scanner sc=new Scanner(System.in);
		String word = sc.nextLine();
		
		
		int count = 0;
		
		for(int i=0; i<=word.length()-1;i++)
		{
			
			char letter = word.charAt(i);
			
			if(letter==' ')
				
			{
				count++;
				
			}
			
		
		}
		
		System.out.println(count);
		
	
	}
	
	
}
