package OOP;

//Multilevel inherrritence
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

 class LatestPhone extends newPhone{
    void Touch(){
        System.out.println("You have the touch Featurs");
    }
 }


public class MUlrilevelInheritance {
        public static void main(String[] args) {
    LatestPhone Phone1 = new LatestPhone();
            Phone1.call();
            Phone1.MSG();
            Phone1.Explorur();
            Phone1.Touch();
    } 
}
