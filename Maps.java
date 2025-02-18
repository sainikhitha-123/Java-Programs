import java.util.*;

public class Maps {
    public static void main(String[] args) {
        String input="My name is Sai Nikhitha My name is Sai Nikhitha name is Sai learning how to learn";
        Map<String,Integer>wordCount=new HashMap<>();
        String[] words=input.split(" ");
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {  //Entry string is that which contains both key and value and we can trace at a time with one object only
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
