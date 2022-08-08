package week1.day1;

public class TwoWheeler {
	int noOfWheels = 2;
	short noOfMorrors = 4;
	long chassisNumber = 123456789;
	boolean isPunctured = false;
	String bikeName = "Hornet 2.0" ;
	double runningKM = 200 ;

public static void main(String[] args) {
	TwoWheeler tw = new TwoWheeler ();
	System.out.println(tw.bikeName);
	System.out.println(tw.chassisNumber);
	System.out.println(tw.noOfWheels);
	System.out.println(tw.isPunctured);
	System.out.println(tw.runningKM);	
	System.out.println(tw.noOfWheels);	
	
}
}
