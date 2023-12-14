

public class Cars extends Vehicles{
    // ---------------- ATTRIBUTI -----------------
    private int numberOfDoors;


    // ---------------- COSTRUTTORI -----------------
    public Cars(String plate, int registrationYear, int numberOfDoors) throws IllegalArgumentException{
        super(plate, registrationYear);
        checkDoors(numberOfDoors);
        this.numberOfDoors = numberOfDoors;
    }

    // ---------------- GETTER E SETTER -----------------

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) throws  IllegalArgumentException{
        checkDoors(numberOfDoors);
        this.numberOfDoors = numberOfDoors;
    }

    // ---------------- VALIDATOR -----------------
    private void checkDoors(int numberOfDoors) throws IllegalArgumentException {
        if (numberOfDoors < 3 || numberOfDoors > 5)
            throw new IllegalArgumentException("ERROR : NUMBER OF DOORS IS NOT VALID");
    }


}
