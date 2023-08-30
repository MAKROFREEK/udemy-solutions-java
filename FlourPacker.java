public class FlourPacker {

    public static void main(String[] args) {
        // System.out.println(canPack(1, 0, 5));
        // System.out.println(canPack(0, 5, 5));
        System.out.println(canPack(2, 2, 12)); // true
        System.out.println(canPack(5, 3, 24)); // false
        System.out.println(canPack(1, 0, 4));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int totalKilos = (bigCount * 5) + smallCount;
        int bigBag = bigCount * 5;

        if (bigBag >= goal) {
            return (goal % 5 == 0);
        }
        if (totalKilos > goal) {
            return true;
        }
        if (totalKilos % 5 == 0) {
            return true;
        }

        return false;
    }
}
