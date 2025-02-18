import java.util.*;

public class LList {
    public static void main(String[] args) {
        ArrayList<String>AL1=new ArrayList<>();
        AL1.add("9");
        AL1.add("6");
        LinkedList<String>LL1=new LinkedList<>();
        LL1.add("8");
        LL1.add("2");
        LL1.add("3");
        LL1.add(1,"4");
        System.out.println(LL1);
        LL1.addAll(0, AL1);
        System.out.println(LL1);
    }
}
