package Inheritance;

public class whatsappv3 extends whatsappv2

{

	public void video()
	
	{
		
		System.out.println("video feature");
	}
	
	public static void main(String[] args) 
	
	{
		whatsappv3 s=new whatsappv3();
		s.calling();
		s.video();
		s.message();
		
	}
	
}
