import java.util.Scanner;

public class CodingTest {
    public static void main(String[] args) {

        // Write a program to check whether a given number is even or odd

        int a = 33;

        if (a % 2 == 0) {
            // System.out.println("Even");
        } else {
            // System.out.println("Odd");
        }

        // Write a program to print numbers from 1 to 10 using a for loop.

        // for (int i = 1; i <= 10; i++) {
        // // System.out.println(i);
        // }

        // Write a program to find the largest among three numbers.

        Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter first number : ");
        // int x = scanner.nextInt();
        // System.out.println("Enter first second : ");
        // int y = scanner.nextInt();
        // System.out.println("Enter first third : ");
        // int z = scanner.nextInt();

        // System.out.println("---------------------------------");

        // if (x > y && x > z) {
        // System.out.println(x);
        // } else if (y > x && y > z) {
        // System.out.println(y);
        // } else {
        // System.out.println(z);
        // }

        // Write a program to reverse a string.

        // System.out.println("Enter : ");
        // String name=scanner.nextLine();
        // String reversed="";

        // for(int i=name.length()-1;i>=0;i--){
        // reversed+=name.charAt(i);
        // }
        // System.out.println("-----------"+reversed);

        // Simple Calculator (Addition, Subtraction, Multiplication, Division)
        // Write a program to take two numbers and an operator (+, -, *, /) and perform
        // the calculation.

        System.out.println(" Enter first number");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number");
        double num2 = scanner.nextDouble();
        System.out.println("Enter operator");
        char operator = scanner.next().charAt(0);
        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            case '*':
                result = num1 * num2;
                break;

            default:
                break;
        }
        System.out.println("---------" + result);

    }
}
