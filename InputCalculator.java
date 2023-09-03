import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage(5);
    }

    public static void inputThenPrintSumAndAverage(int n) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 1;
        while (counter <= n) {
            try {
                counter++;
                System.out.print("Enter number " + counter + ": ");
                String nextNumber = scanner.nextLine();
                int number = Integer.parseInt(nextNumber);
                sum = sum + number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid Number");
            }
        }
        System.out.println("");
        System.out.println("SUM = " + sum + " AVG = " + sum / n);
    }
}
