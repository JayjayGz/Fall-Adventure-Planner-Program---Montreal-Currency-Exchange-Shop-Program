// ---------------------------------------------------------
// Assignment (2)
// Written by: (Jeffrey Gueyie and 40315016)
// For COMP 248 Section (S 2242) – Fall 2024
//
//This program uses the user input of temperature and weather conditions to suggest predetermined clothing recommendations and safety precautions with the use of "if-else" statements. Thus, it ensures that the user will be well dressed according to the the outside conditions.
// ---------------------------------------------------------

import java.util.Scanner;
public class A2_Q1a {

	public static void main(String[] args) {
		
		 
		
		
		//Title
		System.out.println(" ###########################################################################");
		System.out.println("                        Fall Adventure Planner!!!");
		System.out.println(" ###########################################################################");
		
		//Welcome message
		System.out.println("\n Welcome to the Fall Adventure Planner!");
		
		//Creation of new Scanner
		Scanner keyIn = new Scanner(System.in);
		
		//Integer variable declaration
		int temperature;
		
		//String variable declaration
		String weather_condition;
		
		//User input: temperature
		System.out.print(" Enter the current temperature (°C): ");
		temperature = keyIn.nextInt();
		
		//User input: weather condition
		System.out.print(" Enter the weather condition (sunny/rainy/snowy): ");
		weather_condition = keyIn.next();
		
		
		//Clothing Recommendations & Safety Recommendations
			{	
		if (weather_condition.toLowerCase().contains("rainy"))
			{
			System.out.print("\n Recommended clothing: Waterproof clothing. ");
			System.out.print("\n Safety tip: Be cautious of slippery paths!");
			}
		else
			if (temperature > 20 && weather_condition.toLowerCase().contains("sunny")) 
				{
				System.out.print("\n Recommended clothing: Light clothing (t-shirt and shorts). ");
				System.out.print("\n Safety tip: Don’t forget sunscreen and stay hydrated! ");
				}
			else
		
				if (temperature >= 10 && weather_condition.toLowerCase().contains("sunny"))
						{System.out.print("\n Recommended clothing: A light jacket. ");
						System.out.print("\n Safety tip: Don’t forget sunscreen and stay hydrated!");
						}	
				else
					if (temperature <10 && weather_condition.toLowerCase().contains("sunny"))
						{
						System.out.print("\n Recommended clothing: Warm clothing (a sweater and a coat). ");
						System.out.print("\n Safety tips: Don’t forget sunscreen and stay hydrated! ");
						}
					else
						if (temperature > 20 && weather_condition.toLowerCase().contains("snowy"))
						{
						System.out.print("\n Recommended clothing: Heavy winter clothing.");
						System.out.print("\n Safety tip: Stay warm and watch out for icy conditions! ");
						}	
						else 
							if (temperature >= 10 && weather_condition.toLowerCase().contains("snowy"))
								{
								System.out.print("\n Recommended clothing: A light jacket.");
								System.out.print("\n Recommended clothing: Heavy winter clothing.");
								System.out.print("\n Safety tip: Stay warm and watch out for icy conditions! ");
								}
							else 
								if (temperature < 10 && weather_condition.toLowerCase().contains("snowy"))
									{
									System.out.print("\n Recommended clothing: Warm clothing (a sweater and a coat). ");
									System.out.print("\n Recommended clothing: Heavy winter clothing.");
									System.out.print("\n Safety tip: Stay warm and watch out for icy conditions! ");
									}
		//Closing message
		System.out.println("\n Thank you for using the Fall Adventure Planner!");
	}
		//Closing scanner
		keyIn.close();

	}

}
