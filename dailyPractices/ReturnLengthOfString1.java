package dailyPractices;

public class ReturnLengthOfString1 {
public int LastWordcount(String name)
{
	
	String[] str_arr = name.split(" ");
	String lastWord = str_arr[str_arr.length-1]; 
	int count = lastWord.length();
	System.out.print("Last Word of the Input is " );	
	return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnLengthOfString1 rl = new ReturnLengthOfString1();
		System.out.print(rl.LastWordcount("Hi How are subash"));
	}

}
