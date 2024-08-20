public class Regular1 {
    public static void main(String[] args) {
        String str1="f";
        System.out.println(str1.matches("."));
        str1="a";
        System.out.println(str1.matches("[abc]"));
        str1="p";
        System.out.println(str1.matches("[^abc]"));
        
        str1="7";
        System.out.println(str1.matches("[a-zA-Z0-9]"));
        str1="a7";
        System.out.println(str1.matches("[a-z][0-9]"));
        str1="b";
        System.out.println(str1.matches("a|b"));
        System.out.println(str1.matches("\\w"));
        str1="5";
        System.out.println(str1.matches("\\d"));
        str1="$";
        System.out.println(str1.matches("\\D"));
    }
    
}
