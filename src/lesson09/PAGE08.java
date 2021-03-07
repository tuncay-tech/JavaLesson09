package lesson09;

import java.util.ArrayList;

public class PAGE08 {
    public static void main(String[] args) {
        // elemanlarını temeizleme
        ArrayList<Integer> array1 = new ArrayList<>();
        array1.add(4);
        array1.add(45);
        array1.add(8);

        // array 1 elemalarının tümünü sielelim
        array1.clear();
        // bu araya şöylede aypabilirdik
        int arra1_uzunluk = array1.size();
        System.out.println("array1 uzunluğu: " + arra1_uzunluk);

      //  System.out.println("array1 uzunluğu: " + array1.size());




    }
}
