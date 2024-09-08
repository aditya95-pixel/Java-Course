public class StringMethod4 {
    public static void main(String args[])
    {   
        String str1="abc";
        System.out.println(str1.matches("[abc]*"));
        str1="ab6cdef";
        System.out.println(str1.matches("[abc]*"));
        
        str1="accbdefg";
        System.out.println(str1.matches("[abc]{3,7}"));
        str1="accb";
        str1="john@gmail.com";
        System.out.println(str1.matches(".*gmail.*"));
        System.out.println(str1.matches("\\w*@gmail(.*)"));
    }
    
}
