public class Printf {
    public static void main(String[] args) {
        int x=10;
        float y=12.56f;
        char z='A';
        String str="Java Program";
          
        System.out.printf("%3$s %2$f %1$d\n",x,y,str);
        System.out.printf("Hello %d %f %c %s\n",x,y,z,str);
    }
}
