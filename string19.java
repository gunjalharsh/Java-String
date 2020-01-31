
import java.util.Scanner;

class string19
{
  public static void main(String[] args) 
  {
      
      String numbers;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter string with numbers: ");
      String str = sc.nextLine();
      numbers=str.replaceAll("[^0-9]", "");
      System.out.println("Numbers extracted from are: " + numbers);
      int num=Integer.parseInt(numbers);
      int remainder=0,sum=0;
      while(num>0)
      {
      	remainder=num%10;
      	sum=sum+remainder;
      	num=num/10;
      }
      System.out.println("output: "+sum);
  }
}
