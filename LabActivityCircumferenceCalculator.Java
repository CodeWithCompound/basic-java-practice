import java.util.Scanner;

class LabActivityCircumferenceCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        double circumference = 2 * Ma6th.PI * radius;
        System.out.printf("The circumference of the circle with radius %.2f is %.2f%n", radius, circumference);

        input.close();
    }
}
