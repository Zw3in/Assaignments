package Assaignments.Assaignment_3;
import java.util.Scanner;

public class ASCII {
	
	public static void main(String[] args)   {  
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a key : ");
		String s = input.nextLine();
		input.close();
		try {
			System.out.print("Key in ASCII : ");
			for(int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				int ascii = c;
				System.out.print(ascii + " ");
			}
		} catch(Exception e) {System.out.print("Invalid character found.");}
		
	}  
}
