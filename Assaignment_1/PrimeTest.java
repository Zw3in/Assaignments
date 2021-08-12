package Assaignments.Assaignment_1;
import java.util.Scanner;


public class PrimeTest {
	
	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int x = Input.nextInt();
		Input.close();

		
		if(primecheck(x) == true) {
			System.out.println(x + " is prime");
		}
		else {
			System.out.println(x + " is not prime");
		}
	} // main
	
	static boolean primecheck(int n) {
		
		if(n == 2)   { return true;  }              // for 2 since it's the only even prime and therefore can't be checked by this script.
		if(n%2 == 0 || n <= 1)  { return false; }   // razor off negative numbers, 0 and 1 and even numbers
		else { // *probably* the most efficient and reliable way to check if a number is prime (probably not the most efficient tbh)
			for(int y = 3; y < Math.sqrt(n); y+= 2) { 
				if(n%y == 0) {
					return false;
				}
			}
		}
		return true;
	}
	
}// class
