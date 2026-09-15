 import java.util.Scanner;

public class JAvauntilnow {
    public static void main(String [] args){
        System.out.print("=========The beginining======");
        int[] number=new int[10];
        for(int i=0;i<10;i++){
            System.out.println("Enetr the number = "+i);
                Scanner x = new Scanner(System.in);
                int C =x.nextInt();
                if(C%2==0){
                    number[i]=C;
                }
                else{
                    System.out.println("The number is odd");
                }
                x.close();
        }
        System.out.println("Even numbers entered:");
        for(int i=0;i<10;i++){
            if(number[i]!=0){
                System.out.println(number[i]);
            }
        }
    }
    
}
