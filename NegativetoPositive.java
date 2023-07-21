package Week1.day2;

public class NegativetoPositive {
	public static void main (String [] args)
	{
		int a =30;
		int b =check(a);
		System.out.println("return positive number "+ b);
		
	}
	static int  check (int a )

	{
		if (a<0)
		{
			return Math.abs(a);
		}
		else 
			return a ;
	}
}
