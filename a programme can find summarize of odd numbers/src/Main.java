import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     int n;
     int total=0;

        Scanner input=new Scanner(System.in);
        do {
            System.out.println("Sayi Giriniz : ");
            n = input.nextInt();
            if ((n % 4 == 0)) {
                total += n;
            }
        }
            while (n % 2 != 1) ;

        System.out.println("Toplam :" + total);

    }
}