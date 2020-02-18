import java.util.Scanner;
import java.util.StringTokenizer;
class String26{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String max = "";
		StringTokenizer st = new StringTokenizer(str);
		while (st.hasMoreTokens()) {
			String next = st.nextToken();
			if (next.length() > max.length()) {
					max = next;
			}
		}
		System.out.println(max);
	}
}