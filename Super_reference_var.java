class super_ex {
    String Fav_fruit = "Apple";

    void display() {
        System.out.println("Fav Fruit:  Parent class " + Fav_fruit);
    }
}

class abc extends super_ex {
        String Fav_fruit = "Orange";

        void display() {
            System.out.println("Fav Fruit:  Child class " + Fav_fruit + " Super class " + super.Fav_fruit);//prints the parent class variable
        }
    }

public class Super_reference_var {
    public static void main(String[] args) {
        abc obj = new abc();
        obj.display();
    }
}