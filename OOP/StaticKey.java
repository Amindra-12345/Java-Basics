package OOP;

class StaticKey {
   
    static String name;
    String WithOutStatic;

    static void call(){
        System.out.println("Static method called");
        System.out.println(name);
    }

    void call2(){
        System.out.println("Non Static method called");
        System.out.println(WithOutStatic);
    }


    public static void main(String args[]){
        name = "Static Variable";
        call();

        StaticKey obj = new StaticKey();
        obj.WithOutStatic = "Non Static Variable";
        obj.call2();
   

    }
}
