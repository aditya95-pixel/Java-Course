import java.util.*;
public class AreaofTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        System.out.println("0.by base and height\n1.by sides\nEnter choice:");
        choice=sc.nextInt();
        if(choice==0)
        {
            double base=sc.nextDouble();
            double height=sc.nextDouble();
            double res=(1d/2d)*base*height;
            System.out.println("Area:"+res);
        }
        else{
            double a=sc.nextDouble();
            double b=sc.nextDouble();
            double c=sc.nextDouble();
            double s=(a+b+c)/2;
            System.out.println("Area:"+Math.sqrt(s*(s-a)*(s-b)*(s-c)));
        }
    }
    
}
