package Assaignments.Assaignment_1;
import java.util.Scanner;


public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int x = Input.nextInt();
		System.out.println("Enter the second number : ");
		int y = Input.nextInt();
		System.out.println("Enter the length of the sequence (at least 3) : ");
		int z = Input.nextInt();
		Input.close();
		System.out.print(x + ", " + y);
		int a;
		for(a = 0; a < z - 2; a++) {
			int b = x + y;
			System.out.print(", " + b);
			x = y;
			y = b;
		}
	}// main
}// class
