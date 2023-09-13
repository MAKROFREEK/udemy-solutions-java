package printerEncapsulation;

public class Printer {

    private int tonerLevel = 50;
    private int pagesPrinted = 0;
    private boolean duplex = false;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public boolean getDuplex() {
        return duplex;
    }

    public void addToner(int tonerAmount) {
        this.tonerLevel += tonerAmount;
        if (this.tonerLevel < 0) {
            System.out.println("Please replace toner!");
        }
    }

    public void printPages(int pages) {
        this.pagesPrinted += pages;
        System.out.println("Printing " + pages + " pages");
    }

}
