import java.util.*;
public class ReadKeyboard {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        float x=s.nextFloat();
        System.out.println(x);

        s.useRadix(2);
        int y=s.nextInt();
        System.out.println(y);

    }
}
