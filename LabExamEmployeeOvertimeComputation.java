import java.util.Scanner;

public class LabExamEmployeeOvertimeComputation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter total hours worked in a week: ");
        int hoursWorked = scanner.nextInt();
        
        System.out.print("Rate per hour:");
        double ratePerHour = scanner.nextDouble();
        
        double totalPay;

        if (hoursWorked < 40) {
            totalPay = hoursWorked * ratePerHour;
        } else {
            int overtimeHours = hoursWorked - 40;
            totalPay = (40 * ratePerHour) + (overtimeHours * ratePerHour * 1.5);
        }

        System.out.printf("Total pay for the week: $%.2f%n", totalPay);
        
        scanner.close();
    }
}