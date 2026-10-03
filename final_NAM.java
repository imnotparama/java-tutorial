final class FinalClass {
    final int a = 10;// the number cannot be changed anywhere 

    final void function1() {
        System.out.println("Function 1");//also cannot be changed anywhere
    }
}


public class final_NAM {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        System.out.println(obj.a);
        obj.function1();
    }

    
}
