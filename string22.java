

import java.util.Scanner;

public class string22 {

	public static void main(String[] args) {
		
		String s;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        s=sc.nextLine();
		int length = s.length();

		if (length <= 1) {
		    System.out.println(s);
		} else {
			System.out.println(s.charAt(length - 1) + s.substring(1, length - 1) + s.charAt(0));
		}
	}

}
