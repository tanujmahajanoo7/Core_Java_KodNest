package TempcConverter;

import java.util.Scanner;

public class TempConverterApp {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		double temp =scan.nextDouble();
		
		scan.close();
		
		TempConverter tc = new TempConverter();
		System.out.println(tc.celsiusToFahrenheit(temp));
	}
}
