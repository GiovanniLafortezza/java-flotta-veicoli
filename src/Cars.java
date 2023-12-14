import java.time.LocalDate;

public class Cars extends Vehicles{
    // ---------------- ATTRIBUTI -----------------
    private int numberOfDoors;


    // ---------------- COSTRUTTORI -----------------
    public Cars(String plate, LocalDate registrationYear, int numberOfDoors) {
        super(plate, registrationYear);
        this.numberOfDoors = numberOfDoors;
    }

    // ---------------- GETTER E SETTER -----------------

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
