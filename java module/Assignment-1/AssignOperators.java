/*12. Write a program to demonstrate the use of assignment 
operators (=, +=, -=, *=, /=, %=) on two integers. in java*/

import java.util.Scanner;

public class AssignOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int result = num1; 
        System.out.println("Initial result = " + result);

        result += num2;
        System.out.println("After += : " + result);

        result -= num2;
        System.out.println("After -= : " + result);

        result *= num2;
        System.out.println("After *= : " + result);

        if (num2 != 0) {
            result /= num2;
            System.out.println("After /= : " + result);

            result %= num2;
            System.out.println("After %= : " + result);
        } else {
            System.out.println("Division and Modulus operations are not possible with zero.");
        }

        
    }
}