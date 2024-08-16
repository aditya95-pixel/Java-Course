public class BitWise {
    public static void main(String args[])
    {
        byte a=10,b=15;
        a=(byte)(a^b);
        b=(byte)(a^b);
        a=(byte)(a^b);
        System.out.println(a+" "+b);
        byte c;
        c=(byte)(b<<4);
        c=(byte)(c|a);
        System.out.println((c&0b11110000)>>4);
        System.out.println((c&0b00001111));
    }
    
}
