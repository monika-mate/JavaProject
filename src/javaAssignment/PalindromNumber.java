package javaAssignment;

public class PalindromNumber {

    public static boolean isPalindrome(String str){
        int n = str.length();
        int i=0; int j=n-1;

        while(i<j){
            if(str.charAt(i) == str.charAt(j)){
                i++; j--;
            }
            else return false;
        }
        return true;
    }

    public static void main(String []args){
        String str = "aabbcdccbbaa";
        boolean ans = PalindromNumber.isPalindrome(str);
        System.out.println("Ans is : " + ans);
    }
}
