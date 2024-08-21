package ControlStructures;

public class BinaryDecimal {

    public static void main(String[] args) {

        long binaryNumber = 110110111L;

        int decimalNumber = convertBinaryToDecimal(binaryNumber);
        System.out.println("Binary to Decimal");
        System.out.println(binaryNumber + " = " + decimalNumber);

        int decimal = 19;

        long binary = convertDecimalToBinary(decimal);
        System.out.println("Decimal to Binary");
        System.out.println(decimal + " = " + binary);
    }

    public static int convertBinaryToDecimal(long binary) {
        int decimalNumber = 0, i = 0;
        long remainder;

        while (binary != 0) {
            remainder = binary % 10;
            binary /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }
        return decimalNumber;
    }

    public static long convertDecimalToBinary(int decimal) {
        long binaryNumber = 0;
        int remainder, i = 1;

        while (decimal != 0) {
            remainder = decimal % 2;
            decimal /= 2;
            binaryNumber += remainder * i;
            i *= 10;
        }
        return binaryNumber;
    }
}
