public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Generic Size", 250.0);
        doAnimalStuff(animal, "fast af");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");
    }
    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _ ");
    }
}