import java.util.ArrayList;
import java.util.List;

public class LoopsDemo {

    public static void main(String[] args) {
        List<String> superListNumber = new ArrayList<>();
        superListNumber.add("a");
        superListNumber.add("b");
        superListNumber.add("c");
        superListNumber.add("d");

        System.out.println(superListNumber.size());
        // for => foreach , while , do..while
            //initial value ; condition ; increment
/*
        for(int i=0 ; i < superListNumber.size() ; i++){
            System.out.println("index=" + i + " value="+superListNumber.get(i));
        }
*/

        for(String item: superListNumber){
            if(item.equals("a")) {
                System.out.println("Item=" + item + "_new");
            }
        }
    //===========================================================================
        int anotherVar = -1;
        while(anotherVar<5){
            anotherVar = anotherVar +1;
            System.out.println(anotherVar);
        }
        System.out.println("=================================");

        int var = -1;
        do{
            var = var + 1;
            System.out.println(var);
        }while (var<5);

//================================================================================

List<Integer> numbers = new ArrayList<>();
numbers.add(0);
numbers.add(1);
numbers.add(2);
numbers.add(3);
numbers.add(4);
numbers.add(5);

    }

}
