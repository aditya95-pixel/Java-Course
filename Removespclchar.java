public class Removespclchar {
    public static void main(String[] args) {
        String str="a1$%6ghb^*";
        System.out.println(str.replaceAll("[^a-z0-9]",""));
    }
}
