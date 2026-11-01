public class Constructor {

    Constructor(int a) {
        System.out.println("I am a constructor with int " + a);
    }

    public static void main(String[] args) {
        Constructor object = new Constructor(12);
    }//prints without even calling the constructor
}