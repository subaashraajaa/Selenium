package org.system.week3.day1;

public class Desktop2 extends Computer2{

	/**
 * Class        :Desktop
 * Methods   :desktopSize()
 */
		
public int desktopSize(int size)	
	{
		System.out.print("Desktop size   : ");
		return size;
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
	{
		Desktop2 desk = new Desktop2 ();
		System.out.println(desk.computerModel("LENOVO "));
		System.out.println(desk.desktopSize(100));
	}
	}

}
