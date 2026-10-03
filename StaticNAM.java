class Stats {

    String name;                    // Instance variable
    static String college;          // Static variable

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
    }

    static void college_name() {
        System.out.println("College Name: SRMIST Ramapuram");//cannot be changed
    }

    static {
        System.out.println("Static block");//prints once doesnt need to be called 
    }
}

public class StaticNAM {

    public static void main(String[] args) {

        Stats parama = new Stats();

        parama.name = "Parama";                 // Object variable
        Stats.college = "SRMIST Ramapuram";     // Static variable
        //parama.college = "SRMIST Ramapuram";     // Object variable doesnt change static variable
        parama.display();
        Stats.college_name();
    }
}