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

 class LatestPhone extends oldPhone{
    void Touch(){
        System.out.println("You have the touch Featurs");
    }
 }


public class H {
        public static void main(String[] args) {
    LatestPhone Phone1 = new LatestPhone();
            Phone1.call();
            Phone1.MSG();
            
            Phone1.Touch();
    System.out.println("++++++++++++++++++++++++++++++++++++++");
            newPhone Phone2 = new newPhone();
            Phone2.call();
            Phone2.MSG();
            Phone2.Explorur();
            
        } 

}
