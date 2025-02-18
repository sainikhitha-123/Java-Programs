

import java.util.ArrayList;
public class AList {
    public static void main(String[] args)
    {
        Integer[] arr=new Integer[] {1,5,8,9,2};
        ArrayList<Integer>AL=new ArrayList<>();
        AL.add(5);
        AL.add(3);
        AL.add(0,8);
        System.out.println(AL.size());
        System.out.println(AL);
        AL.remove(2);
        System.out.println(AL);
        //With arrays
        System.out.println(AL.contains(1));

    }
}
