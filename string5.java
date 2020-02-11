
import java.util.Scanner; 
 class string5 {
  public static void main(String[] args) {
	  
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter date(dd-mm-yyyy)"); 
    
    String date = sc.nextLine();  
    System.out.println("Input Date is: " + date); 
	String[] output = date.split("-");
	int dd=Integer.parseInt(output[0]);
	int mm=Integer.parseInt(output[1]);  
	int yy=Integer.parseInt(output[2]);  
	System.out.println("Day:"+dd+" Month:"+mm+" Year:"+yy);  
	
	if(yy>=1600 && yy<=9999)
    {
        if(mm>=1 && mm<=12)
        {
            if((dd>=1 && dd<=31) && (mm==1 || mm==3 || mm==5 || mm==7 || mm==8 || mm==10 || mm==12))
            	System.out.println("Date is valid");
            else if((dd>=1 && dd<=30) && (mm==4 || mm==6 || mm==9 || mm==11))
            	System.out.println("Date is valid.");
            else if((dd>=1 && dd<=28) && (mm==2))
            	System.out.println("Date is valid..");
            else if(dd==29 && mm==2 && (yy%400==0 ||(yy%4==0 && yy%100!=0)))
            	System.out.println("Date is valid");
            else
            	System.out.println("Day is invalid.");
        }
        else
        {
        	System.out.println("Month is not valid");
        }
    }
    else
    {
    	System.out.println("Year is not valid");
    }
	
  }
}
