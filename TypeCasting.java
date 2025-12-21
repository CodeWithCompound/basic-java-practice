public class TypeCasting {
    public static void main(String[] args) {
        // Implicit casting (widening)
        int intNum = 100;
        double doubleNum = intNum; // int to double
        System.out.println("Implicit Casting (int to double): " + doubleNum);

        // Explicit casting (narrowing)
        double anotherDoubleNum = 9.78;
        int anotherIntNum = (int) anotherDoubleNum; // double to int
        System.out.println("Explicit Casting (double to int): " + anotherIntNum);
    }
}
