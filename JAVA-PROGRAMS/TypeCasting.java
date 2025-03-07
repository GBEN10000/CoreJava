
public class TypeCasting {
	public static void main(String[] args) {
        // ============================
        // 🔹 WIDENING (Implicit Casting) 
        // ============================
        int intValue = 100;
        long longValue = intValue;  // int to long (Automatic)
        float floatValue = longValue;  // long to float (Automatic)
        double doubleValue = floatValue;  // float to double (Automatic)

        System.out.println("Widening Conversions:");
        System.out.println("int to long: " + longValue);
        System.out.println("long to float: " + floatValue);
        System.out.println("float to double: " + doubleValue);
        System.out.println("---------------------------------");

        // ============================
        // 🔹 NARROWING (Explicit Casting)
        // ============================
        double doubleNum = 99.99;
        float floatNum = (float) doubleNum;  // double to float
        long longNum = (long) floatNum;  // float to long (decimal lost)
        int intNum = (int) longNum;  // long to int
        short shortNum = (short) intNum;  // int to short
        byte byteNum = (byte) shortNum;  // short to byte

        System.out.println("Narrowing Conversions:");
        System.out.println("double to float: " + floatNum);
        System.out.println("float to long: " + longNum);
        System.out.println("long to int: " + intNum);
        System.out.println("int to short: " + shortNum);
        System.out.println("short to byte: " + byteNum);
        System.out.println("---------------------------------");

        // ============================
        // 🔹 char to int and vice versa
        // ============================
        char charA = 'A';
        int charToInt = charA;  // char to int (ASCII value)
        char intToChar = (char) (charToInt + 1);  // int to char

        System.out.println("Char Conversions:");
        System.out.println("char to int (ASCII of A): " + charToInt);
        System.out.println("int to char (Next character of A): " + intToChar);
        System.out.println("---------------------------------");

        // ============================
        // 🔹 float to long (Precision loss example)
        // ============================
        float floatNumber = 12345.678f;
        long floatToLong = (long) floatNumber;  // Decimal part lost

        System.out.println("float to long (Precision Loss Example):");
        System.out.println("Original float: " + floatNumber);
        System.out.println("Converted long: " + floatToLong);
        System.out.println("---------------------------------");

        // ============================
        // 🔹 Rounding a float to long
        // ============================
        long roundedLong = Math.round(floatNumber);

        System.out.println("Rounded float to long:");
        System.out.println("Original float: " + floatNumber);
        System.out.println("Rounded long: " + roundedLong);
        System.out.println("---------------------------------");

        // ============================
        // 🔹 Boolean cannot be converted
        // ============================
        // boolean boolValue = true;
        // int boolToInt = (int) boolValue;  // ❌ ERROR: Cannot convert boolean to int

        System.out.println("Boolean Conversions: Not Possible in Java!");
    }
}
