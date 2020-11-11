package Inheritance1;

public class Oerload {

	public void m1()
	{
		System.out.println("parent class wthout data signature");
	}

	public void m1(int a )
	{
		System.out.println("m1 wth parametre intger"+a);

	}
}
	class child extends Oerload 
	{
		public void m1(String s)
		{
			System.out.println("m1 but in child class::::::::::::::::"+s);
		}

	}

	


