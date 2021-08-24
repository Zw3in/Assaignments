package Assaignments.Assaignment_2;

public class primeunder10 {

	public static void main(String[] args) {
		
		System.out.print("Prime numbers under 10 : ");
		for(int i = 1; i < 10; i++) {
			if(primecheck(i) == true) {
				System.out.print(i + ", ");
			}
		}
		
	}// main
	
	static boolean primecheck(int n) {
		if (n == 2) {
			return true;
		} // for 2 since it's the only even prime and therefore can't be checked by this
			// script.
		if (n % 2 == 0 || n <= 1) {
			return false;
		} // razor off negative numbers, 0 and 1 and even numbers
		else { // *probably* the most efficient and reliable way to check if a number is prime
				// (probably not the most efficient tbh)
			for (int y = 3; y < Math.sqrt(n); y += 2) {
				if (n % y == 0) {
					return false;
				}
			}
		}
		return true;
	}// primecheck

}// class
