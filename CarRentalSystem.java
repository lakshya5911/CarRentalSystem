package HeadFolder;
import java.util.ArrayList;
import java.util.Scanner;
public class CarRentalSystem {
    int i=0;
    int j=0;
    int k=0;
    // define the properties
    ArrayList<CarDetail> cars ;
    ArrayList<CustomerDetail> customers;
    ArrayList<CarRental> rentals;

    // define the Constructor
    public CarRentalSystem(){
        cars = new ArrayList<CarDetail>();
        customers = new ArrayList<CustomerDetail>();
        rentals = new ArrayList<CarRental>();
    }

    // define the add() methord for ArrayList
    public void Addcars(CarDetail x){
        cars.add(i,x);
        i++;
    }
    public  void AddCustomers(CustomerDetail x){
        customers.add(j,x);
        j++;
    }
    public void Addrentals(CarRental x){
        rentals.add(k,x);
        k++;
    }

    // define the carAvailable() methord
    public void CarAvailable(int dupliate){
        for(CarDetail availableCar : cars){
            if(availableCar.GetIsAvailable() == true){
                System.out.println();
                System.out.println("CarId:"+" "+availableCar.GetCarId());
                System.out.println("Car Company:"+" "+availableCar.GetCarBrand());
                System.out.println("Car Model:"+" "+availableCar.GetCarName());
                System.out.println("IsAvailable:"+" "+availableCar.GetIsAvailable());
                System.out.println("Total Cost:"+" "+availableCar.TotalAmount(dupliate));
                System.out.println("******************");
            }
        }
    }

    // define the ReturnCar() methord
    public void ReturnTheCar(){
        CarRental duplicate = null ;
        //calling the Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Car Id:");
        String UserId = input.next();

        // define the for_each loop
        for(CarRental returnCar : rentals){
            
            if(returnCar.GetCarDetail().GetCarId().equals(UserId)){
                System.out.println("Car return Successfully by"+" "+returnCar.GetCustomerDetail().GetName());
                //calling the Car detail() methord
                CarDetail cDetail = new CarDetail();
                cDetail.carReturn();
                duplicate = returnCar;
            }
            break;
        }
        rentals.remove(duplicate);
        

    }

    // define the RentTheCar() methord
    public  void RentTheCar(){
        // calling the Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name:");
        String Username = input.next(); 
        System.out.println("Enter your Aadhar Number:");
        int user_aadhar = input.nextInt();

        // calling the customers detail object
        CustomerDetail cDetail= new CustomerDetail(Username, user_aadhar);
        AddCustomers(cDetail);

        System.out.println("Enter the number of Days:");
        int day = input.nextInt();
        CarAvailable(day);
        System.out.println("Enter the car id:");
        String userCarId = input.next();
    
        // define the for-each loop
        for(CarDetail Car : cars){
            if(Car.GetCarId().equals(userCarId) && Car.GetIsAvailable() == true){
                System.out.println("Do you want to rent the car(true/false):");
                boolean Agree = input.nextBoolean();
                if(Agree == true){
                    System.out.println("Car is rented successfully for you");
                    // calling the Car rental() Object
                    CarRental cRental = new CarRental(Car, cDetail, day);
                    Addrentals(cRental);
                    Car.carRented();
                }    
            }
            
        }
    }

    // define the Menu() methord
    public void Menu(){
        // define the while() loop
        while(true){
            // calling the Scanner
            Scanner input = new Scanner(System.in);

            System.out.println("*****CAR RENTAL SYSTEM*****");
            System.out.println("1. Rent a car");
            System.out.println("2. Return car");
            System.out.println("3. Exit");
            System.out.println("***************************");
            //taking choice from user
            System.out.println("Enter your choice:");
            int choice = input.nextInt();

            // condition for rent a car
            if(choice == 1){
                RentTheCar();
            }
            // condition for return car
            else if(choice == 2){
                ReturnTheCar();
            }
            // condition to close JVM
            else{
                System.exit(0);
                input.close();
            }
        }    
    } 
}
