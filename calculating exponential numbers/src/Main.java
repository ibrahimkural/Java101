import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, e, total=1;
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        n= input.nextInt();
        System.out.println("enter an exponent");
        e=input.nextInt();

        for ( int i=1; i<=e; i++) {
            total*=n;
        }

        System.out.println("Result : " + total);
    }
}