
package lesson09;

import java.util.Arrays;
import java.util.List;

public class page12 {
    public static void main(String[] args) {

        // arraylari liste çevireceğiz şimdide

        int[] int_array = {123, 23, 45, 56, 678};
        List<Object> yeni_list = Arrays.asList(int_array);
        // yeni list in elemanlarını yazdıralım
        for (int i = 0; i < yeni_list.size(); i++) {
            System.out.println((i + 1) + ".nci eleman: " + yeni_list.get(i));

        }
    }
}

