package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] input1 = {3,2,11,4,6,7};
int [] input2 = {1,2,8,4,9,7};
List <Integer> list1 = new ArrayList <Integer>();
List <Integer> list2 = new ArrayList <Integer>();

for (int i=0;i<input1.length;i++)
{
	list1.add(input1[i]);
}
System.out.println("List 1 :"+list1);

for (int i=0;i<input2.length;i++)
{
	list2.add(input2[i]);
}
System.out.println("List 2 : "+list2);

List<Integer> list3 = new ArrayList <Integer>();
for (int i=0;i<list1.size();i++)
{
	for(int j=0;j<list2.size();j++)
	{
		if(list1.get(i)==list2.get(j))
		{
			list3.add(list1.get(i));
		}
	}
}
System.out.println("Matching elements : "+list3);
	}
}
