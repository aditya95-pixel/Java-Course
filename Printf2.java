public class Printf2 {
    public static void main(String[] args) {
        int a=10;
        System.out.printf("%05d\n",a);
        System.out.printf("%(5d\n",a);
        System.out.printf("%+5d\n",a);
        a=-10;
        System.out.printf("%(5d\n",a);
        System.out.printf("%-5d\n",a);
        float b=123.45f;
        System.out.printf("%6.2f\n",b);
        
        String str="Java";
        System.out.printf("%20s\n",str);
        System.out.printf("%-20s\n",str);
    }
    
}
