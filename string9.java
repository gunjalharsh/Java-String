import java.util.Scanner;

public class string9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a value : "); 
	    
	    String s = sc.nextLine();  
	    System.out.println("Input is: " + s); 
	    if(s.contains("@")){  
		//String[] output = date.split("-");
	    	System.out.println("-1"); 	
	    }
	    else if(s.contains("-")){
	    	String[] output = s.split("-");
	    	int x=Integer.parseInt(output[1]);
	    	System.out.println("output: "+x); 
	    	
	    }
	    else{
	    	int x=Integer.parseInt(s);  
	    	System.out.println("output: "+x);
	    }

}}

