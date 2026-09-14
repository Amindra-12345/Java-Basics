 import java.util.Scanner;
 public class first1{
    public static void main(String args[]){
        
        // int a=10;
        // System.out.println(a);

        // double b=20.5;
        // System.out.println(b);

        // char ab='A';
        // System.out.println(ab);

        // String name = "Amindra";
        // System.out.println(name);
            System.out.println("Enter your name: ");
            Scanner x = new Scanner(System.in);
            String name = x.nextLine();
            System.out.println("================================================");
            System.out.println(name);
            System.out.println("Hello " + name);
           
            System.out.println("Enter your age: ");
             int age = x.nextInt();
             System.out.println("================================================");
             System.out.println("Age: " + age);

                System.out.println("Enter your height: ");
             Double y=x.nextDouble();
             System.out.println("================================================");
             System.out.println("Double: " + y);

             x.close();

    }
 }
 