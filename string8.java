import java.util.Scanner;

public class string8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter String: "); 
	    String str = sc.nextLine();  
	    System.out.println("Input String: " + str); 
	    char ch[] = str.toCharArray();
	    int count=0;
	    for(char c : ch)
	    {
	    	if(str.lastIndexOf(c) == str.indexOf(c))
	    	{
	    		count++;
	    	}
	    }
	    System.out.println("output:"+count); 

}}
