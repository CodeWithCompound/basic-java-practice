import javax.swing.JOptionPane;    
    
public class LabExamVoteEligibility {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name:");
        JOptionPane.showMessageDialog(null, "Hello, " + name + "! Welcome to voting eligibility.");
        /* 
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
        if (age >= 18) {
            JOptionPane.showMessageDialog(null, "You are eligible to vote.");
        } else {
            JOptionPane.showMessageDialog(null, "You are not eligible to vote.");
        }
        */
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
        age = (age < 0) ? 0 : age;
        String eligibility = (age >= 18) ? "eligible to vote." : "not eligible to vote.";
        JOptionPane.showMessageDialog(null, "You are " + eligibility);
    }
    
}
