import java.time.LocalDate;

public class Motorcycles extends Vehicles{
    // ---------------- ATTRIBUTI -----------------
    private boolean easel;

    // ---------------- COSTRUTTORI -----------------
    public Motorcycles(String plate, LocalDate registrationYear, boolean easel) {
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
