import java.util.Scanner;

class Average {

    void average() {
        Average atlag = new Average();
        int number = atlag.inputNumber();

        int[] array = new int[number];
        atlag.inputArray(number, array);

        int sum = atlag.arraySum(array, number);
        System.out.println("Average: " + sum / number);
    }

    int inputNumber() {
        Scanner be = new Scanner(System.in);
        int n = be.nextInt();
        return n;
    }

    void inputArray(int n, int[] t) {
        for (int i = 0; i < n; i++) {
            Scanner be = new Scanner(System.in);
            t[i] = be.nextInt();
        }
    }


    int arraySum(int t[], int n) {
        int s = 0;
        for (int i = 0; i < n; i++) {
            s = s + t[i];
        }
        return s;
    }
}