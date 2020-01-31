package demo;
import java.util.Scanner;
public class string7 {

	public static void main(String[] args) {
		String str, rev = "";
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Enter String");
	      str = sc.nextLine();
	      int length = str.length();
	      for ( int i = length - 1; i >= 0; i-- )
	    	  rev = rev + str.charAt(i);
	 
	      if (str.equals(rev))
	         System.out.println(str+" is a palindrome");
	      else
	         System.out.println(str+" is not a palindrome");
	      
	      int countA=0,countE=0,countI=0,countO=0,countU=0;
	      if (rev.contains("a")||rev.contains("e")||rev.contains("i")||rev.contains("o")||rev.contains("u")) 
	      {
				
				//System.out.println("it contains vowel");
				
				for(int i = 0;i<rev.length();i++) {
					if (rev.charAt(i)== 'a') {
						
						countA++;
						break;
					}}
				
				for(int i = 0;i<rev.length();i++) {
					if (rev.charAt(i)== 'e') {
						countE++;
						break;
					}
					
				}
				
				for(int i = 0;i<rev.length();i++) {
					if (rev.charAt(i)== 'i') {
						
						countI++;
						break;
					}
					
				}
				
				for(int i = 0;i<rev.length();i++) {
					if (rev.charAt(i)== 'o') {
						
						countO++;
						break;
					}
					
				}
				for(int i = 0;i<rev.length();i++) {
					if (rev.charAt(i)== 'u') {
						
						countU++;
						break;
					}
					
				}
				
				
				
			}
			else System.out.print("String does not contain any vowels");
			
			
			if (countA>=1 && countE>=1) {System.out.print("True");}
			else if (countA>=1 && countI>=1) {System.out.print("True");}
			else if (countA>=1 && countO>=1) {System.out.print("True");}
			else if (countA>=1 && countU>=1) {System.out.print("True");}
			
			
			else if (countE>=1 && countI>=1) {System.out.print("True");}
			else if (countE>=1 && countO>=1) {System.out.print("True");}
			else if (countE>=1 && countU>=1) {System.out.print("True");}
			
			
			
			else if (countI>=1 && countO>=1) {System.out.print("True");}
			else if (countI>=1 && countU>=1) {System.out.print("True");}
			
			
			
			
			else if (countO>=1 && countU>=1) {System.out.print("True");}
			else System.out.print("False");
			
			}
			

	}
