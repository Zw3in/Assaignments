package Assaignments.Assaignment_4;

class exponential_series{
    public static void main(String[] args) {
        int x = 0; // sequence number
        int i = 1; // answer
        while (x <= 5) {
            System.out.println(x + "! = " + i);
            i = ++x*i;
        }
    }// main
}// class