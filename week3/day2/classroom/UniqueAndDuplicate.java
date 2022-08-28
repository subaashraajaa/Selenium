package week3.day2.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueAndDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List <Integer> list = new ArrayList<Integer>();
list.add(22);list.add(12);list.add(22);list.add(66);list.add(-22); list.add(11);list.add(44);list.add(46);list.add(-22); list.add(11);list.add(84);
System.out.println("List              : "+list);		
int count =0;	
System.out.print("Duplicate numbers : [");
for (int i=0;i<list.size();i++)
{
	for (int j=i;j<list.size();j++)
	{
		if(list.get(i)==list.get(j))
		{
			count++;
		}
	}if(count > 1)
	{
		System.out.print(list.get(i)+",");
	}
	count=0;		
}
System.out.print("]\n");
Set <Integer> set =new TreeSet<Integer>(list);		
System.out.println("Unique numbers    : "+set);	
}
}
