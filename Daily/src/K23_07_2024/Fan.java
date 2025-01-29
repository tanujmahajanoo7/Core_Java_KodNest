package K23_07_2024;

public class Fan {

	String brand;
	String color;
	int cost;
	
	void rotate()
	{
		System.out.println("Fan is rotating");
	}
	
	void blowsAir() {
		System.out.println("Air is blowing");
	}
}

class ClassRoomApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassRoom classRoom = new ClassRoom();
		classRoom.lightOn("Blue");
		Fan fan = new Fan();
		classRoom.fanOn(fan);
	}
}

class ClassRoom {
	String name;
	void lightOn(String color) {
		System.out.println(color + "light is on");
	}
	void fanOn(Fan f) {
		f.blowsAir();
		System.out.println();
	}
}