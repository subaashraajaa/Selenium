package week1.day1;

public class NegativeToPositive {
int num = -123;
public static void main(String[] args) {
	NegativeToPositive nop = new NegativeToPositive ();
	if (nop.num>0)
	{	
		System.out.println(nop.num);
	}
	else if (nop.num < 0 )
	{
		System.out.println(nop.num*-1);
	}
	else
	{
		System.out.println(" Your number is neither POSITIVE nor NEGATIVE");
	}
}	
}
