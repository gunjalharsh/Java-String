import java.util.Scanner;

public class string10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter String: "); 
	    String str = sc.nextLine(); 
	    StringBuffer sb = new StringBuffer(str);
        for(int i = 0;i < str.length();i++)
              for(int j = i+1;j < str.length();j++)
                    if(str.charAt(i) == str.charAt(j)){
                          sb.deleteCharAt(j);
                          sb.deleteCharAt(i);
                    }
        	System.out.println(sb.toString());
               
	}

}
