package StreamsPackage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Program3 {
    public static void main(String[] args) {
        List<Integer>l1=Arrays.asList(12,34,12,5,6,3,2,15,76,34,2);
        HashSet<Integer>set1=new HashSet<>();
        l1.stream()
                .filter(n->!set1.add(n))
                .forEach(e->System.out.println(e));
    }
}
