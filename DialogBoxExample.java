import javax.swing.JOptionPane;

public class DialogBoxExample {
    public static void main(String[] args) {
        // Prompt for name
        String name = JOptionPane.showInputDialog("Enter your name:");
        JOptionPane.showMessageDialog(null, "Hello, " + name + "!");

        // Prompt for age
        String ageStr = JOptionPane.showInputDialog("Enter your age:");
        int age = Integer.parseInt(ageStr);
        JOptionPane.showMessageDialog(null, "You are " + age + " years old.");

        // Prompt for height
        String heightStr = JOptionPane.showInputDialog("Enter your height in meters (e.g., 1.75):");
        double height = Double.parseDouble(heightStr);
        JOptionPane.showMessageDialog(null, "Your height is " + height + " meters.");
    }
}
