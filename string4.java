import java.util.Scanner;
public class string4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Input first string: ");
		String str1 = sc.nextLine();
		System.out.println("Input second string: ");
		String str2 = sc.nextLine();
		if(str1.length()>str2.length())
		{
			str1 = str1.substring(str1.length() - 2);
			str1 = str1.concat(str2);          
	        System.out.println("Output: "+str1);  
		}
		else if(str2.length()>str1.length())
		{
			 str2 = str2.substring(str2.length() - 2);
			 str1 = str1.concat(str2);          
	        System.out.println("Output: "+str1);  
		}
		else {
			str1 = str1.concat(str2);          
	        System.out.println("Output: "+str1);  
		}

	}

}