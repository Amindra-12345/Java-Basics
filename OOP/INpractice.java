package OOP;

class Phone{
    
    String brand;
    String Model;
    String color;
    int ram;
    double price;

    public void call(){
        System.out.println("You can make a call"+ brand +" and " +Model);
    }
    public void internet(){
        System.out.println("You can browse the things related to searching operations");
    }
}

public class INpractice {
    public static void main(String args[]){
        Phone p1=new Phone();
        p1.brand="Samsung";
        p1.Model="A12"; 
        p1.call();
        p1.internet();
    } 
}
