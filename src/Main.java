import java.util.Scanner;

public class Main extends Jatek {

        public static void main(String[] args) {
            int nr;
            do {
                System.out.println("Choose!");
                System.out.println("0: Exit");
                System.out.println("1: Hello");
                System.out.println("2: Game");
                Scanner keyboard = new Scanner(System.in);

                do {
                    while (true)
                        try {
                            nr = Integer.parseInt(keyboard.nextLine());
                            break;
                        } catch (NumberFormatException nfe) {
                            System.out.print("Write a number: ");
                        }
                } while (nr < 0 || nr > 2);

                switch (nr) {
                    case 1:
                        System.out.println("Hello World! :)\n");
                        break;
                    case 2:
                        int x;
                        System.out.println("Guess the number!\n");
                        game(args);
                        break;
                   // case 3:
                     //   System.out.println("Write a world!\n");
                       // palindrom(args);
                        // break;
                    case 4: System.out.print("Write a number: ");
                            Average.atlag(args);
                            break;
                }

            } while (nr != 0);

        }
}
