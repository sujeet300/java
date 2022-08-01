package stringclass;

public class methodinothermethod 

{

public void m1()

{

	System.out.println("hi");
	

}
	

public void m2()

{
m1();
	System.out.println("hi");
	

}
	

public static void main(String[] args) 
{
	methodinothermethod ds=new methodinothermethod();
	ds.m2();
	
}

}
