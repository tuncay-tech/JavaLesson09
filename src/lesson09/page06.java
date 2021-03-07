package lesson09;

import java.util.ArrayList;

public class page06 {
    public static void main(String[] args) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(4);
        integerArrayList.add(45);
        integerArrayList.add(8);
        integerArrayList.add(234);
        integerArrayList.add(5642);
        integerArrayList.add(1);
        // 100 den büyük elelmanlaını sildirip geriye alan elemanları siliniz
        for (int i = 0; i < integerArrayList.size(); i++) {
            if (integerArrayList.get(i) > 100) {
                integerArrayList.remove(i);
                i = i - 1;     // arada eleman kaynmasın diye index sürekli kaydırmalıyız
            }
        }
        // kalan elemanları yazdırma
        for (int i = 0; i < integerArrayList.size(); i++) {
            System.out.println((i + 1) + ".nci eleman:  " + integerArrayList.get(i));

        }

    }
}
