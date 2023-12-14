

public abstract class Vehicles {
    // Ogni veicolo ha un numero di targa univoco e un anno di immatricolazione

    // ---------------- ATTRIBUTI -----------------
    private String plate;
    private int registrationYear;

    // ---------------- COSTRUTTORI -----------------
    public Vehicles(String plate, int registrationYear) throws IllegalArgumentException{
        checkPlate(plate);
        this.plate = plate;
        checkYear(registrationYear);
        this.registrationYear = registrationYear;
    }

    // ---------------- GETTER E SETTER -----------------

    public String getPlate() {
        checkPlate(plate);
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getRegistrationYear() {
        return registrationYear;
    }

    public void setRegistrationYear(int registrationYear) throws IllegalArgumentException{
        checkYear(registrationYear);
        this.registrationYear = registrationYear;
    }

    // ---------------- VALIDATORS -----------------

    private void checkYear(int registrationYear) throws IllegalArgumentException {
        if (registrationYear < 1900 || registrationYear > 2023)
            throw new IllegalArgumentException("ERROR : YEAR OF REGISTRATION IS NOT VALID");
    }

    private void checkPlate(String plate)   throws IllegalArgumentException{
        if (plate.equals(plate.toLowerCase())) {
            throw new IllegalArgumentException("ERROR : ENTER UPPER CASE CHARACTERS AT THE PLATE");
        }
    }

}
