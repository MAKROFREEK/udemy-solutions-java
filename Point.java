public class Point {

    private int x;
    private int y;

    // no args constructor
    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return distance(0, 0);
    }

    public double distance(int x, int y) {
        int xdiff = x - this.x;
        int ydiff = y - this.y;
        return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
    }

    public double distance(Point point) {
        double deltaX = point.x - this.x;
        double deltaY = point.y - this.y;
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

}
