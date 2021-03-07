package lesson09;

import java.util.ArrayList;

public class page01 {
    public static void main(String[] args) {

        // array list konumuz 28 şubat 2021
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(4);
        list1.add(5);

        int uzunluk = list1.size();  // uzuluğunu bulduk
        System.out.println("uzunlıuk: " + uzunluk);
        //listenin elemanlarına nasıl ulaşılır
        int birinci_eleman = list1.get(0);  // bunun yazmaya gerek yok sadece gösterme amaçlı
        int iikici_eleman = list1.get(1);   // bunun yazmaya gerek yok sadece gösterme amaçlı
        int üçüncü_eleman = list1.get(2);    // bunun yazmaya gerek yok sadece gösterme amaçlı

        for (int i = 0; i < list1.size(); i++) {
            System.out.println((i + 1) + ". nci elemn: " + list1.get(i));
        }
    }
}
