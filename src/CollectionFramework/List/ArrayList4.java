package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayList4 {


    public static void main(String[] args) {

        List<String> str = new ArrayList();
        str.add("Monika");
        str.add("Poonam");
        str.add("Shriti");

        List num = new ArrayList();
        num.add(100);
        num.add(299);
        num.add(66);
        num.add(100);

        str.addAll(num);
        System.out.println(str);



    }
}
