public class Main {
    public static void main(String[] args) {
        String bulletIt = "Print a Bulleted List: " +
                "\n\u2022 Item 1 " +
                "\n\u2022 Item 2 " +
                "\n\u2022 Item 3 " +
                "\n";
        System.out.println(bulletIt);

        String textBlock = """
                Print a Bulleted List:
                \u2022 Item 1
                \u2022 Item 2
                \u2022 Item 3
                """;
        System.out.println(textBlock);

        int age = 27;
        System.out.printf("You age is %d\n", age);
        int yearOfBirth = 2023 - age;
//        System.out.printf("Age = %d, Year of Birth = %.2%f%n", (float) age, yearOfBirth);
        System.out.printf("Age = %d,\nYear of Birth = %d%n", age, yearOfBirth);

        for (int i = 0; i <= 10000; i += 10) {
            System.out.printf("Printing %6d digits of %d%n", i, 10000);
        }
        String formattedString = String.format("Printed  %6d digits of %d%n", 10000, 10000);
        System.out.println(formattedString);

    }
}