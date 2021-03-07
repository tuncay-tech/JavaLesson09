package lesson09;

import java.util.ArrayList;

public class page02 {
    public static void main(String[] args) {

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("londra");
        stringArrayList.add("new york");
        stringArrayList.add("tokyo");
        stringArrayList.add("sidney");

        int uzunluk = stringArrayList.size();

        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println((i + 1) + ".ci : " + stringArrayList.get(i));
        }
    }
}
