
import java.util.*;
public class string11 {

	public static void main(String[] args) {
		  
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter IP- address(xxx.xxx.xxx.xxx) :"); 
	    String ip = sc.nextLine();  
	    String output[] = ip.split("-");
	    int a=Integer.parseInt(output[0]);
		int b=Integer.parseInt(output[1]); 
		int c=Integer.parseInt(output[2]);
		int d=Integer.parseInt(output[3]);
		if( (a<=255) && (b<=255) && (c<=255) && (d<=255))
		{
			System.out.println("It's a valid IP- address");
			//System.out.println(a + "." +b + "." +c + "." +d); 
		}
		else
			System.out.println("It's not a valid IP- address.");

	}

}
