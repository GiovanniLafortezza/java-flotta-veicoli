public class Main {
    public static void main(String[] args) {
        Cars car = new Cars( "NATALE",2021 ,5);
        Motorcycles moto = new Motorcycles("GINO", 2019,true);
        Cars car2 = new Cars("ANNA",2012,4);

        System.out.println("CAR");
        System.out.println(car.getRegistrationYear() + " " + car.getNumberOfDoors() + " " + car.getPlate());
        System.out.println("MOTO");
        System.out.println(moto.getRegistrationYear() + " " + moto.isEasel() + " " + moto.getPlate());


        FleetManager fleet = new FleetManager();
        fleet.addVehicle(car);
        fleet.addVehicle(moto);
        fleet.addVehicle(car2);

        System.out.println(fleet);

        System.out.println(fleet.findVehicle("GINO"));

        System.out.println(fleet.getTypeOfVehicles());

        Motorcycles moto2 = new Motorcycles("ANN",2011,false);
        fleet.checkAddVehicle(moto2);
        System.out.println(fleet);


    }
}
