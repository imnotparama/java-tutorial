public class whileloop {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        while (i <= 2) { //entry controlled
            System.out.println("Entry controlled loop: " + i);//Only run if the condition is true
            i++;
        }
        do{
            System.out.println("Exit controlled loop: " + j); //Run once even if the condition is false
            j++;
        }while (j <= 2);//exit controlled
    }
}
