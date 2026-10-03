public class protected_class_exp extends protected_class {

    public void method2() {
        System.out.println("I am child");
    }

    public static void main(String[] args) {

        protected_class_exp obj = new protected_class_exp();

        obj.method1();
        obj.method2();
    }
}