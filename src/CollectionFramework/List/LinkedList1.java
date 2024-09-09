package CollectionFramework;

import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
    public static void main(String[] args) {
        List courselist = (List) new LinkedList();
        courselist.add("Selenium");
        courselist.add("Java");
        courselist.add("API");
        courselist.add("Manual");
        courselist.add(123);
        courselist.add(false);

        System.out.println(courselist);
    }
}
