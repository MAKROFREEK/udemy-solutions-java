public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int n) {
        int largestPrime = 2;
        if (n < 2) {
            return largestPrime = -1;
        }
        for (int i = 2; i <= n; i++) {

            if (n % i == 0) {
                largestPrime = i;
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        return largestPrime;
    }
}
