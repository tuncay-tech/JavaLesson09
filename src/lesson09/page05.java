package lesson09;

import java.util.ArrayList;

public class page05 {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("londra");
        stringArrayList.add("new york");
        stringArrayList.add("tokyo");
        stringArrayList.add("sidney");
        // stringArrayList te index = 1 olan elemanı silme,,,,
        stringArrayList.remove(2);
        // londrayı silelim
        stringArrayList.remove("londra");

        for (int i = 0; i<stringArrayList.size(); i++){
            System.out.println((i+1) + ".ci: " + stringArrayList.get(i));
        }
    }
}

