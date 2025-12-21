public class CompoundAssignment {
    public static void main(String[] args) {
        int num = 10;

        // Using compound assignment operators
        num += 5; // Equivalent to num = num + 5;
        System.out.println("After += : " + num);

        num -= 3; // Equivalent to num = num - 3;
        System.out.println("After -= : " + num);

        num *= 2; // Equivalent to num = num * 2;
        System.out.println("After *= : " + num);

        num /= 4; // Equivalent to num = num / 4;
        System.out.println("After /= : " + num);

        num %= 3; // Equivalent to num = num % 3;
        System.out.println("After %= : " + num);
    }
}
