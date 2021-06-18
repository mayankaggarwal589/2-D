import java.util.*;

public class ListManager1 {
    public static void main(String[] args) {
        String name[] = new String[] { "naman", "aman", "mayank", "vinay", "kunal" };
        List<String> s1 = new ArrayList<>(Arrays.asList(name));
        Collections.sort(s1);
        System.out.println(s1);
    }

}
