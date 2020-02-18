import java.util.Scanner;
class String20{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String mail="^[A-Za-z0-9]{3,}@{1}[A-za-z]{5}.[c]{1}[o]{1}[m]{1}$";
		if(str.matches(mail))
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}
}