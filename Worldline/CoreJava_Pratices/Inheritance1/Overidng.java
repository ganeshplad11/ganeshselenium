package Inheritance1;

public class Overidng {
	
	public String s1="nothing" ;
	
	public void over1()
	{
		System.out.println("parenclass1");
	}

	public void over1(String s)
	{
		this.s1= s;
		System.out.println("parent class2==========>"+s);
		
	}
}
class chile extends Overidng
{
	public void over1()
	{
		System.out.println("child1 class");
	}

	public void over1(String s)
	{
		this.s1= s;
		System.out.println("child class==========>"+s);
		
	}
}