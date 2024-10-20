package Sep26;

public class c {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0, j=0; i < 10 & j<10; ++i, j=i+1) {
            sum +=i;
            System.out.println(sum);
        }
    }
}
