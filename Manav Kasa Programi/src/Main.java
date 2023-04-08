import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, e, d, m, p, toplam;
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

        toplam = a*2.14+e*3.67+d*1.11+m*0.95+p*5.00;

        System.out.println("Toplam Tutar" + toplam);


    }
}