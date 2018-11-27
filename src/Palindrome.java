import java.util.Scanner;

class Palindrome {

    private static int lenght(String[] args) {
        return args.length;
    }

    private static void palindrom(String[] args){
        Scanner be = new Scanner(System.in);
        String x = be.nextLine();
        char[] ch  = x.toCharArray();
        int i = 0;
        int j = lenght(args)-1;
        boolean van = true;
        while(i<j && van)
        {
            if(ch[i] != ch[j])
                van = false;
            i++; j--;
        }
        if(van)
            System.out.println("com.example.helloworld.Palindrome\n");
        else
            System.out.println("Nem palindrom\n");
    }
}