package HeadFolder;

public class CarRental {

    // define the Properties
    private CarDetail car = null;
    private CustomerDetail Customer = null;
    private int Days = 0;

    // calling the Constructor
    public CarRental(CarDetail car,CustomerDetail customer,int days){
        this.car = car;
        this.Customer = customer;
        this.Days = days;
    }
    public CarRental(){
        // Line of code
    }

    // define the Setter() methord
    public CarDetail GetCarDetail(){
        return car;
    }
    public CustomerDetail GetCustomerDetail(){
        return Customer;
    }
    public int GetDays(){
        return Days;
    }
    
}
