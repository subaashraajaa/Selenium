package org.student.week3.day1;

import org.department.week3.day1.Department3;

public class Student3 extends Department3 {
/**
 * Package   :org.student
 *   Class        :Student
 *   Methods   :studentName()
 */
	
public String 	studentName (String stdName)
{
	System.out.print("Student name 	: ");
	return stdName;
}
	
/**
 * Package   :org.student
 *   Class        :Student
 *   Methods   :studentDept()
 */
	
public String 	studentDept (String stdDept)
{
	System.out.print("Student Department : ");
	return stdDept;
}	
	
/**
 * Package   :org.student
 *   Class   :Student
 *   Methods :studentId()
 */
	
public String 	studentId (String stdId)
{
	System.out.print("Student Id 	: ");
	return stdId;
}	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student3 std = new Student3();
System.out.println(std.collegeName("Karpagam college Of Engineering"));
System.out.println(std.collegeCode("1204"));
System.out.println(std.collegeRank(1));

System.out.println(std.deptName("E.E.E"));

System.out.println(std.studentName("Subash Raja"));
System.out.println(std.studentId("14E150"));
System.out.println(std.studentDept("Electrical Engineering"));


	}

}
