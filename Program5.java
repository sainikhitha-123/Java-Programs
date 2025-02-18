package StreamsPackage;

import java.util.Arrays;
import java.util.List;

public class Program5 {
    public static void main(String[] args) {
        List<Integer>l1= Arrays.asList(23,2,4,5,6,4,9,7,1,8,12,4,2);
        long count=l1.stream()
                .count();
        System.out.println(count);
    }
}
