
 import java.util.*;
public class String5 {
	
	public static void main(String [] args) {
		
		
		Scanner str  = new Scanner(System.in);
		
		System.out.print("Enter the date (dd-mm-yyyy) : - ");
		
		String date=str.nextLine();
		
		System.out.println("The date enter by you is : - "+date);
		
		String out[]  = date.split("-");
	
		int dd  = Integer.parseInt(out[0]) ;
		int mm  = Integer.parseInt(out[1]) ;
		int yyyy  = Integer.parseInt(out[2]) ;
		
		if(dd<=31 && (mm==1 || mm==3||mm==5||mm==7||mm==8||mm==10||mm==12)) {
			if((0000<=yyyy)&&(yyyy<=99999))
		System.out.print("Date is valid");	

		}
	
		else if(dd<=30 && (mm==4 || mm==6||mm==9||mm==11)) {
			if((0000<=yyyy)&&(yyyy<=99999))
		System.out.print("Date is valid");	

		}
		
		if(dd<=29 && (mm==2)) {
			if (dd==29) {
				if (yyyy%4==0) {
			if((0000<=yyyy)&&(yyyy<=99999)) {
		System.out.print("Date is valid");	}
				}
			else System.out.print("Date is INvalid");
			
			}
			
			else {
				
				if((0000<=yyyy)&&(yyyy<=99999)) {
					System.out.print("Date is valid ");	}
				
				
			}
			
			
			

		}
		
		
}
}