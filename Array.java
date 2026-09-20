import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        //String b[] = { "Hello", "World", "Parama" };
        //System.out.println(b[0]);
        //System.out.println(b[1]);
        //System.out.println(b[2]);
        String [] a = new String[100];
        a[0] = "Hello";
        a[1] = "World";
        a[2] = "Parama";
        //System.out.println(a[0]);
        //System.out.println(a[1]);
        //System.out.println(a[2]);

        ArrayList<String> names = new ArrayList<>();
        names.add("Thevesh");
        names.add("Cristiano");
        names.add("Virat");

        //update the element
        names.set(0, "Paramesh");
        System.out.println(names.get(0));

        //remove the element
        //names.remove(0);
        System.out.println(names);

        //print all of them
        System.out.println(names);


    }
}