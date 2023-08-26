public class DigitSum {

    // This code calls the sumDigits function three times with different numbers as
    // arguments,
    // and then prints a space in the output after each function call.
    public static void main(String[] args) {
        sumDigits(1234);
        System.out.println(""); // adds a space in the output
        sumDigits(5678);
        System.out.println(""); // adds a space in the output
        sumDigits(3939);
    }

    // This code calculates the sum of the individual digits in a given number.
    // It iteratively divides the number by 10 and prints the remainder (the last
    // digit) at each step. Finally,
    // it returns the remaining quotient (the first digit).
    public static int sumDigits(int number) {
        int numba = number;
        if (number < 0) {
            return -1;
        } else {
            int count = 0;
            for (int i = 0; i < 4; i++) {
                int digit = numba % 10;
                System.out.println(numba % 10);
                numba /= 10;
                count += digit;
            }
            System.out.println(count);
            return numba;
        }
    }
}
