import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer obj1, Integer obj2) {
        if(obj1.equals(obj2))
            return 0;
        else if(obj1>obj2)
            return -100;
        else
            return 100;
    }
}
