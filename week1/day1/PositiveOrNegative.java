package week1.day1;

public class PositiveOrNegative {
	int num = 0 ;
	public static void main(String[] args) {
		PositiveOrNegative pn = new PositiveOrNegative();
		if (pn.num>0)
		{	
			System.out.println(" Your number is POSITVIE");
		}
		else if (pn.num < 0 )
		{
			System.out.println(" Your number is NEGATIVE");
		}
		else
		{
			System.out.println(" Your number is neither POSITIVE nor NEGATIVE");
		}
	}
	
	

}
