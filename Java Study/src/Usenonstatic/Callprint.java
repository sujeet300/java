package Usenonstatic;

public class Callprint 

{

	public static void main(String[] args)
	{
		nonstatic s1=new nonstatic();
		s1.Employeecode=10297;
		s1.EmployeeName="sujeet";
		nonstatic.CEO="sagar";
		nonstatic s2=new nonstatic();
		s2.Employeecode=10298;
		s2.EmployeeName="prasad";
		nonstatic.CEO="akash";
		s1.m1();
		s2.m1();
		
	}
	
}
