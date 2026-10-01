class method_overiding {

    public void house() {
        System.out.println("I am a red house");
    }
}
public class method_overiding_2 extends method_overiding {
    public void house() {
        System.out.println("I am a blue house");
    }

    public static void main(String[] args) {
        method_overiding_2 obj = new method_overiding_2();
        obj.house();
    }
}