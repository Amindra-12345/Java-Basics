package OOP;
//Single inherrritence
 class oldPhone{
    void call(){
        System.out.println("You can Get an a Call");
    }
    void MSG(){
        System.out.println("You can do a Massages");
    }
}
 class newPhone extends oldPhone{
    void Explorur(){
        System.out.println("YOu can explore the internets");
    }
}


public class Inherritance {
    public static void main(String args[]){
        oldPhone p1 = new oldPhone();
        p1.call();
        p1.MSG();

System.out.println("++++++++++========++++++++++");

        newPhone p2 = new newPhone();
         p2.call();
         p2.MSG();
         p2.Explorur();
    }
}
