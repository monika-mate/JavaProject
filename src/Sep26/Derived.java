package Sep26;

public class Derived extends Base{

    public static void show(){
        System.out.println("Derived::show() called");
    }

    public static void main(String[] args) {

        Base b = new Derived();
        b.show();
    }

}
