public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge() {
        int currentYear = 2023;
        int birthYear = Integer.parseInt(birthDate) - currentYear;
        return currentYear - birthYear;
    }

    public double getPay() {
        int pay = 0;
        return pay;
    }

}
