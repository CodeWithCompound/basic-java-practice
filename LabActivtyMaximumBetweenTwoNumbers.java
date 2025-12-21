import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LabActivtyMaximumBetweenTwoNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the first number: ");
        int num1 = Integer.parseInt(input.readLine());
        System.out.print("Enter the second number: ");
        int num2 = Integer.parseInt(input.readLine());

        int max = (num1 > num2) ? num1 : num2;
        System.out.println("The maximum between " + num1 + " and " + num2 + " is: " + max);

        input.close();
    }
}
