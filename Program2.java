package PracticePrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program2 {
    public static void main(String[] args) {
        String given="My name is Sai Nikhitha";
        //String[] arr =
        String input="name";
        List<String> ls = Arrays.asList(given.split(" "));




        List lss = ls.stream()
                .filter(e-> ls.contains(input))
                .collect(Collectors.toList());
                //.forEach(val -> System.out.println(val)));


    }
}
