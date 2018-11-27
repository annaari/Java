import java.util.Scanner;

class Average {

    public static void atlag(String[] args)
    {
        Scanner be = new Scanner(System.in);
        int n = be.nextInt();
        int[] t = new int[n];
        int s = 0;

        for(int i=0; i<n;i++)
            t[i] = be.nextInt();

        for(int i=0;i<n;i++)
            s+=t[i];

        System.out.println("Avarage: "+s/n);

    }
}