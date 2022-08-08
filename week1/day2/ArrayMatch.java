package week1.day2;

public class ArrayMatch {
int[] arr1 = {10,20,30,40,50,60,70};
int[] arr2 = {5,10,15,20,25,30,35,40};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Repeated numbers : ");
		ArrayMatch am = new ArrayMatch();		
for(int i=0;i<am.arr1.length;i++)
{
	for ( int j=0; j<am.arr2.length;j++)
	{
		if(am.arr1[i]==am.arr2[j])
		{
			System.out.println(am.arr2[j]);
		} 
	}
}
	}
}
