package String_Pratices;

public class Createstring {

	public static void main(String[] args) {
		
		
		String s = "ganesh@lad@attra";
		System.out.println("limit zero 2:::::::::::::");
		String[] arrofstr = s.split("@", 2);
		for(String a :arrofstr)
		{
			System.out.println(a);
		}
		System.out.println("limit zero 5:::::::::::::");
		String[] arrofstr1 = s.split("@", 5);
		for(String a :arrofstr1)
		{
			System.out.println(a);
		}	
		System.out.println("limit zero::::::::::::::::");
		String[] arrofstr2 = s.split("@", 0);
		for(String a :arrofstr2)
		{
			System.out.println(a);
		}	
	}

}
