public class switchstmt {
    public static void main(String[] args) {
        int a = 44;
        String Size;
        switch (a) {
            case 38:
                Size = "Small";
                break;
            case 40:
                Size = "Medium";
                break;
            case 42:
                Size = "Large";
                break;
            default:
                Size = "Extra Large";
                break;
        }
        System.out.println(Size);
    }
}
