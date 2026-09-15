public class Dowhileloop {
    public static void main(String[] args){
        int i = 10;
        do{
            System.out.println(i);
            i=i+2;
        }while((i%2 == 0)&&(i<20));
    }
}
