package javaAssignment;

public class PyramidPattern {

    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <num ; i++) {
            for (int j = num-i; j>1 ; j--) {
                System.out.print(" ");

            }
            for (int j = 0; j <=i ; j++) {

                System.out.print(" *");

            }
            System.out.println();

        }
        }
    }




