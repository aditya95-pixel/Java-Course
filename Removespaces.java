public class Removespaces {
    public static void main(String[] args) {
        String r="   ad    i   tya  maz    um dar   ";
        r=r.trim();
        r=r.replaceAll("[\\s]+"," ");
        System.out.println(r);
        String arr[]=r.split(" ");
        System.out.println(arr.length);
    }
}
