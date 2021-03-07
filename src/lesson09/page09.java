package lesson09;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class page09 {
    public static void main(String[] args) {
        // contains ve emty
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(7);
        list1.add(3);
        list1.add(21);
        boolean list1_3_içeriyormu = list1.contains(3);
        System.out.println("list1_3_içeriyormu: " +  list1_3_içeriyormu);
        boolean list1_9_içeriyormu = list1.contains(9);
        System.out.println("list1_9_içeriyormu: " + list1_9_içeriyormu);

    }
}
