public class operators {
   public static void main(String[] args) {
      int a = 10;
      Integer b = 20;
      int c = a + b;//Addition
        System.out.println("a + b = " + c);
      c = a - b;//Subtraction
        System.out.println("a - b = " + c);
      int d = a * b;//Multiplication
        System.out.println("a * b = " + d);
      int f = a / b;//Division
        System.out.println("a / b = " + f);
      int g = a % b;//Modulus
        System.out.println("a % b = " + g);
      int h = a++;//Post-increment
        System.out.println("a++ = " + h);
      int i = a--;//Pre-decrement
        System.out.println("a-- = " + i);
      int j = --a;
        System.out.println("--a = " + j);
      int z = ++a;
        System.out.println("++a = " + z);
      boolean k = (a>b) && (a<c);//Logical AND
        System.out.println("k = " + k);
      boolean l = (a > b) || (a < c);//Logical OR
      System.out.println("l = " + l);
      boolean m = !k;//Logical NOT
      System.out.println("m = " + m);
      //ternary operator
      int n = (a > b) ? a : b;
      System.out.println("n = " + n);
      //instance of operator
      boolean o = b instanceof Integer;
      System.out.println("o = " + o);
      
   }
}
