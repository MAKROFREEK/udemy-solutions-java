class PalindromeExample {
    public static void main(String args[]) {
        isPalindrome(1221); // true
        isPalindrome(-1221); // true
        isPalindrome(686); // true
        isPalindrome(212); // true
        isPalindrome(99); // true
        isPalindrome(733); // false
        isPalindrome(478); // false
        isPalindrome(204); // false
        isPalindrome(791); // false
        isPalindrome(165); // false
    }

    public static boolean isPalindrome(int number) {
        int remainder; // declarations
        int sum = 0;
        int temp = number;
        while (number != 0) { // this is checking if number is non 0 or negative
            remainder = number % 10; // this is getting remainder
            sum = (sum * 10) + remainder; // this is increasing decimal place
            number /= 10; // this is reducing the decimal place
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