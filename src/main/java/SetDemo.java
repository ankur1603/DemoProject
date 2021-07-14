import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(1);
        ints.add(1);
        ints.add(1);
        System.out.println(ints);
        System.out.println(ints.size());

        Set<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(2);
        intSet.add(1);
        intSet.add(3);
        System.out.println(intSet);
        System.out.println(intSet.size());
       //==============================================

        for(Integer i : intSet){
            System.out.println(i);
        }
    }
}
