package week3.day1;

public class Students5 {
public void getStudentInfo (int id)
{
	System.out.println("Student id   : "+id);
}

public void getStudentInfo (int id,String name)
{
	System.out.println("Student Id   : " + id);
	System.out.println("Student Name : "+name );
}

public void getStudentInfo (String email,long phone)
{
	System.out.println("Email   Id   : " + email);
	System.out.println("Phone Number : "+phone );
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Students5 std5 = new Students5();
std5.getStudentInfo(1634907);
std5.getStudentInfo(1634907 , "Subash Raja");
std5.getStudentInfo("subaashraajaa@gmail.com",1234567890);
}

}
//Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber