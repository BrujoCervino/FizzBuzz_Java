package com.ProgrammingTestsCasual.FizzBuzz;

// Write a program that prints the numbers from 1 to 100.
// But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz".
// For numbers which are multiples of both three and five print "FizzBuzz".

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println("FizzBuzz:\n\n");

        FizzBuzz();

    }

    // Version 3: added defensive equals (constant first negates the risk of accidental assignment)
    public static void FizzBuzz() {

        String printVal = "";
        // Count from 1 to 100
        for (int i = 1; i <= 100; ++i) {
            if (0 == i % 3) {
                printVal += "Fizz";
            }
            if (0 == i % 5) {
                printVal += "Buzz";
            }

            printVal = printVal.equals("") ? Integer.toString(i) : printVal;
            System.out.println(printVal);
            printVal = "";
        }
    }

}
