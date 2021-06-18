import java.util.*;

public class UniqueElements {

    public static void main(String[] args) {
        String name[] = new String[] { "anuj", "anubhav", "anuj", "chirag" };
        Set<String> s1 = new HashSet<>(Arrays.asList(name));
        TreeSet<String> s2 = new TreeSet<String>(s1);
        System.out.println("Using Set without sorting:" + s1);
        System.out.print("Using TreeSet with Sorting: " + s2);
    }

}
