package Assaignments.Assaignment_2;
import java.util.Scanner;


public class vowelorconsonant {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a character : ");
		char x = input.next().charAt(0);
		char y = Character.toLowerCase(x);
		input.close();
		if(vowelcheck(y) == true) {
			System.out.println(x + " is a vowel");
		}
		else if(vowelcheck(x) == false) {
			System.out.println(x + " is a consonant");
		}
	}// main
	
	static boolean vowelcheck(char a) {
		Boolean vowelcheck = false;
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		for(int n = 0; n < vowels.length; n++) {
			if(vowels[n] == a) {
				vowelcheck = true;
			}
		}
		return(vowelcheck);
	}// vowelcheck
}// class
