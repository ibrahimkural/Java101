import java.util.Scanner;

 class Main {
    public static void main(String[] args) {

        int num1, num2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("enter first number");
        num1 = input.nextInt();
        System.out.print("enter second number");
        num2 = input.nextInt();

        System.out.println("1-addition\n2-Subtraction \n3-Multipliciation\4-Divison");
        System.out.println("Select your choice");
        select = input.nextInt();
        switch (select) {
            case 1 -> System.out.println("Addition: " + (num1 + num2));
            case 2 -> System.out.println("Substaction: " + (num1 - num2));
            case 3 -> System.out.println("Multipliciation: " + (num1 * num2));
            case 4 -> System.out.println("Substaction: " + (num1 / num2));
            default -> System.out.println("Hatali Sayi Girdiniz");
        }
    }
}