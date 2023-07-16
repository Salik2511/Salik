package Week1.day1;

public class FindingDuplicates {
	public static void main (String [] args)

	{
		int  nums []= {2,5,7,7,5,9,2,3};
		int n = nums.length;
		System.out.println("This is the duplciates element" + " " + duplicates(nums, n));
	}
	static int duplicates( int a [], int n )
	{
		 int b =0;
		for ( int i =0;i<n;i++)
		{
			 for ( int j=i+1;j<n;j++)
			 {
				 if ( a[i]==a[j])
				 {
					b =  a[j];
				 }
			 }
		}
		 return  b ;
		
	}
}
