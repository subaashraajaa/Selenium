package week3.day2.classroom;

import java.util.ArrayList;
import java.util.List;

public class Find22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List <Integer> list = new ArrayList <Integer>();
			list.add(100);
			list.add(22);list.add(12);list.add(22);list.add(66);list.add(-22); int count =0;System.out.println(list);
			for (int i=0;i<list.size();i++)
			{
				if(list.get(i)==22)
						{
					count++;
					}
			}System.out.println("No of 22's in my list : "+count);
	}

}
