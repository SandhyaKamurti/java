import java.util.Scanner;
public class FnameLname {
    public static Scanner sc = new Scanner(System.in); 
    public static void main(String args[]){
        //Take whole line as input
        System.out.println("Enter firstName");
        String fName = sc.nextLine();
        System.out.println("Enter lastName");
        String lName = sc.next();
        System.out.println(fName+" "+lName);
    }
}
