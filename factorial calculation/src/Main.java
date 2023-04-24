import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        System.out.println("Faktoriyel Giriniz : ");
        int n=inp.nextInt();
        int i=1, toplam=1;
        while (i<=n) {
            toplam *=i;
            i++;
        }


        System.out.println( n + ".Factorial :" + toplam);
    }
}