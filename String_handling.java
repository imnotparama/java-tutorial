public class String_handling {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str);
        System.out.println(str.length());//Returns the length of the string.
        System.out.println(str.charAt(0));//Returns the character at the specified index.
        System.out.println(str.substring(0, 5));//Start index, end index
        System.out.println(str.toUpperCase());//Returns the string in uppercase.
        System.out.println(str.toLowerCase());//Returns the string in lowercase.
        System.out.println(str.replace("World", "Java"));//Replaces the specified substring with the specified string.

        String h = "Hello,Parama,Java";
        String d[] = h.split(",");//Splits the string around the specified regular expression.
        System.out.println(d[0]);
        System.out.println(d[1]);
        System.out.println(d[2]);
    }
}
