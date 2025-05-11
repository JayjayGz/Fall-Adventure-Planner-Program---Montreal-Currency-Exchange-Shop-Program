// ---------------------------------------------------------
// Assignment (1)
// Written by: (Jeffrey Gueyie and 40315016)
// For COMP 248 Section (S 2242) – Fall 2024
//
// Algorithm 1: Solar Roof Energy Calculator
//
//This algorithm is a tool that can be used to calculate solar roof Energy. The user is required to provide information about the number of solar panels, the wattage rating of each solar panel (in watts), the average number of sunlight hours per day, and the efficiency of the solar panels. With that information, the program is able to calculate the daily and annual energy production of the solar roof.
// ---------------------------------------------------------

import java.util.Scanner;

public class A1_Q1 {

	public static void main(String[] args) {
		
		//Title
		System.out.println("*********Algorithm 1: Solar Roof Energy Calculator*********");
		
		//Welcome message
		System.out.println("Welcome User. This algorithm is a tool that can be used to calculate solar roof Energy. ");
		
		//Creation of new Scanner
		Scanner keyIn = new Scanner(System.in);
		
		//Integer variables
		int numPanel, panelWattage;
		
		//Double variables
		double sunlightHours, efficiency, dailyEnergyProduction, annualEnergyProduction;
		
		//User input: number of solar panels
		System.out.print("Enter the number of solar panels: ");
		numPanel = keyIn.nextInt();
		
		//User input: wattage rating of each solar panel
		System.out.print("Enter the wattage rating of each solar panel (in watts): ");
		panelWattage = keyIn.nextInt();
		
		//User input: average number of sunlight hours per day
		System.out.print("Enter the average number of sunlight hours per day: ");
		sunlightHours = keyIn.nextDouble();
		
		//User input: efficiency of the solar panel
		System.out.print("Enter the efficiency of the solar panels (as a percentage): ");
		efficiency = keyIn.nextDouble();
		
		//Calculation of the Daily and Annual Energy Production 
		dailyEnergyProduction = (numPanel*panelWattage*sunlightHours*efficiency)/(1000*100);
		annualEnergyProduction = (dailyEnergyProduction*365);
		
		//Output of previous calculation
		System.out.printf("\nDaily Energy Production: %.4f kwh\n", dailyEnergyProduction);
		System.out.printf("Annual Energy Production: %.4f kwh\n", annualEnergyProduction);
		
		//Closing message
		System.out.println("Thank you for using the Solar Roof Energy Calculator" + "!");
		
		//Closing scanner
		keyIn.close();
		
		
	}

}
