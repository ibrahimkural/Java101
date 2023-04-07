import java.util.Scanner;

public class KdvTutari {
    public KdvTutari() {
    }

    public static void main(String[] args) {
        double kdvOran = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.println("Ucret Tutarini Giriniz:");
        double tutar = input.nextDouble();
        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar + kdvTutar;
        System.out.println("KDV'siz Tutar :" + tutar);
        System.out.println("KDV Orani :" + kdvOran);
        System.out.println("KDV Tutari :" + kdvTutar);
        System.out.println("KDV'li Tutar :" + kdvliTutar);
    }
}