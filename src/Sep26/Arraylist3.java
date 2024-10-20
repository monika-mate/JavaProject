package Sep26;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraylist3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        Collections.unmodifiableList(list);
        list.add("Three");
        for (String s : list)
            System.out.println(s);


    }
}
