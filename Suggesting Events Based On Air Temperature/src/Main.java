import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the weather temperature");
        int heat;
        heat= input.nextInt();

        if (heat<=5) {
            System.out.println("You can ski");
        }
        else if (heat<=15) {
            System.out.println("You can go to the cinema");
        }
        else if (heat<=25) {
            System.out.println("You can have a picnic");
        }
        else {
            System.out.println("You can go to swim");
        }


    }
}