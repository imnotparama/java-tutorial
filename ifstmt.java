public class ifstmt {
    public static void main(String[] args) {
        int a = 75;
        if (a > 40) {
            System.out.println("Pass");
            if (a > 80) {
                System.out.println("A");
            } else if (a > 60) {
                System.out.println("B");
            } else if (a > 50 && a <= 60) {
                System.out.println("C");
            } else if (a > 40 && a <= 50) {
                System.out.println("D");
            } else {
                System.out.println("E");
            }
        } 
        else{
            System.out.println("Fail");
            }
        }
    
}
