// ---------------------------------------------------------
// Assignment (1)
// Written by: (Jeffrey Gueyie and 40315016)
// For COMP 248 Section (S 2242) – Fall 2024
//
// Algorithm 2: String Inspector Program
//
//This algorithm analyzes the content of a sentence of the user's choice. The program can do various operations like locating words in a sentence, verify the first letter of the sentence, replace letters, etc.
// ---------------------------------------------------------

import java.util.Scanner;
public class A1_Q2 {

	public static void main(String[] args) {
		
		//Title
		System.out.println("*********Algorithm 2: String Inspector Program*********");
		
		//Welcome message
		System.out.println("Welcome User. This algorithm analyzes the content of a sentence of your choice.  ");
		
		//Creation of new Scanner
		Scanner keyIn = new Scanner(System.in);
		
		//String variables
		String sentence, word, separator;
		
  		//User input: sentence
		System.out.print("Enter the given sentence (longer than 5 characters): ");
		sentence = keyIn.nextLine();
	
		//User input: word
		System.out.print("Enter the given word: ");
		word = keyIn.nextLine();
		
		//User input: separator
		System.out.print("Enter a separator to join the two strings: ");
		separator = keyIn.nextLine();
		
		//Operation: Substring Presence
		System.out.println("\nGiven sentence contain the given word " + sentence.contains(word));
		
		//Operation: String Start
		System.out.println("Given sentence start with an \'i\': " + sentence.startsWith ("i"));
		
		//Operation: Replace Characters
		System.out.println("Sentence with \'a\' replaced by \'e\': " + sentence.replaceAll("a", "e"));
		
		//Operation: Join Strings
		String result = String.join(separator, sentence, word);
		System.out.println("Joined string: " + result);
		
		//Operation: Character Position
		System.out.println("\'a\' appears at index " + sentence.indexOf("a") + " in the given sentence. ");
		
		//Operation: Character at Specific Position
		System.out.println("Character at 3rd position in the given sentence: " + sentence.charAt(2));
		
		//Closing message
		System.out.println("\nThank you for using the String Inspector tool. Have a great day! ");
		
		//Closing Scanner
		keyIn.close();
		
				
		

	}

}
