package compositionChallenge;

public class Refrigerator {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void getIce() {
        if (hasWorkToDo) {
            System.out.println("Getting Ice");
        }
    }
}
