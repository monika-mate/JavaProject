package javaAssignment;

public class ReverseString {

    public static void main(String[] args) {
        String name = "Monika";
        String rev_name = "";

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            rev_name = ch +rev_name;

        }
        System.out.println(rev_name);
    }

}
