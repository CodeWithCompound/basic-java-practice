import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.println("You are " + age + " years old.");

        System.out.print("Enter your height in meters (e.g., 1.75): ");
        double height = input.nextDouble();
        System.out.println("Your height is " + height + " meters.");

        input.close();
    }
}
