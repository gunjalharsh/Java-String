import java.lang.*;
import java.util.*;

class string3
{
	public static void main(String[] args)
	{
		String s = new String("C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE");
		String strPiped =s.replace("\\"," || ");
		
		String drive=strPiped.substring(0,3);
		String folder=strPiped.substring(6,28);
		String file=strPiped.substring(31,43);
		System.out.println("\n\nDrive: "+drive);
		System.out.println("Folder: "+folder);
		System.out.println("File: "+file);
		System.out.println("\n\n\n");
		StringTokenizer s1=new StringTokenizer("C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE","\\\\");
		while(s1.hasMoreTokens()){
			
			System.out.println(s1.nextToken());
			
		}
		
	}
}