package PracticePrograms;

import java.util.*;

import java.util.stream.Collectors;

public class Program1{
    public static void main(String[] args) {
        String input = "SaiNikhitha";
        Map<Character, Long> characterCount = input.chars()
                .mapToObj(c -> (char) c) // Convert int to Character
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() >= 2)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        //characterCount.forEach((key, value) -> System.out.println(key + ":" + value));
        for(Map.Entry<Character,Long>entry:characterCount.entrySet()){
            Character key=entry.getKey();
            Long value=entry.getValue();
            System.out.println(key+"->"+value);
        }


    }

}

