package javaAssignment;

public class LeftAngleTriangle {

    public static void main(String[] args) {
        int num = 5;
        lefttriangle(num);
    }

    public static void lefttriangle(int num){

        for (int i = 0; i <num ; i++) {
            for (int j = 2*(num-1); j >=0 ; j--) {
                System.out.print(" ");

            }
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }

    }
}
