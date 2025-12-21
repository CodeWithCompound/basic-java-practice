public class WrapperParsingExample {
    public static void main(String[] args) {
        // Parsing a String to an Integer
        String intString = "123";
        int parsedInt = Integer.parseInt(intString);
        System.out.println("Parsed Integer: " + parsedInt);

        // Parsing a String to a Double
        String doubleString = "45.67";
        double parsedDouble = Double.parseDouble(doubleString);
        System.out.println("Parsed Double: " + parsedDouble);

        // Parsing a String to a Boolean
        String booleanString = "true";
        boolean parsedBoolean = Boolean.parseBoolean(booleanString);
        System.out.println("Parsed Boolean: " + parsedBoolean);

        // Parsing a String to a Long
        String longString = "123456789";
        long parsedLong = Long.parseLong(longString);
        System.out.println("Parsed Long: " + parsedLong);

        // Parsing a String to a Float
        String floatString = "12.34";
        float parsedFloat = Float.parseFloat(floatString);
        System.out.println("Parsed Float: " + parsedFloat);

        // Parsing a String to a Short
        String shortString = "12345";
        short parsedShort = Short.parseShort(shortString);
        System.out.println("Parsed Short: " + parsedShort);

        // Parsing a String to a Byte
        String byteString = "127";
        byte parsedByte = Byte.parseByte(byteString);
        System.out.println("Parsed Byte: " + parsedByte);

        // Parsing a String to a Character
        String charString = "A";
        char parsedChar = charString.charAt(0);
        System.out.println("Parsed Character: " + parsedChar);
    }
}
