package abc.morgan.training.automobile;

public abstract class AbstractVehicle {
    private String make;
    private String year;

    public AbstractVehicle(String make,String year){
        this.make = make;
        this.year = year;
    }

    public abstract void helpMeMove();

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
