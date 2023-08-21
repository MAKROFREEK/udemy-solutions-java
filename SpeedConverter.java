public class SpeedConverter {

  // double abc = toMilesPerHour(100);

  public static double toMilesPerHour(double kilometersPerHour) {

      double calc = kilometersPerHour * 1.60934;
      long rounded = Math.round(calc);

      if (kilometersPerHour < 0) {
          // do nothing
      } return rounded;
  }


  public static void printConversion (double kilometersPerHour) {

      if (kilometersPerHour < 0) {
          System.out.println("Invalid Value");
      } else {
          System.out.println(kilometersPerHour + "km/h == " + toMilesPerHour(kilometersPerHour) + "mi/h.");
      }
  }
}