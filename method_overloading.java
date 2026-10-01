public class method_overloading {
    void addition() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("The sum of A and B is " + c);
    }

    void addition(int a, int b) {
        int c = a + b;
        System.out.println("The sum of A and B is with int type is " + c);
    }

    void addition(String a, String b) {
        System.out.println(a + b);
    }
    
    public static void main(String[] args) {
        method_overloading obj = new method_overloading();
        obj.addition();
        obj.addition(7, 20);
        obj.addition("Hello", "World");
    }
}