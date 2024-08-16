public class BitWiseDemo {
    public static void main(String args[])
    {
        int x=10,y=6,z;
        z=x&y;
        System.out.println(z);
        z=x|y;
        System.out.println(z);
        z=x^y;
        System.out.println(z);
        z=x>>1;
        System.out.println(z);
        z=x<<1;
        System.out.println(z);
        x=-10;
        z=x>>>1;
        System.out.println(String.format("%s",Integer.toBinaryString(x)));
        System.out.println(String.format("%s",Integer.toBinaryString(z)));
    }
}
