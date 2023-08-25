public class DigitSum {
    
    public static void main(String[] args) {
        sumDigits(1234);
        System.out.println("");
        sumDigits(5678);
        System.out.println("");
        sumDigits(3939);
    }

    public static int sumDigits(int number) {
        int numba = number;
        for (int i = 0; i < 4; i++) {
            System.out.println(numba % 10);
            numba /= 10;
        } return numba;
    }
}
