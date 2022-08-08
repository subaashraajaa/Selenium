package week1.day2;

public class FibbinociSeries {
public static void main(String[] args) {
	int first = 0 , second = 1, dummy ;
	System.out.println("FIBBINOCCI SERIES : \n");
/*	for ( int i =0 ; i<=10 ; i ++)
	{
		if (i==0)
		{
			System.out.print(first +"  ");
		}
		else if (i==1 )
		{
			System.out.print(second + "  ");
		}
		else
		{
			dummy = first + second;
			System.out.print(dummy + "  ");
			first = second;
			second = dummy;
		}
		
	} */
	int i = 2;
	/*while ( i <= 10)
	{
		dummy = first + second ;
		System.out.println(dummy);
		first = second;
		second = dummy; i ++;
	} 
	*/
	System.out.print(first + "  " + second + "  ");
	do {
		dummy = first + second ;
		System.out.print(dummy + "  ");
		first = second;
		second = dummy;	i++;
	} while ( i <=10);
	
	
	
	
	
	
	
}
}