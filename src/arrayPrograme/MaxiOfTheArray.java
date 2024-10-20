package arrayPrograme;

public class MaxiOfTheArray {

    public static void main(String[] args) {
        int [] arr = {10, 20, 40, 22};

        int max =arr[0];

        for (int j : arr) {

            if (j > max) {
                max = j;

            }

        }
        System.out.println(max);


    }

}
