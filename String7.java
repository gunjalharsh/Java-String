import java.util.*;
public class String7 { 
  
    
    static boolean isPalindrome(String str) 
    { 
  
        
        int i = 0;
		int j = 0;
  
        while (i < j) { 
  
             
            if (str.charAt(i) != str.charAt(j)) 
				
                return false; 
  
           
            i++; 
            j--; 
        } 
  
        return true; 
    } 
  
 
    public static void main(String[] args) 
    { 
        String str = "madam"; 
  
        if (isPalindrome(str)) 
            System.out.print("true"); 
        else
            System.out.print("flase"); 
    } 
} 

