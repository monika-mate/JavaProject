package CollectionFramework;

import java.util.List;

public class ListInterface {

    public static void main(String[] args) {

        List shopping_list = List.of("Milk", "Butter", "Bread", "Cheese");
        System.out.println(shopping_list);
        System.out.println(shopping_list.size());
        System.out.println(shopping_list.indexOf("Bread"));
        System.out.println(shopping_list.isEmpty());

        shopping_list.add("Monika");   // List is interface we can't add new element, too add  new list we have class i.e. Arraylist,

    }



}
