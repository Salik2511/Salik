package Week1.day2;

public class FibonacciSeries {
	public static void main (String [] args)
	{
		int n =10;
		int n1=0;
		int n2=1;
		//int count =0;
		System.out.println("Fibonacciseries");
		for ( int i =0;i<n;i++)
		{
		System.out.print(n1+",");
		int n3 =n1+n2;
		n1=n2;
		n2=n3;
		
		}
	}

}
