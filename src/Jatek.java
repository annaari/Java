import java.util.Random;
import java.util.Scanner;


class Jatek {

    void game() {
        Jatek game = new Jatek();
        int random = game.random();
        int life = 3;
        int number = 0;
        boolean win = false;

        while (life != 0 && !win) {
            number = game.input();
            win = game.win(random, number, life);
            if (!win)
                life--;
        }

        if (!win)
            System.out.println("You lost! Game over :(\n The number was: " + random);
        else
            System.out.println("Congrats! You guessed the number! :)");
    }

    int random() {
        Random rand = new Random();
        return rand.nextInt(75) + 1;
    }

    int input() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    boolean win(int random, int number, int life) {
        if (random == number) {
            return true;
        } else if (random < number) {
            life--;
            System.out.println("Try to think of smaller numbers!");
            System.out.println("You have " + life + " live(s) left");

        } else {
            life--;
            System.out.println("Try to think of bigger numbers!");
            System.out.println("You have " + life + " live(s) left ");

        }
        return false;
    }
}