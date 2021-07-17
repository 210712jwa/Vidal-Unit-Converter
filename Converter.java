package main;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		

		int selection = 0;
		System.out.println("Please select an option:\r\n" + "1. Cups to Teaspoons\r\n" + "2. Miles to Kilometers\r\n"
				+ "3. US Gallons to Imperial Gallons\r\n" + "4. Quit");
		Scanner scan = new Scanner(System.in);
		selection = scan.nextInt();
		if (selection == 4) 
		{
			System.out.println("Goodbye!");
		}	
		
		//Begins menu selection loop
		while (selection != 4)
		{
			if(selection > 4)
			{
				System.out.println("error");
			}
			else {
			System.out.println("Please input an amount or distance:\r\n");
			Scanner input = new Scanner(System.in);
			float amount = input.nextInt();
			switch (selection) {
			case 1:
				// 1 cup = 48 teaspoons
				float tp = (float) (amount * 48);
				System.out.println("Amount is: " + tp);
				break;
			case 2:
				// 1 mile = 1.6km
				float km = (float) (amount * 1.6);
				System.out.println("Distance is: " + km);
				break;
			case 3:
				// 1 gallon = 0.832674 imperial gallon
				float imp = (float) (amount * 0.832674);
				System.out.println("The amount is: " + imp);
				break;
			}
			}
			System.out.println("Please select an option:\r\n" + "1. Cups to Teaspoons\r\n"
					+ "2. Miles to Kilometers\r\n" + "3. US Gallons to Imperial Gallons\r\n" + "4. Quit");
			scan = new Scanner(System.in);
			selection = scan.nextInt();
			if (selection == 4) 
			{
				System.out.println("Goodbye!");
			}
		}

	}
	
}

