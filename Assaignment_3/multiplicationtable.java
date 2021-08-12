package Assaignments.Assaignment_3;
import java.util.Scanner;

public class multiplicationtable {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Enter a number : ");
		int n = input.nextInt();
		for(int i = 1; i <= 12; i++) {
			System.out.println(n + " x " + i + " = " + (n*i));
		}
		
	}

}
