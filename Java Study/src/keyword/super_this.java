package keyword;

public class super_this extends demo1
{
	
int a=20;

public void m1()
{

	int a=30;
	System.out.println(a);
	System.out.println(this.a);
	System.out.println(super.a);
}

public static void main(String[] args)

{
	
	super_this s1=new super_this();
	s1.m1();
}

}
