public class Rectangle {
    private double length;
    private double width;

    // CONSTRUCTOR WITH PARMS W AND L AS ARGUMENTS
    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        if (length < 0) {
            return 0;
        } else {
            return length;
        }
    }

    public double getWidth() {
        if (width < 0) {
            return 0;
        } else {
            return width;
        }
    }

    public double getArea() {
        if (length < 0 || width < 0) {
            return 0;
        } else {
            return length * width;
        }
    }
}
