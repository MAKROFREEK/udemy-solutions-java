import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        minAndMax(1, 2);
    }

    public static void minAndMax(int n, int n2) {

        // var decs
        int counter = 1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Scanner scanner = new Scanner(System.in);

        while (counter <= n2) {

            System.out.print("Enter number " + counter + ": ");
            String nextnumber = scanner.nextLine();
            try {
                int number = Integer.parseInt(nextnumber);
                min = Math.min(number, min);
                max = Math.max(number, max);
                counter++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid Value");
            }
        }
        // some formatting
        System.out.println("");
        System.out.println("Your min and max values are: ");
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
        // scanner.close();// close scanner
    }
}