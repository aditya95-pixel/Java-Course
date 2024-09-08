public class Regex1 {
    public static void main(String[] args) {
        String email="programmer@gmail.com";
        int i=email.indexOf('@');
        String uname=email.substring(0,i);
        String domain=email.substring(i+1,email.length());
        System.out.println(uname);
        System.out.println(domain);
        i=domain.indexOf('.');
        domain=domain.substring(0,i);
        System.out.println(domain);
    }
    
}
