import java.util.Scanner;

public class main {
    public static void main(String[] args) {
            double a, e, d, m, p, kga=2.14, kge=3.67, kgd=1.11, kgm=0.95, kgp=5.00, toplam;
            Scanner input = new Scanner(System.in);
            System.out.print("Armut Kac Kilo : ");
            a = input.nextDouble();
            System.out.print("Elma Kac Kilo : ");
            e = input.nextDouble();
            System.out.print("Domates Kac Kilo : ");
            d = input.nextDouble();
            System.out.print("Muz Kac Kilo : ");
            m = input.nextDouble();
            System.out.print("Patlican Kac Kilo : ");
            p = input.nextDouble();

            toplam = a*kga+e*kge+d*kgd+m*kgm+p*kgp;

            System.out.println("Toplam Tutar"  + toplam);

    }
}

