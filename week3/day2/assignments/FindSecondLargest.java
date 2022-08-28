package week3.day2.assignments;

import java.util.Set;
import java.util.*;

public class FindSecondLargest {

	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		//       output= 7;
		Set <Integer> set =new TreeSet<Integer>();		
				
		for (int i=0 ; i < data.length;i++)
		{
			set.add(data[i]);
		}
		System.out.println("Set  : " +set);
		List <Integer> list = new ArrayList <Integer>(set);
		System.out.println("List : "+list);
		System.out.print("Second Largest number    : "+list.get(list.size()-2));
				
	}

}
