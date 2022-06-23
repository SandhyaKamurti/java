import java.util.Scanner;
public class Rectangle {
    public static Scanner sc = new Scanner(System.in); 
    public static void main(String args[]){
        //Take whole line as input
        System.out.println("Enter length of rectangle");
        int l = sc.nextInt();
        System.out.println("Enter breadth of rectangle");
        int b = sc.nextInt();
        System.out.println("Area of rectangle= "+(l*b));
        System.out.println("Perimater of rectangle= "+(2*(l+b)));
    }
}
