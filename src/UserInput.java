import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Enter first Number : ");
        int num1 = e.nextInt();
        System.out.println("Enter second number : ");
         int num2 = e.nextInt();

        System.out.println("---------------------------");
        System.out.println(num1+num2);

    }
}
