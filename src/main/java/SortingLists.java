import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingLists {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(22);
        ints.add(11);
        ints.add(15);
        ints.add(100);
        ints.add(62);
        ints.add(0);

        System.out.println(ints);
        IntegerComparator comparator = new IntegerComparator();
        ints.sort(comparator);

        System.out.println(ints);
    }
}
