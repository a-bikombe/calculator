package Calculator;

import java.util.*;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2;    // initializing numbers being calculated
        String operation, answer;
        
        do {    // loop
            System.out.print("Enter your first number: ");
            number1 = input.nextInt();    // reads integer
      
            System.out.print("Enter an operation +, -, *, or /: ");
            operation = input.next();    // reads operation

            System.out.print("Enter the second number: ");
            number2 = input.nextInt();    // reads integer

            switch (operation) {
                case "+":
                    System.out.println(number1 + number2);    // addition
                    break;
                case "-":
                    System.out.println(number1 - number2);    // subtraction
                    break;
                case "*":
                    System.out.println(number1 * number2);    // multiplication
                    break;
                case "/":
                    System.out.println(number1 / number2);    // division
                    break;
                default:
                    System.out.println("Error: unsupported operation");    // if user inputs any other operation
            }
            System.out.print("Are you done yet? (Y/N)");
            answer = input.next();
        } while (!answer.equalsIgnoreCase("Y"));    // checks if user wants loop to end
    }
}