package Assaignments.Assaignment_4;

public class progressive_series {
    public static void main(String[] args){
        int i = 1; // controls what actually gets printed
        int n = 1; // keeps track of the starting point
        for( int x = 0; x < 5; x++) {
            for( int y = 0; y < 5; y++) {
                System.out.print(i + "  ");
                i++;
            }
            System.out.println();
            i = ++n;
        }// for loop
    }// main
}// class
