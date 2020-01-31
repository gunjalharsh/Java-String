
import java.util.Scanner;

public class string16{
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Main string: ");
      String s=sc.nextLine();
      System.out.println("Enter first sub-string: ");
      String s1=sc.nextLine();
      System.out.println("Enter second sub-string: ");
      String s2=sc.nextLine();
      System.out.println(s.contains(s1));
      System.out.println(s.contains(s2));
      int x = s.indexOf(s1);
      int y = s.indexOf(s2);
      
      if(x == - 1) {
         System.out.println("Raj not found");
      } else {
         System.out.println("Found  at index " + x);
      }
      
      if(y == - 1) {
          System.out.println("dev not found");
       } 
      else {
          System.out.println("Found  at index " + y);
       }
      
      if(x<y)
    	  System.out.println(s1+" comes before "+s2);
      else
    	  System.out.println(s2+" comes before "+s1);

      
   }
}