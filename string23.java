
import java.util.Scanner;

class string23
{
    public static void main(String args[])
    {
        String s;
        int count=0;
         
        Scanner sc=new Scanner(System.in);
         
        System.out.print("Enter string: ");
        s=sc.nextLine();
        for(int i=0; i<s.length()-1; i++)
        {
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
                count++;
        }
         
        System.out.println("Total number of words in string are: "+ (count+1));
       
    }
}