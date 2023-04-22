import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        int sayi;
        System.out.println("Bir Sayi Giriniz : ");
        sayi=inp.nextInt();
        int i=1, k=1;
        while ( i<=sayi) {
            i*=4;
            System.out.println(i);
        }
        while ( k<=sayi) {
            k*=5;
            System.out.println(k);
        }
    }
}