package Week1.day1;


public class Math {
	public static void main (String [] args)
	{
		int a= 10; int b =20;
		
		Math oc = new Math();
		
		System.out.println(add(a,b));
		
		int c = oc.sub(a,b);
		System.out.println(c);
		
		int d =oc.multiply(a,b);
		System.out.println(d);
		
		int g = oc.divide(a,b);
		System.out.println(g);
		
	}
	
	public static int add(int a, int b  )
	{
		int c = a+b;
		return c ;
	  
	}

	public  int sub(int a , int b )
	{
		int c =(b-a);
		return c;
		
	}

	public  int multiply(int a , int b )
	{
		int c = a*b;
		return  c;
		
		
	}
	
	public int divide (int a, int b)
	{
	    int c =b/a;
      	return c;
		 
	}

}


