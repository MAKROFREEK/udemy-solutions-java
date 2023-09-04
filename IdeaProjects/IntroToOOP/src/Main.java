package IdeaProjects.IntroToOOP.src;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Maseratti");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("Black");

        // car.describeCar("Honda", "Civic", "Red", 4, true);
        // car.describeCar("Toyota", "Tundra", "Gray", 2, false);

        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(true);
        targa.setColor("Black");
    }
}