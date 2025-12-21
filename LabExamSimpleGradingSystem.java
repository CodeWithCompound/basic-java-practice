import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LabExamSimpleGradingSystem {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter your score (0-100): ");
        int score = Integer.parseInt(reader.readLine());
        
        String grade;
        if (score >= 90 && score <= 100) {
            grade = "Excellent";
        } else if (score >= 80 && score < 90) {
            grade = "Very Good";
        } else if (score >= 70 && score < 80) {
            grade = "Good";
        } else if (score >= 60 && score < 70) {
            grade = "Needs Improvement";
        } else if (score >= 0 && score < 60) {
            grade = "Failed";
        } else {
            grade = "Invalid score. Please enter a score between 0 and 100.";
        }
        
        System.out.println("Your grade is: " + grade);
        
    }    
}
