package org.example.PalindromeNumber;

public class PalindromeNumber {
    public static int reverseNumber(int number){
        int reverseNumber = 0;
        int temp = number;
        int remainder = 0;

        while (temp > 0){
            remainder = (temp % 10);
            reverseNumber = reverseNumber * 10 + remainder;
            temp /= 10;
        }

        return reverseNumber;
    }

    public static boolean isPalindromeNumber(int number){
        return reverseNumber(number) == number;
    }
    public static int potence(int number, int exponent){
        int result = 1;

        for (int counter = 0; counter < exponent; counter++) {
            result *= number;
        }

        return result;
    }
    public static int potenceMinusOne(int number, int exponent){
        return potence(number, exponent) - 1;
    }

    public static boolean isANumber(String arg) {
        boolean isANumber = true;
        try {
            Integer.parseInt(arg);
        }catch (Exception e){
            isANumber = false;
        }
        return isANumber;
    }
}
