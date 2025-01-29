package Handling;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Bird {
	void fly()throws SQLException {
		System.out.println("Bird is flying");
	}
	void eat() throws FileNotFoundException {
		System.out.println("Bird is eating");		
	}
	void sleep() throws Exception {
		System.out.println("Bird is sleeping");		
	}	
	void foodHabit() throws ArrayIndexOutOfBoundsException {
		System.out.println("Bird has a food Habit");
	}
}
