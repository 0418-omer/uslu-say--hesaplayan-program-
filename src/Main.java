import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n,k;
        int total = 1;

        Scanner inp = new Scanner(System.in);
        System.out.println("ussu alinacaksayiyi giriniz ");
        n = inp.nextInt();

        System.out.println("us olacak giriniz ");
        k = inp.nextInt();



        for (int i = 1 ; i<=k; i++)
        {
            total*=n;
        }

        System.out.println(n + "  ussu  " + k +" = " +total);
    }
}