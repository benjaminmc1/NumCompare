import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double firstNum = in.nextDouble();

        System.out.println("Enter the second number: ");
        double secondNum = in.nextDouble();

        if (in.hasNextDouble()) {
            if (firstNum == secondNum) {
                System.out.println("These two numbers are equal.");
            } else if (firstNum > secondNum) {
                System.out.println("The first number is greater than the second number.");
            } else if (firstNum < secondNum) {
                System.out.println("The second number is greater than the first number.");
            } else {
                System.out.println("Invalid entry. Please try again.");
            }
        }
    }
}