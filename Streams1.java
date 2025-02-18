package PracticePrograms;

import java.util.ArrayList;

public class Streams1 {
    public static void main(String[] args) {
        ArrayList<Integer>l1=new ArrayList<>();
        l1.add(3);
        l1.add(5);
        l1.add(8);
        l1.add(9);
        l1.add(2);
        l1.add(23);
        double average=l1.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println(average);
    }
}

