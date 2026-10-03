abstract class outline {
    abstract void add();

    abstract void sub();

    abstract void mul();

    abstract void div();

    void mod() {
        System.out.println("I am mod from abstract class but normal obj");
    }
}

public class abstraction extends outline {
    void add() {
        System.out.println("I am add from abstraction class");
    }

    void sub() {
        System.out.println("I am sub from abstraction class");
    }

    void mul() {
        System.out.println("I am mul from abstraction class");
    }

    void div() {
        System.out.println("I am div from abstraction class");
    }

    public static void main(String[] args) {
        abstraction obj = new abstraction();
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
        obj.mod();
    }
}
