package week1.day2;

public class PrimeOrNot
{
public int prime( int a )
{
	int count =0;

	for ( int i=2; i<=a ; i ++)
	{
		if (a%i==0)
		{
			count ++;
		}
	}
	if ( count == 1)
	{
		System.out.print("Prime number : ");
	}
	else 
	{
		System.out.print("Non prime number :");
}
	return a ;
}
public static void main(String[] args) {
	PrimeOrNot pm = new PrimeOrNot ();
	System.out.println(pm.prime(131));
}
}
