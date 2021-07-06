package main.java;


import org.testng.annotations.Test;

public class ReverseBitRepresentationOfNumber extends ReverseString {

    @Test
    public static void reverseBitRepresentation() {
        int number = 2021;
        int radix = 2;
        System.out.println("number = " + number);
        String bitRepresentation = Integer.toUnsignedString(number, radix);
        System.out.println("BitRepresentation of " + number + " = " + bitRepresentation);
        reverse(bitRepresentation);
    }
}
