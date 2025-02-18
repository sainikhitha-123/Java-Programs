public class Vowelcount {
    public static void main(String[] args) {
        String str="Sai Nikhitha";
        long count= str.chars()
                .filter(c -> "a".indexOf(c) != -1)
                .count();
        System.out.println(count);
    }
}
