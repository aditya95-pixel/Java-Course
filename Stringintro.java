public class Stringintro {
    public static void main(String[] args) {
        String str1="Java Program";
        System.out.println(str1);
        
        String str2=new String("JAVA");
        System.out.println(str2);
        
        char c[]={'H','e','l','l','o'};
        String str3=new String(c);
        System.out.println(str3);
        str3=new String(c,1,3);
        System.out.println(str3);
        
        byte b[]={65,66,67,68};
        String str4=new String(b);
        System.out.println(str4);
        str4=new String(b,1,2);
        System.out.println(str4);

        
        str1="Java";
        str2="Java";
        System.out.println(str1==str2);
        str2=new String("Java");
        System.out.println(str1==str2);
    }
}
