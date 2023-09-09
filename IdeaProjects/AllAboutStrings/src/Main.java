public class Main {
    public static void main(String[] args) {
        printInformation("Hello Ladies & Germs");
    }
    public static void printInformation(String string) {
        int length = string.length();
        System.out.printf("Length = %d \n", length);
        if (string.isEmpty()) {
            System.out.println("Empty string");
        } else {
            System.out.printf("First char = " + string.charAt(0));
        }
        System.out.printf("Last char = " + string.charAt(length - 1));
        }

    }
