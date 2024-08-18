public class StringMethod3{
    public static void main(String[] args) {
        String str1="JAVA",str2="java",str3="python",str4="python";
        System.out.println(str4.equals(str3));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str2.compareTo(str3));
        System.out.println(str3.compareTo(str2));
        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str1));
        str1="java";
        str3=new String("java");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));
        str1="great wall";
        str2=" of china";
        System.out.println(str1.concat(str2));
        System.out.println(str1.contains("wall"));
    }
}