package CollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator1 {

    public static void main(String[] args) {

        List courselist = new ArrayList();
        courselist.add("Selenium");
        courselist.add("Java");
        courselist.add("API");
        courselist.add("Manual");
        courselist.add(123);
        courselist.add(false);

        System.out.println(courselist);

        System.out.println("===============================");


        ListIterator lt1 = courselist.listIterator();
        while (lt1.hasNext()){
            System.out.println(lt1.next());
        }

        System.out.println("===============================");


        while (lt1.hasPrevious()){
            System.out.println(lt1.hasPrevious());
        }

    }


}
