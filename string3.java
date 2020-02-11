import java.util.StringTokenizer;
public class string3{  
	public static void main(String args[])
	{
		String s1="C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE";
		System.out.println("Drive: " + s1.substring(0,3));
		String s2= s1.substring(3,18);
		System.out.println("Folders: " +s2.replace("\\" , "||"));
		System.out.println("File: " +s1.substring(19));
}}