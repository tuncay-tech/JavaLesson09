package lesson09;

import java.util.ArrayList;

public class page07 {
    public static void main(String[] args) {
            // arralistlerii birbirine eklemek
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        array1.add(4);
        array1.add(45);
        array1.add(8);

        array2.add(234);
        array2.add(5642);
        array2.add(1);
        // array2 tüm elemalarını array1 ekleyekim
        array1.addAll(array2);
        // kalan elemanları yazdırma
        for (int i = 0; i < array1.size(); i++) {
            System.out.println((i + 1) + ".nci eleman:  " + array1.get(i));
        }
    }
}
