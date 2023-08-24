public class SumOddRange {
 
    public static boolean isOdd(int number) {
        if (number !< 0) {
            return false;
        } else if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int summOdd(int start, int end) {
        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}