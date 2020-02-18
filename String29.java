import java.util.*;

public class String29 {
	public static void main(String args[])
	{
		int count=0,max=0,i;
		String temp="";
		Scanner str=new Scanner(System.in);
		System.out.print("Enter the string :- ");
		String string=str.nextLine();
		String[] s1=string.split(" ");
		for(i=0;i<s1.length;i++)
		{
			
			for(int j=0;j<s1[i].length();j++)
			{
				if(s1[i].charAt(j)=='a'||s1[i].charAt(j)=='e'||s1[i].charAt(j)=='i'||s1[i].charAt(j)=='o'||s1[i].charAt(j)=='u')
				{
				count++;;
					if(count>max)
					{
						 temp=s1[i];
					max=count;
					}
				}
			}
			
				count=0;
		}
		
		System.out.println("the word with most vowels is "+temp+" with no. of vowels is "+max);	
	}
}

