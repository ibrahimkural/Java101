
import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        double boy, kilo, vucut;
        Scanner input = new Scanner(System.in);
        System.out.println("Boyunuzu giriniz");
        boy = input.nextDouble();
        System.out.println("kilonuzu giriniz");
        kilo = input.nextDouble();
        vucut=kilo/(boy*boy);


        System.out.println("Vucut Kitle Endeksiniz:" + vucut);

    }
}
