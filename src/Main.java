import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        Jatek jt = new Jatek();
        Average avg = new Average();
        Palindrome pali = new Palindrome();
        Sudoku sudo = new Sudoku();

        int number;
        do {
            main.choice();
            number = main.check();
            main.Switch(number,jt,pali,avg,sudo);
        } while (number != 0);

    }

    int check() {
        int nr;
        Scanner keyboard = new Scanner(System.in);
        do {
            while (true)
                try {
                    nr = Integer.parseInt(keyboard.nextLine());
                    break;
                } catch (NumberFormatException nfe) {
                    System.out.print("Write a number: ");
                }
        } while (nr < 0 || nr > 10);
        return nr;
    }

    void Switch(int nr, Jatek jt, Palindrome pali, Average avg, Sudoku sudo)
    {
        switch (nr) {
            case 1:
                System.out.println("Hello World! :)\n");
                break;
            case 2:
                System.out.println("Guess the number!\n");
                jt.game();
                break;
            case 3:
                System.out.println("Write a word!\n");
                pali.palindrome();
                break;
            case 4:
                System.out.print("Write a number: ");
                avg.average();
                break;
            case 5:
                System.out.println("Write in a Sudoku table");
                sudo.sudo();
                break;

        }
    }
    void choice(){
        System.out.println("Choose!");
        System.out.println("0: Exit");
        System.out.println("1: Hello");
        System.out.println("2: Game");
        System.out.println("3: Palindrome");
        System.out.println("4: Average");
        System.out.println("5: Sudoku");
        System.out.println("6. Hangman");
    }
}
