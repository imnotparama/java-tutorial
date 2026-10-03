interface calculator {
    void add();
    void sub();
    void mul();
    void div();
    void mod();
}

public class interface_exp implements calculator {
    
    public void add() {
        System.out.println("I am add from interface class");
    }
    
    public void sub() {
        System.out.println("I am sub from interface class");
    }
    
    public void mul() {
        System.out.println("I am mul from interface class");
    }
    
    public void div() {
        System.out.println("I am div from interface class");
    }
    
    public void mod() {
        System.out.println("I am mod from interface class");
    }
    public static void main(String[] args) {
        interface_exp obj = new interface_exp();
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
        obj.mod();
    }
}
