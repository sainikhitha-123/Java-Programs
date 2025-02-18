package PracticePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streams2 {
    public static void main(String[] args) {
        /*List < String > colors = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");
        List<String>LowerCase=colors.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println(LowerCase);
        List<String>upperCase=colors.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperCase);


        List<Integer>l1=Arrays.asList(3,6,2,1,8,5,24,14,12);
        int sumofEvens=l1.stream()
                .filter(e->e%2==0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sumofEvens);
        int sumofodds=l1.stream()
                .filter(e->e%2!=0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sumofodds);


        List<Integer>l1=Arrays.asList(2,4,3,2,6,4,7,4,5,3,1,5,2);
        List<Integer>duplicate=l1.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(duplicate);
        List<String>l1=Arrays.asList("Sai","Suhaas","Dharani","Nikhitha","Amulya","Aashritha","Vishwas","Siddu","Yashu");
        char startingLetter = 'S';
        long strs=l1.stream()
                .filter(s->s.startsWith(String.valueOf(startingLetter)))
                .count();
        System.out.println(strs);

        List<String>l1=Arrays.asList("Sai","Suhaas","Dharani","Nikhitha","Amulya","Aashritha","Vishwas","Siddu","Yashu");
        List<String>AscSList=l1.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(AscSList);
        List<String>DesSList=l1.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(DesSList);


        //finding max and min numbers
        List<Integer>l1=Arrays.asList(1,5,3,234,7,5,8,389,89,3,23,66);
        Integer maximum=l1.stream()
                .max(Integer::compare)
                .orElse(null);
        Integer minimum=l1.stream()
                .min(Integer::compare)
                .orElse(null);
        System.out.println(maximum);
        System.out.println(minimum);*/


        //Finding second largest and second smallest integer
        List<Integer>l1=List.of(1,5,3,234,7,5,8,389,89,3,23,66);
        Integer SLargest=l1.stream()
                .distinct()
                .sorted((a, b) -> Integer.compare(b, a))
                .skip(1)
                .findFirst()
                //.orElseThrow(new Exception());
                .orElse(null);

        System.out.println(SLargest);
        Integer SSmallest=l1.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(SSmallest);




    }
}
