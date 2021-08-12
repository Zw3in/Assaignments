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
	
	static boolean primecheck(int x) {
		
		Boolean primecheck = true;
		if(x <= 0) { // for negative numbers and 0
			primecheck = false;
		}
		else if(x <= 2) { // for 1 and 2 sine they can't be checked, (at least not by simple scripts)
		}
		else {
			for(int y = 2; y <= Math.sqrt(x); y++) { // probably the most efficient and reliable way to check if a number is prime
				if(x%y == 0) {
					primecheck = false;
					break;
		
				}
			}
		}
		return(primecheck);
	}// primecheck

}// class
