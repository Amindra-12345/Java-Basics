public class JavaStrirngs {
    public static void main(String[] args){
        String s1 = "JSVS";
        String s2 = "JSVS";
        String s3 = new String("JSVS");

        if(s1==s2){
            System.out.println("s1 and s2 are equal");
        }
        if(s1==s3){
            System.out.println("s1 and s3 are equal");
        }
        if(s2==s3){
            System.out.println("s2 and s3 are equal");
        }
    }
}
