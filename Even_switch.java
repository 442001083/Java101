import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	Scanner xyz = new Scanner (System.in);	
		System.out.println("Enter a Number ");
		int num = xyz.nextInt();
	    num %=2;
		switch(num){
		 
		   
		     case 0:
		          System.out.println("Even");
		         break;
		          default:
		          System.out.println("Add");
		     
		  
		}
		
	}
}
