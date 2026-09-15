public class Arrays {
    public static void main(String[] args) {
        int[] even_numbers = {2,3,4,5,6,7,8,9,10};
        String[] names = {"Amindra", "Nishan", "Sanjana", "Sujan", "Ramesh"}; 
        for(int i=0;i<even_numbers.length;i=i+2){
            for(int j=0;j<names.length;j++){
                System.out.println("NUmber = " + even_numbers[i] + " Has him " + names[j]);
            }
        }
    }
}
