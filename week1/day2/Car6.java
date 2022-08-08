package week1.day2;

public class Car6 {
	
	public void carBrand ()
	{
		System.out.println("AMBASADDOR" );
	}
	
	public String getCarColour()
	{
	return "WHITE";
	}
	
	public int getCarEngineNumber()
	{
	return 55667788;
	}

	public int numbersSubtraction (int a , int b )
	{
	return a-b ;
	}
	
	public int numbersAddition (int a , int b )
	{
	return a+b ;
	}
	
	public int numbersMultiply (int a , int b )
	{
	return a*b ;
	}
	
	public static void main(String[] args) {
		Car6 c6 = new Car6();
		c6.carBrand();
		System.out.println(c6.getCarColour());
		System.out.println(c6.getCarEngineNumber());
		System.out.println(c6.numbersAddition(10,22));
		System.out.println(c6.numbersSubtraction(44,88));
		System.out.println(c6.numbersMultiply(99, 44));
		
	}
	
	
}
