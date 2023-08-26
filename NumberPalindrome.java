public class NumberPalindrome {
    public static void main(String[] args) {
        isPalindrome(76);
        isPalindrome(57);
        isPalindrome(-66);
        isPalindrome(-99);
    }

    // This code snippet checks if a given number is a palindrome.
    // It reverses the number and compares it to the original number to determine if
    // they are the same.
    // If they are the same, it prints "palindrome number" and returns true,
    // otherwise it prints "not palindrome" and returns false.
    public static boolean isPalindrome(int number) {
        int remainder;
        int sum = 0;
        int temp = number;
        while (number != 0) {
            remainder = number % 10;
            sum = (sum * 10) + remainder;
            number /= 10;
        }
        if (temp == sum) {
            System.out.println("palindrome number ");
            return true;
        } else {
            System.out.println("not palindrome");
            return false;
        }
    }
}