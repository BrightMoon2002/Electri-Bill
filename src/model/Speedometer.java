package model;

public class Speedometer {
    private int oldNumber;
    private int newNumber;
    private double money = 5000;
    private Guest guest;

    public Speedometer(int oldNumber, int newNumber, double money, Guest guest) {
        this.oldNumber = oldNumber;
        this.newNumber = newNumber;
        this.money = money;
        this.guest = guest;
    }

    public Speedometer(int oldNumber, int newNumber, Guest guest) {
        this.oldNumber = oldNumber;
        this.newNumber = newNumber;
        this.guest = guest;
    }

    public Speedometer() {
    }

    public int getOldNumber() {
        return oldNumber;
    }

    public void setOldNumber(int oldNumber) {
        this.oldNumber = oldNumber;
    }

    public int getNewNumber() {
        return newNumber;
    }

    public void setNewNumber(int newNumber) {
        this.newNumber = newNumber;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }


    @Override
    public String toString() {
        return "speedometer{" +
                "oldNumber=" + oldNumber +
                ", newNumber=" + newNumber +
                ", money=" + money +
                ", guest=" + guest +
                '}';
    }

    public double getRealMoney() {
        return (getNewNumber()-getOldNumber()) * money;
    }

}
