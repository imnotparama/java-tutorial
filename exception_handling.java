public class exception_handling {
    /*public static void main(String args[]) {
        try {//Tries to execute the code block.
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {//Catches the ArithmeticException.
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block");//Executes whether an exception occurs or not.
        }
    }*/

    void m() throws Exception {//Throws an exception.
        throw new Exception("Exception");//Throws an exception with the specified message.
    }

    void p() {
        try {
            m();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());//Prints the exception message.
        }
    }

    public static void main(String args[]) {
        exception_handling e = new exception_handling();//Creates an object of the exception_handling class.
        e.p();//Calls the p method of the exception_handling class.
        System.out.println("End of the program");

    }
}
