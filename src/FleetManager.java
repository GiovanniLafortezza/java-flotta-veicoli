import java.util.*;

public class FleetManager {

    // ---------------- ATTRIBUTI -----------------
    private List<Vehicles> listVehicles;


    // ---------------- COSTRUTTORI -----------------

    public FleetManager() {
        this.listVehicles = new ArrayList<>();
    }

    public List<Vehicles> getListVehicles() {
        return listVehicles;
    }

    public void setListVehicles(List<Vehicles> listVehicles) {
        this.listVehicles = listVehicles;
    }

    // ---------------- METODI -----------------

     public void addVehicle(Vehicles vehicles) {
         listVehicles.add(vehicles);
     }

     public boolean findVehicle(String plate) {
        for( Vehicles vehicles : listVehicles) {
            if(vehicles.getPlate().equalsIgnoreCase(plate))
                return true;
        }
        return false;
     }

     public String getTypeOfVehicles() {
        int counterVehicle = 0;
        int counterMoto = 0;
        for (Vehicles vehicles : listVehicles){
            if (vehicles instanceof Cars) {
                counterVehicle ++;
            } else {
                counterMoto ++;
            }
        }
        return "Le auto sono : " + counterVehicle + "\n" + "Le moto sono : " + counterMoto;

     }

    @Override
    public String toString() {
        String s = "listVehicles : \n";
        for(Vehicles veicolo : listVehicles){
           s += veicolo.getPlate() + " " + veicolo.getRegistrationYear() + "\n";
        }
        return s;
    }
}
