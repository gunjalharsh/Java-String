import java.util.Scanner;
public class string1{  
	public static void main(String args[])
	{  	
		Scanner sc = new Scanner(System.in);
		String s1="Welcome to Java World";
		System.out.println(s1);  
		System.out.println("enter a position");  
		int n= sc.nextInt();
		char ch=s1.charAt(n);
		System.out.println("1. Character at "+n+" position is:-"+ch); 
		String s2 = "Welcome";
		System.out.println(" String compare lexicographically ignoring case:- "+s1.equalsIgnoreCase(s2));
		String s3 = "- Let us learn";  
        String s4 = s1.concat(s3);          
        System.out.println(s4);  
		System.out.println("The First Occurrence of the Search Element is at Position: " +s1.indexOf("a"));
		s1=s1.replace('a','e'); 
		System.out.println(s1);  
		System.out.println("string between 4th position and 10th is:- "+ s1.substring(4,10));
		System.out.println("String in Lowercase:- "+s1.toLowerCase());
	}
}