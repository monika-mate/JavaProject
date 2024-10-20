package Sep26;

import java.util.LinkedList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        List<String >list1 = new LinkedList<>() ;
        list1.add("A");
        list1.add("B");
        list1.add("A");
        list1.add("C");
        list1.add("D");

        List<String >list2 = new LinkedList<>() ;
        list2.add("A");

        list1.removeAll(list2);

        for (String temp:list1)
            System.out.printf(temp + " ");

        System.out.println();

    }
}
