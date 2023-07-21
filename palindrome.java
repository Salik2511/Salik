package Week1.day2;

public class palindrome {
	public static void main (String [] args)
	{
		 String a= "Madam";
		 calling(a);
	}
	static void calling (String a)
	{
	//	char [] b = a.toCharArray();
		String c="";
		for ( int i=0;i<a.length();i++){
			c=a.charAt(i)+c;
		}
		if (a.equals(c))
		{
			System.out.println("Is Palindrome ");
		}
		else 
		{
			System.out.println("Is not palindrome ");
		}
		
		
	}

}
