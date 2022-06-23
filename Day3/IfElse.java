import java.util.Scanner;
public class IfElse {
    public static Scanner sc = new Scanner(System.in); 
    public static void main(String args[]){
        //Take whole line as input
        System.out.println("Enter number");
        int a = sc.nextInt();
        if(a>20){
            System.out.println("True");
        }
        System.out.println("False");

        System.out.println("Enter number");
        a = sc.nextInt();
        if(a>20){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
