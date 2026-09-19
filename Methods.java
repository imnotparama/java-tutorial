public class Methods {
    void addition() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("The sum of A and B is " + c);
    }

    void subtraction(int a, int b) {
        int c = a - b;
        System.out.println("The difference of A and B is " + c);
    }
    
    void str(String a, String b, String c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    int add(int a,int b) 
    {
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        Methods caller = new Methods();
        caller.addition();
        caller.subtraction(10, 20);
        int c = caller.add(100, 20);
        System.out.println("The sum of A and B is " + c);
        caller.str("Hello", "World", "Parama");
    }
}
