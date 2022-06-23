import java.util.Scanner;
public class StringInput {
    public static Scanner sc = new Scanner(System.in); 
    public static void main(String args[]){
        //Take whole line as input
        System.out.println("Enter first string");
        String str1 = sc.nextLine();
        System.out.println("Str1= "+str1);

        //Take one word as input
        System.out.println("Enter second string");
        String str2 = sc.next();
        System.out.println("Str2= "+str2);
    }
}
