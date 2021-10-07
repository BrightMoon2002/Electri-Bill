package model;

public class Guest {
    private String name;
    private String numberHouse;
    private String codeMeter;

    public Guest(String name, String numberHouse, String codeMeter) {
        this.name = name;
        this.numberHouse = numberHouse;
        this.codeMeter = codeMeter;
    }

    public Guest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberHouse() {
        return numberHouse;
    }

    public void setNumberHouse(String numberHouse) {
        this.numberHouse = numberHouse;
    }

    public String getCodeMeter() {
        return codeMeter;
    }

    public void setCodeMeter(String codeMeter) {
        this.codeMeter = codeMeter;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", numberHouse='" + numberHouse + '\'' +
                ", codeMeter='" + codeMeter + '\'' +
                '}';
    }
}
