package Assaignments.Assaignment_1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = Input.nextInt();
		Input.close();
		System.out.print( n + "! = " + n);
		for(int x = n - 1; x > 0; x--) {
			System.out.print("* " + x);
			n *= x;
		}
		System.out.print(" = " + n);
	}// main

}// class
