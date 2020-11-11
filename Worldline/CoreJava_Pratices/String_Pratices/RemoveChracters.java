package String_Pratices;

import com.google.common.primitives.Chars;

public class RemoveChracters {

	public static void main(String[] args) {
		String str ="  asscall";
		
		char[] s= str.toCharArray();
		
		
	System.out.println("concat:::::::::"+str.concat("amol"));
	
	System.out.println("upercase"+str.toUpperCase());
	
	System.out.println("lowercase::::::::::::::::"+str.toLowerCase());
	System.out.println("trim::::::::"+str.trim());
	System.out.println("index 5 charcter should be print:::::::::::::::::::::::"+str.charAt(5));
	
	System.out.println("substring:::::::::::::::::::"+str.substring(5));
	System.out.println("Substring start index to end index parameter::::::::"+str.substring(0,5));
	System.out.println("tocharArray method:::::::::::::::::::::::"+str.toCharArray());
		
	}

}
