import java.util.Scanner;

public class LabActivitySwapTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

        // Swapping logic
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
        input.close();
        
    }
}
