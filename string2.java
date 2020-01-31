import java.util.Scanner;
public class string2{  
	public static void main(String args[])
	{
		StringBuffer s=new StringBuffer("This is StringBuffer");  
		StringBuffer s1=new StringBuffer("This is String Buffer");  
		s.append("This is a sample program");
		System.out.println("Appending string:- "+s);
		s.insert(21," Object ");//now original string is changed  
		System.out.println("Inserted the string:- "+s);
		System.out.println("Reverse of the string:- "+s.reverse());  
		System.out.println("Replaced Word"+s1.replace(14,20,"Builder")); 
		
}}