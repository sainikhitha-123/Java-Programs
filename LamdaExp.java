import java.util.*;

public class LamdaExp {
    public static void main(String[] args) {
        AgeComparator comparator = (age1, age2) -> {
            return Integer.compare(age1, age2);
        };
        int result = comparator.compare(25, 30);  // Compares 25 and 30
        ComparisonResult(result, 25, 30);
    }

    public static void ComparisonResult(int result, int age1, int age2) {
        if (result > 0) {
            System.out.println("Age1 is older than Age2 ");
        } else if (result < 0) {
            System.out.println("Age2 is older than Age1");
        } else {
            System.out.println("Both are same");
        }
    }
}
interface AgeComparator {
    int compare(int age1, int age2);
}

