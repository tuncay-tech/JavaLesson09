package lesson09;

import java.util.ArrayList;

public class page04 {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("londra");
        stringArrayList.add("new york");
        stringArrayList.add("tokyo ");
        stringArrayList.add("sidney");
        // stringArrayList te index = 1 olan elemanı madrid stringi ile değiştirelim,,,
        stringArrayList.set(1, "madrid");

        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println((i + 1) + ".ci: " + stringArrayList.get(i));
        }
    }
}
