import java.util.*;

public class ListManager {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("rajeev");
        list1.add("keshav");
        list1.add("raman");
        list1.add("naman");
        List<String> list2 = new ArrayList<>(list1);
        list2.add("rajeev");
        list2.add("keshav");
        list2.add("raman");
        list2.add("naman");
        list1.removeAll(list2);
        System.out.println("after removing the elements" + list1);

    }
}