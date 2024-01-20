package HeadFolder;

public class CustomerDetail {
    
    //define the Properties of Customers detail
    private String Name = null;
    private int AadharNumber = 0;

    //define the constructor
    public CustomerDetail(String Name,int AadharNumber){
        this.Name = Name;
        this.AadharNumber = AadharNumber;
    }

    // calling the getter() methord
    public String GetName(){
        return Name;
    }
    public int GetAadharNumber(){
        return AadharNumber;
    }
}
