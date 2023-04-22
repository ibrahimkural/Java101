import java.util.Scanner;

public class Main {

    static int pattern(int k) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz :");
        int  b= scan.nextInt();
        int result=0;
        if (b==0) {
            return 0;

        }
            return pattern(b-5)+b;

    }

    public static void main(String[] args) {
        pattern(10);
    }
}