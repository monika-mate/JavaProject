package javaAssignment;

public class ReverseNumber {
    public static void main(String[] args) {

        int num = 123;
        int rev_num =0 ;
        while (num!=0){

            int reminder = num%10;
            rev_num = rev_num * 10+ reminder;
            num = num/10;

        }
        System.out.println(rev_num);
    }



}
