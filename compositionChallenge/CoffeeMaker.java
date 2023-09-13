package compositionChallenge;

public class CoffeeMaker {

    private boolean hasWorkdToDo;

    public void setHasWorkdToDo(boolean hasWorkdToDo) {
        this.hasWorkdToDo = hasWorkdToDo;
    }

    public void brewCoffee() {
        if (hasWorkdToDo) {
            System.out.println("Brewing coffee");
        }
    }

}
