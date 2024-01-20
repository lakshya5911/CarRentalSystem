package HeadFolder;

public class Main {
    public static void main(String[] args) {
        CarRentalSystem cRentalSystem = new CarRentalSystem();
        // calling the car detail Object
        CarDetail a = new CarDetail("0001", "Thar", "Mahindra", 120.0,true);
        CarDetail b = new CarDetail("0002", "Balero", "Maruti", 200,true);
        cRentalSystem.Addcars(a);
        cRentalSystem.Addcars(b);
        cRentalSystem.Menu();
    }
    
}
