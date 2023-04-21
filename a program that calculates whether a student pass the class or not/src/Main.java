import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double math, physics, turkish, chemistry, music, total=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your math score: ");
        math=input.nextInt();
        if ((math<0)||(math>100)) {
            System.out.println("invalid number");
        }
        else {
            total += math;
        }
        System.out.println("Enter your physics score: ");
        physics=input.nextInt();
        if ((physics<0)||(physics>100)) {
            System.out.println("invalid number");
        }
        else {
            total += physics;
        }
        System.out.println("Enter your turkish score: ");
        turkish=input.nextInt();
        if ((turkish<0)||(turkish>100)) {
            System.out.println("invalid number");
        }
        else {
            total += turkish;
        }
        System.out.println("Enter your chemistry score: ");
        chemistry=input.nextInt();
        if ((chemistry<0)||(chemistry>100)) {
            System.out.println("invalid number");
        }
        else {
            total += chemistry;
        }
        System.out.println("Enter your music score: ");
        music=input.nextInt();
        if ((music<0)||(music>100)) {
            System.out.println("invalid number");
        }
        else {
            total += music;
        }
        double isPass=total/5;
        System.out.println("your Score " + isPass);

        if (isPass>=55) {
            System.out.println("Congrats you past");
        }
        else {
            System.out.println("Unfortunately you failed");
        }
    }
}