package model;

public class Chair {
    private int chairNumber;
    private String chairCondition;

    public Chair(int chairNumber) {
        this.chairNumber = chairNumber;
        chairCondition = "Good";
    }

    public Chair(int chairNumber, String chairCondition) {
        this.chairNumber = chairNumber;
        this.chairCondition = chairCondition;
    }

    public int getChairNumber() {
        return chairNumber;
    }

    public void setChairNumber(int chairNumber) {
        this.chairNumber = chairNumber;
    }

    public String getChairCondition() {
        return chairCondition;
    }

    public void setChairCondition(String chairCondition) {
        this.chairCondition = chairCondition;
    }
}
