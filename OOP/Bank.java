package OOP;

public class Bank{
int Rs;
Bank(){
    Rs=0;
}
Bank(int money){
    Rs = money;
}

    public static void main(String[] args){
        Bank B1 = new Bank();
        Bank B2 = new Bank(120);

        System.out.println("Salary is : "+B1.Rs);
        System.out.println("Salary is " +B2.Rs);
    } 

}