public class SumOddRange {

    public static void main(String[] args) {
        // Problematic Test Cases
        System.out.println(sumOdd(-1, 100)); // -1 if negative 2500 if positive
        System.out.println(sumOdd(100, 1000)); // 247500
        System.out.println(sumOdd(10, 10)); // 0
        System.out.println(sumOdd(13, 13)); // 13
        System.out.println(sumOdd(1, -5)); // -1
    }

    public static boolean isOdd(int number) {
        if (number < 0 && number % 2 == 0) {
            return false;
        } return true;
    }

    // this method does not care for negatives but needs to1
    public static int sumOdd(int start, int end) {
    int sum = 0;
    if (start > end || start < 0) {
        return -1;
    }
    for (int i = start; i < end; i++) {
        if (isOdd(i)) {
                return sum += i;
            }
        } return sum;
    }
}