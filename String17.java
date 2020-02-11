import java.util.*;

public class String17 {

	public static void main(String args[]) {
		

		Scanner str = new Scanner(System.in);
		Scanner intr = new Scanner(System.in);
		System.out.print("Enter the Input1 : ");
		String string1 = str.nextLine();
		
		System.out.print("Enter the Input2 : ");
		String string2 = str.nextLine();
		
		
		System.out.print("Enter the Input3 : ");
		int input3 = intr.nextInt();
		
		
		int p=Integer.parseInt((string1.substring(6,string1.length())));
		int q=Integer.parseInt((string2.substring(6,string2.length())));
		
		if (p>q)
		
		System.out.print("Answer is : "+(p-q)*input3);
		
		if (q>p)
		System.out.print("Answer is : "+(q-p)*input3);
		
		
	}
	
}