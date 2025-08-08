package toderodavi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        *  Data Types = int, double, float, boolean, char and String
        *  Always use semicolon on the end of declarations
        *  Output = System.out.println("what you are outputting");
        *  Input = You import "Scanner" and then Scanner scanner = new Scanner(System.in);
        *  Then, use scanner variable to assign the values based on methods. Ex: int input = scanner.nextInt();
        *  You can use the mathematical operators: -, +, *, / and %
        *  There is also a Math global class with various methods (flooring, ceiling, rounding, min, max)
        *  Assignment operators are +=, -=, /=, *=, %=. There is also ++ and --
        *  If statements
        *  Switch statement - switch(variable) case (case):
        *  For loop
        *  While loop
        * */


        /*
        * I need to show the options of the program for the user
        * I need to receive the input (option) of the user
        * receive the two numbers
        * output the result and fallback for the initial options
        * */

        Scanner scanner = new Scanner(System.in);
        double x;
        double y;
        double result;
        boolean calculatorOn = true;
        String option;

        while(calculatorOn) {
            System.out.println("Choose the operation!");
            System.out.println("Type 'addition' for addition");
            System.out.println("Type 'subtraction' for subtraction");
            System.out.println("Type 'multiplication' for multiplication");
            System.out.println("Type 'division' for division");
            System.out.println("Type 'exit' to exit the program");
            option = scanner.nextLine();

            switch(option) {
                case "addition":
                    System.out.println("Addition was selected");
                    System.out.println("Insert the first value:");
                        x = scanner.nextInt();
                    System.out.println("Insert the second value:");
                        y = scanner.nextInt();
                        result = x + y;
                    System.out.println("Result: " + result);
                    System.out.println("------------------");
                    System.out.println("Do you wish to exit the calculator?");
                    System.out.println("Type 'yes' to exit or anything else to continue");
                        scanner.nextLine();
                        option = scanner.nextLine();
                    if (option.equals("yes")) {
                            calculatorOn = false;
                            break;
                        }
                    break;

                case "subtraction":
                    System.out.println("Subtraction was selected");
                    System.out.println("Insert the first value:");
                    x = scanner.nextInt();
                    System.out.println("Insert the second value:");
                    y = scanner.nextInt();
                    result = x - y;
                    System.out.println("Result: " + result);
                    System.out.println("------------------");
                    System.out.println("Do you wish to exit the calculator?");
                    System.out.println("Type 'yes' to exit or anything else to continue");
                    scanner.nextLine();
                    option = scanner.nextLine();
                    if (option.equals("yes")) {
                        calculatorOn = false;
                        break;
                    }
                    break;

                case "multiplication":
                    System.out.println("Multiplication was selected");
                    System.out.println("Insert the first value:");
                    x = scanner.nextInt();
                    System.out.println("Insert the second value:");
                    y = scanner.nextInt();
                    result = x * y;
                    System.out.println("Result: " + result);
                    System.out.println("------------------");
                    System.out.println("Do you wish to exit the calculator?");
                    System.out.println("Type 'yes' to exit or anything else to continue");
                    scanner.nextLine();
                    option = scanner.nextLine();
                    if (option.equals("yes")) {
                        calculatorOn = false;
                        break;
                    }
                    break;

                case "division":
                    System.out.println("Division was selected");
                    System.out.println("Insert the first value:");
                    x = scanner.nextInt();
                    System.out.println("Insert the second value:");
                    y = scanner.nextInt();
                    result = x / y;
                    System.out.println("Result: " + result);
                    System.out.println("------------------");
                    System.out.println("Do you wish to exit the calculator?");
                    System.out.println("Type 'yes' to exit or anything else to continue");
                    scanner.nextLine();
                    option = scanner.nextLine();
                    if (option.equals("yes")) {
                        calculatorOn = false;
                        break;
                    }
                    break;

                case "exit":
                    calculatorOn = false;
                    break;

                default:
                    System.out.println("No option was selected.");
                    break;
            }
        }
    }
}