package lesson09;

import java.util.ArrayList;

public class page10 {
    public static void main(String[] args) {
        // contains ve emty
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(34);
        list1.add(35);
        list1.add(33);
        list1.add(55);
        boolean list1_boşmu = list1.isEmpty();
        System.out.println("list1 içi boşmu: " + list1_boşmu);
        // şi,mdi clear metodu ile list temizleyip içini boşaltalım ve sonra soralım
        list1.clear();
        boolean sonra_boşmu = list1.isEmpty();
                System.out.println("list1 içi en son boşmu: " + sonra_boşmu);


    }
}
