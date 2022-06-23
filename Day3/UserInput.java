import java.util.Scanner; //import Scannervclass
public class UserInput {
    public static Scanner sc = new Scanner(System.in); //using sc we take input
    public static void main(String args[]){
        System.out.println("Enter two numbers");
        int a = sc.nextInt(); //Take integer input
        long b = sc.nextLong(); //Take long input
        System.out.println("Value of a is: "+a);
        System.out.println("Value of b is: "+b);  
    }
}
