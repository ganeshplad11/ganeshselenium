package Inheritance1;

public class Main1 {

	public static void main(String[] args) {

//		Inherts vb =  new Inherts ();
//
//		vb.m2();
//		vb.m1();
//		
		Overidng ov1= new Overidng();
		ov1.over1();
		ov1.over1("ganesh");
		
		Overidng ov2= new chile ();
		
		ov2.over1();
		ov2.over1("child class object");
		System.out.println("<<<<,,,============overloading output =========================>");
		child ch = new child () ;
		
		ch.m1();
		ch.m1(12);
		ch.m1("call");
		
	}

}
