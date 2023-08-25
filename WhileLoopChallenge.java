public class WhileLoopChallenge {

    //Loops through numbers from 5 to 20 and prints the even numbers.

    public static void main(String[] args) {
        int i = 5;
        int iteration = 1;
        int totalEven = 0;
        while (iteration <= 5) {
            if (isEvenNumber(i)) {
                System.out.println(i);
                totalEven += i;
            } //TODO this needs to break once 5 even numbers are found/printed
            iteration++;
            i++;

        System.out.println("The total of even numbers equals: " + totalEven + ".");
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
}
