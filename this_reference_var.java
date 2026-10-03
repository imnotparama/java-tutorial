class demo {
    String name = "Paramesh";//Global variable

    demo(String name) {
        this.name = name;// this.name is the instance variable, name is the parameter variable
        //name = r
        //name = name
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

public class this_reference_var {
public static void main(String[] args) {
        demo obj = new demo("Parama");//overriding the global variable with the parameter variable
        obj.display();
    }
    
}
