
package Week1.day2;

public class MissingElement {
	public static void main (String [] args)
	{
		 int a []= {1,2,3,4,6,8};
		 check(a);
		 
	}
	static void check (int a[])
	{
		for ( int i =0;i<a.length-1;i++)
		{
			if ( a[i]+1 !=a[i+1]) {
				System.out.println("Missing Number is "+( a[i]+1) );
			}
		}
	}

}
