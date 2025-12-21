import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String name = input.readLine();
        System.out.println("Hello, " + name + "!");

        System.out.print("Enter your age: ");
        String ageStr = input.readLine();
        int age = Integer.parseInt(ageStr);
        System.out.println("You are " + age + " years old.");

        input.close();
    }
}
