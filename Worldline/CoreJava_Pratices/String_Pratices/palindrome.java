package String_Pratices;

public class palindrome {

	public static void main(String[] args) {
	
		String s = "Madam";
		String s1 = s.toUpperCase();
		
		int i =0  ;
		int j = s1.length()-1;
		
		while (i<j)
		{
			if (s1.charAt(i)!=(s1.charAt(j)))
			{
				System.out.println("string is not palindrome");
			}
			else
			{
				System.out.println("string is  palindrome"+s);
			}
			
			i++;
			j--;
		}
		
		

	}

}
