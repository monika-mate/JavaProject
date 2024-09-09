package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList3 {

    public static void main(String[] args) {

        List<String> mylist = new ArrayList();
        mylist.add("Movie");
        mylist.add("Campaign");
        mylist.add("Tour");
        mylist.add("Hiking");


        System.out.println("======To Print ArrayList===== 1 ====");
        for (String str : mylist){
            System.out.println(str);
        }

        System.out.println("======To Print ArrayList===== 2 ====");

        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));

        }

        System.out.println("======To Print ArrayList===== 3 ====");

        Iterator<String> itr = mylist.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }    }
}
