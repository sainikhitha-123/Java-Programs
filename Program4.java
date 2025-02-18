package StreamsPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program4 {
    public static void main(String[] args) {
        List<Integer>l1= Arrays.asList(23,12,14,15,17,18,23);
        l1.stream()
                .findFirst()
                .ifPresent(e->System.out.println(e));
    }
}
