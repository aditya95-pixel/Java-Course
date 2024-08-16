import java.util.Scanner;

public class Cuboid {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length,breadth,height:");
        int l=sc.nextInt();
        int b=sc.nextInt();
        int h=sc.nextInt();
        double vol=l*b*h;
        double surface_area=2*(l*b+b*h+l*h);
        System.out.println("Volume:"+vol);
        System.out.println("Surface Area:"+surface_area);
    }
}
