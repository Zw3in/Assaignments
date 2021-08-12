package Assaignments.Assaignment_4;

public class recessive_series {
    public static void main(String[] args) {
        int i = 1; // controls what actually gets printed
        int n = 1; // keeps track of the starting point
        int j = 4; // keeps track of the ending point
        for( int x = 0; x < 4; x++) {
            for( int y = j; y > 0; y--) {
                System.out.print(i + "  ");
                i += 2;
            }
            System.out.println();
            n += 2;
            i = n;
            j--;
        }// for loop
    }// main
}// class
