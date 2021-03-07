package lesson09;

import java.util.ArrayList;

public class page11 {
    public static void main(String[] args) {
        // arraylist >>> array[]  çevirrioruz
        ArrayList<Integer> list1  = new ArrayList();
        list1.add(34);
        list1.add(35);
        list1.add(33);
        list1.add(55);
        Object[] list1_array = list1.toArray();
        for (int i = 0; i < list1_array.length; i++) {
            System.out.println((i+1) + ".nci  eleman: " + list1_array[i]);

        }
    }
}
