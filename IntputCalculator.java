import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {

    }

    public static void inputThenPrintSumAndAverage(int n) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 1;
        while (counter <= n) {
            System.out.print("Enter number " + counter + ": ");
            String nextNumber = scanner.nextLine();
            try {
                int number = Integer.parseInt(nextNumber);
                sum = sum + number;
                counter++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid Number");
            }
        }
        System.out.println("The sum of the numbers is: " + sum);
    }

}
