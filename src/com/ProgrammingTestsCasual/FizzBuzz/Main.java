package com.ProgrammingTestsCasual.FizzBuzz;

// Write a program that prints the numbers from 1 to 100.
// But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz".
// For numbers which are multiples of both three and five print "FizzBuzz".

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println("\n\nFizzBuzz1:\n\n");

        FizzBuzz1();

        System.out.println("\n\nFizzBuzz2:\n\n");

        FizzBuzz2();

        System.out.println("\n\nFizzBuzz3:\n\n");

        FizzBuzz3();
    }

    public static void FizzBuzz1() {

        boolean isMultipleOfThree = false;
        boolean isMultipleOfFive = false;
        String printVal = "";
        // Count from 1 to 100
        for (int i = 1; i <= 100; ++i) {
            if (i % 3 == 0) {
                isMultipleOfThree = true;
                printVal += "Fizz";
            }
            if (i % 5 == 0) {
                isMultipleOfFive = true;
                printVal += "Buzz";
            }

            if(printVal.equals("")) {
                System.out.println(i);
            } else {
                System.out.println(printVal);
            }
            printVal = "";
        }
    }

    // Version 2: removed unnecessary booleans; cleaner ternary assignment of strings
    public static void FizzBuzz2() {

        String printVal = "";
        // Count from 1 to 100
        for (int i = 1; i <= 100; ++i) {
            if (i % 3 == 0) {
                printVal += "Fizz";
            }
            if (i % 5 == 0) {
                printVal += "Buzz";
            }

            printVal = printVal.equals("") ? Integer.toString(i) : printVal;
            System.out.println(printVal);
            printVal = "";
        }
    }

    // Version 3: added defensive equals (constant first negates the risk of accidental assignment)
    public static void FizzBuzz3() {

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
