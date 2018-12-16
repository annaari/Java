import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            int nr;
            do {
                System.out.println("Choose!");
                System.out.println("0: Exit");
                System.out.println("1: Hello");
                System.out.println("2: Game");
                System.out.println("3: Palindrome");
                System.out.println("4: Average");
                System.out.println("5: Sudoku");

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

                switch (nr) {
                    case 1:
                        System.out.println("Hello World! :)\n");
                        break;
                    case 2:
                        int x;
                        System.out.println("Guess the number!\n");
                        Jatek.game(args);
                        break;
                    case 3:
                        System.out.println("Write a word!\n");
                        Palindrome.palindrom(args);
                        break;
                    case 4:
                        System.out.print("Write a number: ");
                        Average.atlag(args);
                        break;
                    case 5:
                        System.out.println("Write in a Sudoku table");
                        Sudoku.sudo(args);
                        break;
                }

            } while (nr != 0);

        }
}
