package demo;
import java.util.*;
public class string14 {

	public static void main(String[] args) {
	char chr[] = new char[999];
	
	Scanner str = new Scanner(System.in);
	System.out.print("Enter String : ");
	String s = str.nextLine();
	
	System.out.println("Input String : "+s);
	for (int i = 0;i<s.length();i++) {
	 chr[i+1] = s.charAt(i); }
	
	for (int i = 1;i<=s.length();i++) {
		if (i%2==0)
		{
			if ( chr[i]=='a'||chr[i]=='e'||chr[i]=='i'||chr[i]=='o'||chr[i]=='u') {
				chr[i]='\0';
			}else continue;
		}
		
		
	}
	s = new String(chr);
	System.out.print("Final String: "+s);
	
	
}
}