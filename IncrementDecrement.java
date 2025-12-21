public class IncrementDecrement {
    public static void main(String[] args) {
        int num = 5;

        // Increment
        num++; // Equivalent to num = num + 1;
        System.out.println("After Increment: " + num);

        // Decrement
        num--; // Equivalent to num = num - 1;
        System.out.println("After Decrement: " + num);
    
        // Pre-increment
        int preIncrement = ++num; // Increment first, then assign
        System.out.println("Pre-Increment: " + preIncrement);
        System.out.println("Value of num after Pre-Increment: " + num);

        // Post-increment
        int postIncrement = num++; // Assign first, then increment
        System.out.println("Post-Increment: " + postIncrement);
        System.out.println("Value of num after Post-Increment: " + num);

        // Pre-decrement
        int preDecrement = --num; // Decrement first, then assign
        System.out.println("Pre-Decrement: " + preDecrement);
        System.out.println("Value of num after Pre-Decrement: " + num);

        // Post-decrement
        int postDecrement = num--; // Assign first, then decrement
        System.out.println("Post-Decrement: " + postDecrement);
        System.out.println("Value of num after Post-Decrement: " + num);
        
    }
}
