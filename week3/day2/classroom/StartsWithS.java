package week3.day2.classroom;

import java.util.ArrayList;
import java.util.List;

public class StartsWithS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 List <String> list = new ArrayList <String>();
	list.add("Subash");
	list.add("Subi");list.add("Surya");list.add("Sudipt");list.add("Kani");list.add("Madhu");list.add("Ravi");
	for (int i=0;i<list.size();i++)
	{
		if(list.get(i).startsWith("S"))
				{
			System.out.println(list.get(i));
			}
	}
	
}
}