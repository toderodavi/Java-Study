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
        *  Ternary Operator (condition) ? "result1" : "else"
        *  Casting is when you directly change the type of variable by (type)variable. Ex: (int)number1
        *  Strings also posses METHODS, just like: parse, charAt, toUpperCase, toLowerCase, split, contains
        *  Methods are functions inside Classes (like this one). They are written inside the class but outside
        *  other methods. Generally, their syntax are "public static *return type* *name of the method*",
        *  being void a method that doesn't return something. after the name, there is the (parameters).
        *  Arrays here work quite differently from others. To create an Array, you declare a variable.
        *  On their type, you include [], equalling it to new (type)[*number of array items*]
        *  Other than that, there is also the Collections. Collections can be: Lists, Sets and Maps.
        *  They more or less are ways of making a List of Arrays. Generally speaking, the Array type
        *  Usually uses less memory space. Collections, on other hand, uses way more memory.
        *
        * */
        Scanner scanner = new Scanner(System.in);
        String option;
        double x;
        double y;

        while(true) {
            System.out.println("Choose + or 'add' for addition, - or 'sub' for subtraction, * or 'multi' for multiplication, / or 'div' for division.");
            option = scanner.nextLine();
            System.out.println(option + " selected.");
            System.out.println("Insert the first number:");
            x = scanner.nextDouble();
            System.out.println("Insert the second number:");
            y = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Result: " + calculatorOperation(option, x, y));
            System.out.println("-----------------");
            System.out.println("Type 'yes' if you wish to keep using the calculator.");
            option = scanner.nextLine();
            if(turnCalculatorOff(option)) {
                break;
            }
        }
    }

    public static double calculatorOperation(String option, Double x, Double y) {
        switch (option) {
            case "+", "add" -> {
                return x + y;
            }
            case "-", "sub" -> {
                return x - y;
            }
            case "*", "multi" -> {
                return x * y;
            }
            case "/", "div" -> {
                if (x == 0 || y == 0) {
                    return 0;
                }
                return x / y;
            }
        }
        return 0;
    }
    public static boolean turnCalculatorOff(String option) {
        return !option.equals("yes");
    }
}

