import java.util.Scanner;

class Palindrome {

    void palindrome() {
        Palindrome palin = new Palindrome();
        String string = palin.inputString();

        if (!palin.pal(string)) {
            System.out.println("Nem palindrom\n");
        } else {
            System.out.println("Palindrom\n");
        }
    }

    String inputString() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    boolean pal(String string) {
        char[] str = string.toCharArray();
        int first = 0;
        int last = string.length() - 1;
        System.out.println(last);
        while (first < last) {
            if (str[first] != str[last]) {
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}