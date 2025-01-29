package Table;

import java.util.Scanner;

public class TableApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		Table table = new Table();
		table.numberTable(num);

	}

}
