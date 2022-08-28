package week3.day2.assignments;

import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {

		int[] data = {4,3,6,8,29,1,2,4,7,8};
        Set <Integer> set = new TreeSet <Integer>();
        Set <Integer> dup = new TreeSet <Integer>();
        for(int i =0 ; i<data.length;i++)
        {
        	if(set.contains(data[i])==false)
        	{
        		set.add(data[i]);
        	}
        	else
        	{
        		dup.add(data[i]);
        	}
        }
      // System.out.println(set); 
       System.out.println("Duplicate entries : "+dup);  
	}
}