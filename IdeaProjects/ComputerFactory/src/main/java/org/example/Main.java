package org.example;

public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208", "Dell", "650");
        Monitor theMonitor = new Monitor("27inch Beast", "Dell", 27, "1920x1080");
        Motherboard theMotherboard = new Motherboard("1155", "Dell", 4, 6, "I3");
        PersonalComputer thePC = new PersonalComputer("Thinkpad", "Dell", theCase, theMonitor, theMotherboard);


        thePC.powerUp();
//        thePC.getMonitor().drawPixelAt(10, 10, "orange");
//        thePC.getMotherboard().loadProgram("Ubuntu OS");
//        thePC.getComputerCase().pressPowerButton();
    }
}