package Edhoalapackageperu;

import java.util.Scanner;

public class ValidateNUmber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int max=100;
		int min=1;  
		int  b = (int)(Math.random()*(max-min+1)-min);  // type casting into 
System.out.println(b);
int c;
 c=sc.nextInt();
 if(c==b)
 
	 System.out.println("You are correct");
 else
	 System.out.println("You are wrong");


	}
}
