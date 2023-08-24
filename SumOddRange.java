public class SumOddRange {

    public static void main(String[] args) {
        System.out.println(sumOdd(1,100));
    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        } else if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
    //this method does not care for negatives but needs to
    public static int sumOdd(int start, int end) {
        int sum = 0;
        for (int i = 0; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            } else if (isOdd(i) == false) {
                return -1;
            }

        }
        return sum;
    }
}