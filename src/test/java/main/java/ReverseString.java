package main.java;

import org.testng.annotations.Test;

public class ReverseString {

    @Test
    public static void reverseString() {
        String target = "This course is awesome!";
        reverse(target);
    }

    public static void reverse(String target) {
        System.out.println(target);
        StringBuilder result = new StringBuilder();
        int targetLength = target.length();
        for (int i = 0; i < target.length(); i++) {
            result.append(target.charAt(targetLength - i - 1));
        }
        System.out.println(result);
    }
}

