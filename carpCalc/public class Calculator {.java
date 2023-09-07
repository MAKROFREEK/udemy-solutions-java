public class Calculator {

    private Floor floor;
    private Carpet carpet;

    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }

}