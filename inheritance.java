    class grandparent {
        void function1() {
            System.out.println("Grandparent");
            System.out.println("From Version 1.0");
            System.out.println("Basic Functions");
        }
    }

    class parent extends grandparent {
        void function2() {
            System.out.println("Parent");
            System.out.println("From Version 2.0");
            System.out.println("Advanced Functions");
        }
    }

    class child extends parent {
        void function3() {
            System.out.println("Child");
            System.out.println("From Version 3.0");
            System.out.println("Enhanced Functions");
        }
    }

public class inheritance {
        public static void main(String[] args) {
            child obj = new child();
            obj.function1();
            obj.function2();
            obj.function3();
        }
    }
