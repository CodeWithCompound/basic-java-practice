import java.util.Scanner;   

public class ValidEmailCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an email address: ");
        String email = sc.nextLine();
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        if (email.matches(emailRegex)) {
            System.out.println(email + " is a valid email address.");
        } else if (email.contains(".com") == false) {
            System.out.println(email + " is not a valid email address.");
        } else {
            System.out.println(email + " is not a valid email address.");
        }
        sc.close();
    }
}
