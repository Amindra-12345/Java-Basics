package OOP;
// Objects and classes

class phone{
    String brand;
    String Model;
    String color;
    int ram;

    String call(){
        System.out.println("YOu can grt a calll");
        return "call";
    }
    String internet(){
        System.out.println("You can brrowswe the things related to searching operations");
        return "internet";
    }
}

public class intro {
    public static void main(String[] args) {
        phone p1=new phone();
        p1.brand="Samsung";
        p1.Model="A12";
        p1.color="Black";
        p1.ram=4;
        System.out.println(p1.brand);
        System.out.println(p1.Model);
        System.out.println(p1.color);
        System.out.println(p1.ram);

        p1.call();
        p1.internet();
    }
}
