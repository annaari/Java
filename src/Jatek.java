import java.util.Random;
import java.util.Scanner;


class Jatek {

    public static void game(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(75) + 1;

        boolean win = false;
        int elet = 3;

        while (elet != 0 && !win) {
            Scanner be = new Scanner(System.in);
            int x = be.nextInt();
            if (x == n)
            {
                win = true;
            }
            else if (x > n) {

                elet = elet - 1;
                System.out.println("Try to think of smaller numbers!");
                System.out.println("You have "+elet+" live(s) left");

            } else {

                elet = elet - 1;
                System.out.println("Try to think of bigger numbers!");
                System.out.println("You have "+elet+" live(s) left ");

            }
        }
        if(!win)
            System.out.println("You lost! com.example.helloworld.Jatek over :(\n The number was: "+n);
        else
            System.out.println("Congrats! You guessed the number! :)");
    }
}