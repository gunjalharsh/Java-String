import java.util.Scanner;
class String25{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String pan="[A-Z]{3}[0-9]{4}[A-Z]{1}";
		if(str.matches(pan))
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}
}