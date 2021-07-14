package abc.morgan.training.automobile;

public class FourWheeler extends AbstractVehicle{

    public FourWheeler(String make,String year){
        super(make,year);
    }

    @Override
    public void helpMeMove() {
        String move = "I can make you move using 4 tyres";
    }
}
