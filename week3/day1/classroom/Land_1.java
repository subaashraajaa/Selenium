package week3.day1.classroom;

public class Land_1 implements Plan_1 {

	@Override
	public int poojaRoomSize(int pr_size) {
		// TODO Auto-generated method stub
		System.out.println("Pooja Room size : ");return pr_size;
	}

	@Override
	public int hallSize(int hall_size) {
		// TODO Auto-generated method stub
		System.out.println("Hall size : ");return hall_size;
	}

	@Override
	public int bedRoom(int no_of_rooms) {
		// TODO Auto-generated method stub
		System.out.println("No Of bed rooms : ");	return no_of_rooms;
	}

	@Override
	public int kitchen(int no_of_shelves) {
		// TODO Auto-generated method stub
		System.out.println("No Of shelves in kitchen : ");return no_of_shelves;
	}


	public int storeroom(int size) {
		System.out.println("Store room size : ");return size;
		
	}
	
	
}
