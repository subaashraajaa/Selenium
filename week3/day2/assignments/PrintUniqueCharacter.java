package week3.day2.assignments;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name = "subash";
Set <Character> set = new HashSet<Character>();	
for(int i =0; i<name.length();i++)		
{
	if(set.contains(name.charAt(i)))
	{
		set.remove(name.charAt(i));
	}
	else
	{
		set.add(name.charAt(i));
	}
}
System.out.println("unique characters : "+set);		
		
		
		
		
	}

}
