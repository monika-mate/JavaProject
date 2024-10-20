package Sep26;

import java.util.ArrayList;
import java.util.List;

public class Arraylist2 {
    public static void main(String[] args) {
        List<String>words= new ArrayList<>();
        words.add("Java");
        words.add("Certification");
        words.add("Mock");
        String result= words.stream().reduce("", (myString, myElement ) ->myString.toUpperCase()+ myElement.toLowerCase());
        System.out.println(result);


    }
}
