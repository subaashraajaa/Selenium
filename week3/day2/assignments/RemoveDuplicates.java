package week3.day2.assignments;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input ="Paypal India";
Set <Character> charSet = new TreeSet <Character> ();		
Set <Character> dupCharSet = new TreeSet <Character> ();			
		
	for(int i=0;i<input.length();i++)	
		
	{
		if(charSet.contains(input.charAt(i)))
		{
			dupCharSet.add(input.charAt(i));
		}
		else
		{
			charSet.add(input.charAt(i));
		}
	}	
		
System.out.println("Char Set : "+charSet);	
System.out.println("DupChar Set : "+dupCharSet);
		
Set <Character> dupRemovedSet = new TreeSet <Character> ();		
		
for (int i=0;i<=charSet.size();i++)		
		
{	
	for (int j=0;j<dupCharSet.size();j++)	
	{
		if(charSet.toString().charAt(i)==dupCharSet.toString().charAt(j))
		{
			charSet.remove(charSet.toString().charAt(i));
		}
		if(charSet.toString().charAt(i)==' ')
		{
			charSet.remove(charSet.toString().charAt(i));
		}
	}
	
}	
System.out.println("Duplicate removed set : "+charSet);		
	}

}
