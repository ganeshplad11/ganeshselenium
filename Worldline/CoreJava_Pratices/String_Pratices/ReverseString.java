package String_Pratices;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "bgrf val";
		
		char[] strarr = s.toCharArray();
		
		for (int i =strarr.length-1; i>=0 ;i--)
		{
			System.out.println(strarr[i]);
		}
		
		

	}

}
