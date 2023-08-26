public class FirstLastDigitSum {

    public static void main(String[] args) {
        sumFirstAndLastDigit(123);
        sumFirstAndLastDigit(364);
        sumFirstAndLastDigit(825);
        sumFirstAndLastDigit(581);
        sumFirstAndLastDigit(-110100);
        sumFirstAndLastDigit(-1319);
        sumFirstAndLastDigit(-1681);
        sumFirstAndLastDigit(851);
        sumFirstAndLastDigit(172);
        sumFirstAndLastDigit(999);
        sumFirstAndLastDigit(337);
        sumFirstAndLastDigit(4106);
        sumFirstAndLastDigit(228);
        sumFirstAndLastDigit(491);
    }

    public static int sumFirstAndLastDigit(int number) {
        int firstDigit = 0;
        int lastDigit = number % 10;

        while (number != 0) {
            if (number < 0) {
                System.out.println("-1");
                return -1;
            } else {
                firstDigit = number % 10;
                number /= 10;
            }
        }

        int sum = firstDigit + lastDigit;
        System.out.println(sum);
        return sum;
    }
}
