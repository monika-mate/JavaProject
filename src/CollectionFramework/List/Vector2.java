package CollectionFramework;

import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Vector2 {
    public static void main(String[] args) {
        Vector<String> courselist = new Vector();
        courselist.add("Selenium");
        courselist.add("Java");
        courselist.add("API");
        courselist.add("Manual");


        System.out.println(courselist);

        Enumeration e = courselist.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }


    }
}
