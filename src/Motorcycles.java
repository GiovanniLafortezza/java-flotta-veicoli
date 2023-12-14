import java.time.LocalDate;

public class Motorcycles extends Vehicles{
    // ---------------- ATTRIBUTI -----------------
    private boolean easel;

    // ---------------- COSTRUTTORI -----------------
    public Motorcycles(String plate, int registrationYear, boolean easel) throws IllegalArgumentException{
        super(plate, registrationYear);
        this.easel = easel;
    }

    // ---------------- GETTER E SETTER -----------------

    public boolean isEasel() {
        return easel;
    }

    public void setEasel(boolean easel) {
        this.easel = easel;
    }
}
