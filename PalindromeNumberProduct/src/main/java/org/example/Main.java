package org.example;

import org.example.PalindromeNumber.PalindromeNumber;

public class Main {
    public static void main(String[] args) {
        try {
            int numberDigits = 0;

            if (args.length != 1) {
                throw new Exception("Only can has got 1 parameter.");
            } else if (!PalindromeNumber.isANumber(args[0])) {
                throw new Exception("The parameter "+ args[0] +" is not a number valid.");
            }
            else {
                numberDigits = Integer.parseInt(args[0]);
            }

            int topNumber = PalindromeNumber.potenceMinusOne(10, numberDigits);
            int minNumber = PalindromeNumber.potence(10, numberDigits - 1);

            boolean stop = false;

            int result = 0;

            for (int counter = topNumber; counter >= minNumber && !stop; counter--) {

                for (int counter2 = topNumber; counter2 >= minNumber && !stop; counter2--) {
                    result = counter2 * counter;
                    stop = PalindromeNumber.isPalindromeNumber(result);

                    if (stop) {
                        System.out.println("Result: " + counter + " * " + counter2 + " = " + result);
                    }

                }

            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}