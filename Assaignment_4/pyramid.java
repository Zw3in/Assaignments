package Assaignments.Assaignment_4;

public class pyramid {
    static int levels = 9; /* Change this to print pyramids of different sizes 
    (Only works up to 9. Looks weird after that simply because 2-digit numbers take up more space.) */
    public static void main(String[] args) {
        int current_level = 1;
        while (current_level <= levels) {
            level_generator(current_level);
            current_level++;
        }
    }// main
    static void level_generator(int current_level) {
        int x = 0;
        while (x < (levels - current_level)) {
            System.out.print(" ");
            x++;
        }
        int y = 0;
        while (y < current_level) {
            System.out.print(" " + current_level);
            y++;
        }
        System.out.println();
    }// level_generator
}// class