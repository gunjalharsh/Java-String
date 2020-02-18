import java.util.Scanner;
class String22{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char t;
		char[] a=str.toCharArray();
		for(int i=0;i<a.length;i++){
			if(i==0&& a[0]!=' '){
				t=a[0];
				a[0]=a[a.length-1];
				a[a.length-1]=t;
			}
		}
		
		System.out.println(a);
	}
}