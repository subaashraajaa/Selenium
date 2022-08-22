package week3.day1;

public class AxisBank4 extends BankingInfo4{
	public void deposit()	
	{
		System.out.println("Deposit Amount from Class Axis bank : 20,80,600");
	}
	
	public void ThisAndSuper()
	{
		System.out.print("child   :   ");this.deposit();
		System.out.print("parent  :  ");super.deposit();
	}
		
	public static void main(String[] args) 
	{
		AxisBank4 ab4 = new AxisBank4(); 
		
		ab4.deposit();	
		
		ab4.ThisAndSuper();
	}

}
