public class Test {
    
    public static void main(String[] args) {

        System.out.println(daysInMonth(-1, 2016));
        System.out.println(daysInMonth(12, 8487));
        System.out.println(daysInMonth(6, 2688));
        System.out.println(daysInMonth(12, 1200));
        System.out.println(daysInMonth(9, 876));
        System.out.println(daysInMonth(2, 7683));
        System.out.println(daysInMonth(7, 3523));
        System.out.println(daysInMonth(1, 2986));
        System.out.println(daysInMonth(4, 9408));
        System.out.println(daysInMonth(13, 3827));

    }


    public static boolean isLeapYear(int year) {
        if (year <= 0 || year >= 9999) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //TODO
    // make this work
    public static int daysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        } else if (year < 1 || year > 9999) {
            return -1;
        } else if (month == 2 && isLeapYear(year)) {
            return 29;
        } else if (isLeapYear(year) == false && month == 2) {
            return 28;
        } else if (isLeapYear(year) == true && month == 1) {
            return 31;
        } else if (isLeapYear(year) == true && month == 2) {
            return 28;
        } else if (isLeapYear(year) == true && month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }
}