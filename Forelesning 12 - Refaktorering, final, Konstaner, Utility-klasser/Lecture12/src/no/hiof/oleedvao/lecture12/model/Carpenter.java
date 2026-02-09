package no.hiof.oleedvao.lecture12.model;

public class Carpenter extends Person {

    private int numHousesBuilt;

    public Carpenter(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public Carpenter(String firstName, String lastName, int age, int numHousesBuilt) {
        super(firstName, lastName, age);

        this.numHousesBuilt = numHousesBuilt;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHouses built: " + numHousesBuilt;
    }

    public int getNumHousesBuilt() {
        return numHousesBuilt;
    }

    public void setNumHousesBuilt(int numHousesBuilt) {
        this.numHousesBuilt = numHousesBuilt;
    }
}
