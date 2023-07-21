
package Week1.day2;

public class PrimeNumber {
	public static void main (String [] args)
	{
		 int a =13;
		 if (check(a))
		 {
			 System.out.println("Is prime number");
		 }
		 else {
			 System.out.println("not prime number ");
		 }
		 
	}
	static boolean check( int a )
	{
		for ( int i=2;i<a;i++) {
			
		 if ( a%i==0) {
		 
			return false;
		 }}
		 

	 return true;
	
	}

}
