public class TernaryOperator {
    public static void main(String[] args) {
        int num = 10;

        // Using the ternary operator
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is " + result);

        num = 15;
        result = (num > 10) ? "Greater than 10" : "10 or less";
        System.out.println(num + " is " + result);
    }  
}
