public class forloop {
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer loop: " + i);
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner loop: " + j);
            }
        }
        int sum = 0;
        int[] a = { 1, 2, 3, 4, 5 };
        for (Integer i : a) {//0+1 = 1;1+2 = 3;3+3 = 6;6+4 = 10;10+5 = 15;
            sum += i;
            System.out.println(sum);
        }
    }
}
