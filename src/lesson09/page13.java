package lesson09;

import java.util.ArrayList;

public class page13 {
    public static void main(String[] args) {
        // bir arraylist oluşturunuz ve haftanın günlerini içersin ve bunuu forloop ile
        // haftanın günleri ve uzunluğunu yazdırın

        ArrayList<String> haftanın_günleri = new ArrayList<>();
        haftanın_günleri.add("pazartesi");
        haftanın_günleri.add("salı");
        haftanın_günleri.add("çarşamba");
        haftanın_günleri.add("peşembe");
        haftanın_günleri.add("cuma");
        haftanın_günleri.add("cumartesi");
        haftanın_günleri.add("pazar");

        for (int i = 0; i < haftanın_günleri.size(); i++) {
            System.out.println("hafatnın " + (i+1) + ".nci günü: " + haftanın_günleri.get(i) );
        }

        int uzunluk = haftanın_günleri.size();
        System.out.println("uzunluk: " + uzunluk);
    }


}
