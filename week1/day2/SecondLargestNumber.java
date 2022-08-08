package week1.day2;

import java.util.Arrays;

public class SecondLargestNumber 
{
int[] numbers = {22,67,98,1,34,58,99};
	public static void main(String[] args) 
	{
		SecondLargestNumber sln = new SecondLargestNumber ();
		Arrays.sort(sln.numbers);
		//for( int i=0 ; i < sln.numbers.length ; i++)
		//{
		//	System.out.println(sln.numbers[i]);
		//}
		//System.out.println(Arrays.toString(sln.numbers));
		System.out.println("second largest number in the array : " + sln.numbers[sln.numbers.length-2]);
	}
}
