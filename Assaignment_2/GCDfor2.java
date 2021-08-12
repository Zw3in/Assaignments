package Assaignments.Assaignment_2;
import java.util.Scanner;


public class GCDfor2 {
	
	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = Input.nextInt();
		System.out.println("Enter another number : ");
		int b = Input.nextInt();
		Input.close();
		int n, i;
		if(a > b) {
			n = b;
		} else {
			n = a;
		}
		for(i = n; i > 0; i--) {
			if(a%i == 0) {
				if(b%i == 0) {
					System.out.println("Greatest Common Denominator between " + a + " and " + b + " is " + i);
					break;
				}
			}
		}
	}// main method
}//class
