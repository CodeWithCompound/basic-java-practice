public class OperatorPrecedence {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 5;

        // Demonstrating operator precedence
        int result = a + b * c; // Multiplication has higher precedence than addition
        System.out.println("Result of a + b * c: " + result); // 10 + (20 * 5) = 110

        result = (a + b) * c; // Parentheses change the order of evaluation
        System.out.println("Result of (a + b) * c: " + result); // (10 + 20) * 5 = 150

        result = a + b / c; // Division has higher precedence than addition
        System.out.println("Result of a + b / c: " + result); // 10 + (20 / 5) = 14

        result = (a + b) / c; // Parentheses change the order of evaluation
        System.out.println("Result of (a + b) / c: " + result); // (10 + 20) / 5 = 6
    }
}
