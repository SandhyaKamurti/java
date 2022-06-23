public class Operators {
    public static void main(String args[]) {
          //String operation
          System.out.println(30+"a"); //30a
          System.out.println(30+"1"); //301
          System.out.println(30+"a"); //30a
          System.out.println(30+10+"a"); //3030a

          //a++
          int a = 10;
          int b = a++; //first assign then increment
          System.out.println(b);    
          int c = ++a;
          System.out.println(c); //First increment then assign
    }
}
