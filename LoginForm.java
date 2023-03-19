import java.util.Scanner;

public class LoginForm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String loginID, password;

        System.out.println("Please enter your login ID: ");
        loginID = input.nextLine();

        System.out.println("Please enter your password: ");
        password = input.nextLine();

        if (loginID.equals("validID") && password.equals("validPassword")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid login credentials. Please try again.");
        }
    }
}
