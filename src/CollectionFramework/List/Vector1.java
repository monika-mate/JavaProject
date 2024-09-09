package CollectionFramework;

import java.util.List;
import java.util.Vector;

public class Vector1 {    // Vector is Thread Safe

    public static void main(String[] args) {
        List mylist = new Vector();

        mylist.add("Monika");
        mylist.add("Sonu");
        mylist.add("Tinu");
        mylist.add("Chinu");
        mylist.add(124);
        mylist.add(true);

        System.out.println(mylist);
    }


}
