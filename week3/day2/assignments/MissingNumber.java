package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber 
{
	public static void main(String[] args) 
	{
	int missingNumber =0;
	int[] data = {3,2,1,4,6,7,9,10,8,2,3,3,6,7};
	Set <Integer> set =new TreeSet<Integer>();		
	for (int i=0;i<data.length;i++)
	{
		set.add(data[i]);
	}
	System.out.println("set : "+set);
	List <Integer> list = new ArrayList <Integer>(set); int count = 0;
	for (int i=0;i<list.size();i++)
	{
		if(list.get(i).equals(i+1))	
		{
			
		}else
		{
			missingNumber =i+1; break;
		}
	}
	System.out.print("Missing number is "+missingNumber);
	}
}
