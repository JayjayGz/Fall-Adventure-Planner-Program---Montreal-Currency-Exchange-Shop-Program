// ---------------------------------------------------------
// Assignment (2)
// Written by: (Jeffrey Gueyie and 40315016)
// For COMP 248 Section (S 2242) – Fall 2024
//
//This program allows the user to sell foreign currency by calculating the required amount to spend in the target currency in order to receive a specific amount of CAD. The opposite is also possible. In other words, the user can also buy foreign currency by calculating the amount of CAD necessary to receive a specific amount of target currency. The program uses the concepts of "if" statements and "switches" to adapt the situation to the type of transaction (buy or sell) and to the buy rates and sale rates with respect to their currencies.
// ---------------------------------------------------------

import java.util.Scanner;
public class A2_Q2 {

	public static void main(String[] args) {
		
		//Title
		System.out.println(" ****************************************************************************************");
		System.out.println("                            Montreal Currency Exchange Shop!");
		System.out.println(" ****************************************************************************************");
		
		//Welcome message
		System.out.println("\n Welcome to the Montreal Currency Exchange Shop!");
		
		//Creation of new Scanner
		Scanner keyIn = new Scanner(System.in);
		
		//Double variables declaration and initialization
		double CAD_amount;
		double foreign_currency = 0;
		double buy_rate = 0;
		double sale_rate = 0; 
		
		//String variable declaration
		String buy_sell, currency;
		
		 
		
{	
		//Type of transaction
		System.out.print(" Do you want to buy foreign currency (B) or sell foreign currency (S)? ");
		buy_sell = keyIn.next();
		
		if (buy_sell.toUpperCase().contains("S")) {
			
		//Amount of CAD to receive
		System.out.print(" Enter the CAD amount you would like to receive: ");
		CAD_amount = keyIn.nextDouble();
		
		//Target currency to sell
		System.out.print(" Enter the target currency to sell (USD, EUR, GBP, JPY, AUD): ");
		currency = keyIn.next().toUpperCase();
		
		//Switch with varying sale rates (CAD) with respect to currency
		switch (currency) {
		
			case "USD": buy_rate = 1.30;
				break;
				
			case "EUR": buy_rate = 1.55;
				break;
				
			case "GBP": buy_rate = 1.80;
				break;
				
			case "JPY": buy_rate = 0.012;
				break;
				
			case "AUD": buy_rate = 1.00;
				break;
				
			default: System.out.println(" Invalid currency ");
			}
		
		//Calculation of foreign currency to spend
		foreign_currency = CAD_amount / buy_rate;
		
		//Output of previous calculation
		System.out.printf(" You will need to spend %.2f %s to receive %.2f CAD%n", foreign_currency, currency, CAD_amount);
		
		}
		
		
		
		if (buy_sell.toUpperCase().equals("B")) {
			
		//Type of currency to buy
		System.out.print(" Enter the currency you want to buy (USD, EUR, GBP, JPY, AUD): ");
		currency = keyIn.next().toUpperCase();
		
		//Amount of target currency to buy
		System.out.print(" Enter the amount of " + currency.toUpperCase() + " you want to buy: ");
		foreign_currency = keyIn.nextDouble();
		
		//Switch with varying buy rates (CAD) with respect to currency
		switch (currency) {
			case "USD": sale_rate = 1.25;
				break;
				
			case "EUR": sale_rate = 1.50;
				break;
				
			case "GBP": sale_rate = 1.75;
				break;
				
			case "JPY": sale_rate = 0.01;
				break;
				
			case "AUD": sale_rate = 0.95;
				break;
				
			default: System.out.println(" Invalid currency ");
			
		}
		//Calculation of CAD amount to spend
		CAD_amount = (foreign_currency*sale_rate);
		 
		//Output of previous calculation
		System.out.printf(" You need to spend %.2f CAD to receive %.2f %s%n", CAD_amount, foreign_currency, currency);
		
		}
	
		
		//Closing message
		System.out.print(" Thank you for visiting!");
	}
		//Closing Scanner
		keyIn.close();
	}

}
