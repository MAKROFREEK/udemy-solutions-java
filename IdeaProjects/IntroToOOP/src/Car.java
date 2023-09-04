package IdeaProjects.IntroToOOP.src;

public class Car {
    private String make = "Tesla";
    private String model = "Model S";
    private String color = "Black";
    private int doors = 2;
    private boolean convertible = false;

    // getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    // setters// setters // setters //setters //
    public void setMake(String make) {
        if (make == null)
            make = "Unknown ";
        {
            String lowercaseMake = make.toLowerCase();
            switch (lowercaseMake) {
                case "holden", "porchse", "tesla" -> this.make = make;
                default -> this.make = "Unsupported Make ";
            }
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void describeCar(String make, String model, String color, int doors, boolean convertible) {

        System.out.println(doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : "Not Convertible"));
    }
}
