
package Week1.day2;

public class SecondSmallestNumber {
	public static void main (String [] args)
	{
		 int a []= {23,45,67,32,89,22,20 };
		System.out.println("This isthe second smallest number "+  finding(a));
	}
	static int finding(int a[])
	{
		int  b = a[0];
		int c = a[0];
		 for ( int i =1;i<a.length;i++)
		 {
			 if (b>a[i])
			 {
				 c=b;
				b=a[i]; 
			 }
			
		 }
		 return c;
	}

}
