import java.util.*;
public class KeybRead {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter two no.s:");
        a=s.nextInt();
        b=s.nextInt();
        c=a+b;
        System.out.println("Result:"+c);
    }
}
