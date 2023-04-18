import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String userName, password, reset, newPassword;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Usarname: ");
        userName = input.nextLine();
        System.out.println("Enter Your Password: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123") ) {
            System.out.println("Successful login");
        } else {
            System.out.println("Wrong, Do you want to reset your password?");
            reset = input.nextLine();
            if (reset.equals("yes")) {
                System.out.println("write your new password");
                newPassword = input.nextLine();
                if (newPassword.equals("java123")) {
                    System.out.println("It can not be the same password with your old password");
                } else {
                    System.out.println("New Password is Created");
                }

            } else if (reset.equals("no")){
                System.out.println("Okay, goodbye");

            } else {
                System.out.println("I could not understand");
            }
        }


    }
}