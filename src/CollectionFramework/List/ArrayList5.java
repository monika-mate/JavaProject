package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.SocketHandler;

public class ArrayList5 {

    public static void main(String[] args) {

        List courselist = new ArrayList();
        courselist.add("Selenium");
        courselist.add("Java");
        courselist.add("API");
        courselist.add("Manual");
        courselist.add(123);
        courselist.add(false);

        System.out.println(courselist);

        Iterator iterator = courselist.iterator() ;
        while (iterator.hasNext()){
            Object obj = iterator.next();
            if (obj instanceof String) {

                System.out.println(obj);
            }else {
                System.out.println("Not a String");
            }

        }

        System.out.println("============================");

        for (Object course : courselist){  // for each loop
            System.out.println(course);
        }


    }
}
