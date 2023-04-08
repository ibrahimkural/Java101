import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double b, k, v;

        Scanner veri = new Scanner(System.in);

        System.out.println("Boyunuzu Giriniz : ");
        b=veri.nextDouble();
        System.out.println("Kilonuzu Giriniz : ");
        k=veri.nextDouble();
        v = k / (b * b) ;

        System.out.println("Vucut Kitle Endeksiniz :  " + v + " 'dir");



    }
}