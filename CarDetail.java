package HeadFolder;

public class CarDetail {

    // define the car detail properties
    private String CarId = null;
    private String CarName = null;
    private String CarBrand = null;
    private double Price = 0.0;
    private boolean IsAvailable ;

    // calling the constructor
    public CarDetail(String CarId,String CarName,String CarBrand,double Price,boolean IsAvailable){
        this.CarId = CarId;
        this.CarName = CarName;
        this.CarBrand = CarBrand;
        this.Price = Price;
        this.IsAvailable=IsAvailable;
    }
    public CarDetail(){
        //line of code
    }

    // define the getter() methord
    public String GetCarId(){
        return CarId;
    }
    public String GetCarName(){
        return CarName;
    }
    public String GetCarBrand(){
        return CarBrand;
    }
    public double GetPrice(){
        return Price;
    }
    public boolean GetIsAvailable(){
        return IsAvailable;
    }
    public double TotalAmount(int NoOfDays){
        return (Price*NoOfDays);
    }
    public void carRented(){
        IsAvailable = false;
    }
    public void carReturn(){
        IsAvailable = true;
    } 
    
}
