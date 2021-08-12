package Assaignments.Assaignment_3;
import java.util.Scanner;

public class StringContentsCounter {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = input.nextLine().toLowerCase(); // makes the code look a lot cleaner
		input.close();
		char[] characters = s.toCharArray();
		int vowels = 0;
		int consonants = 0;
		int digits = 0;
		int spaces = 0;
		for(int i = 0; i < s.length(); i++) {
			char c = characters[i];
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {vowels++; continue;}
			if(c >= 'a' && c <= 'z') {consonants++; continue;}
			if(c >= '0' && c <= '9') {digits++; continue;}
			if(c == ' ') {spaces++; continue;}
		}
		System.out.println("Number of vowels :" + vowels);
		System.out.println("Number of consonants :" + consonants);
		System.out.println("Number of digits :" + digits);
		System.out.println("Number of spaces :" + spaces);
	}
}
