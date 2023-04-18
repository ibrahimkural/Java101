import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k;
        Scanner inp=new Scanner(System.in);
        System.out.println("enter a number: ");
        k=inp.nextInt();
        int i=1;
        while ( i<=k ) {
            if ((i%3==0) && (i%4==0))
                System.out.println(i);
            i++;
            }



    }
}