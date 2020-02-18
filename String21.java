import java.util.*;
class String21{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String str=s.next();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++){
			set.add(str.charAt(i));
		}
		Iterator i=set.iterator();
		while(i.hasNext()){
			System.out.print(i.next());
		}
	}
}