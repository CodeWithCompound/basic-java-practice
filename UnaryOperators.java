public class UnaryOperators {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Demonstrating unary operators
        System.out.println("Original value of a: " + a); // 5
        System.out.println("Original value of b: " + b); // 10

        // Unary plus
        int unaryPlus = +a;
        System.out.println("Unary plus of a: " + unaryPlus); // 5

        // Unary minus
        int unaryMinus = -a;
        System.out.println("Unary minus of a: " + unaryMinus); // -5

        // Increment operator (prefix)
        int prefixIncrement = ++a; // a becomes 6
        System.out.println("Prefix increment of a: " + prefixIncrement); // 6

        // Increment operator (postfix)
        int postfixIncrement = b++; // b becomes 11 after this line
        System.out.println("Postfix increment of b: " + postfixIncrement); // 10
        System.out.println("Value of b after postfix increment: " + b); // 11

        // Decrement operator (prefix)
        int prefixDecrement = --b; // b becomes 10
        System.out.println("Prefix decrement of b: " + prefixDecrement); // 10

        // Decrement operator (postfix)
        int postfixDecrement = a--; // a becomes 5 after this line
        System.out.println("Postfix decrement of a: " + postfixDecrement); // 6
        System.out.println("Value of a after postfix decrement: " + a); // 5

    }
}