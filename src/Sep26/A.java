package Sep26;

public class A {
    public void m1(int i, float f){
        System.out.println("int float method");
    }
    public void m1(float f, int i){
        System.out.println("float int method");
    }

    public static void main(String[] args) {
        A s= new A();
       // s.m1(20, 20);
    }

}
