public class Main {
    public static void main(String[] args) {


        String string = "Hello " + "Ladies and Germs,";
        StringBuilder builder = new StringBuilder("Hello " + "Ladies and Germs,");
        string.concat(" and Goodbye!");
        builder.append(" and Goodbye!");


        StringBuilder builder2 = new StringBuilder();
        builder2.append("a".repeat(17));
        StringBuilder builder3 = new StringBuilder(32);
        builder3.append("a".repeat(17));


        builder.reverse();
        printInformation(string);
        printInformation(builder);

//        StringBuilder builderPlus = new StringBuilder(32);
////        builderPlus.append("a".repeat(17));
//        builderPlus.deleteCharAt(16).insert(16, "g");
//        System.out.println(builderPlus);
//        builderPlus.replace(16, 17, "g");
//        System.out.println(builderPlus);


        builder.reverse().setLength(3);
    }

    public static void printInformation(String string) {
        System.out.println("String  " + string);
        System.out.println("Length  " + string.length());

    }
    public static void printInformation(StringBuilder builder) {
        System.out.println("String  " + builder);
        System.out.println("Length  " + builder.length());
        System.out.println("capacity = " + builder.capacity());

    }


}