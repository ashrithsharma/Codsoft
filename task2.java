package Edhoalapackageperu;

import java.util.Scanner;

public class task2 {
	int nos;
	float avg;
	Scanner sc=new Scanner(System.in);
task2()
{
marks();
}
public static void main(String[] args) {
	new task2();
}
public void marks() {
	System.out.println("enter no of subjects:");
	
	
	this.nos=sc.nextInt();
	int[] array= new int[this.nos];
			int sum=0;
			System.out.println("enter subject marks:");
	for(int i=0;i<array.length;i++)
	{
		array[i]=sc.nextInt();
		sum=sum+array[i];
	}
	System.err.println("total marks obtained by the student are:");
	System.out.println(sum);
	average(sum);
	
}
void average(int x)
{
	this.avg=x/nos;
	System.out.println("The average of the student is:"+avg);
	grade(avg);
	
}

void grade(float k)
{
	if(k<=100&&k>90)
	{
		System.out.println("Student obtained o grade");		
	}
	else if(k<90 && k>80)
	{
System.out.println("Student obtained A+ grade");
	}
	else if(k<80 && k>70)
	{
		System.out.println("Student obtained A grade");
	}
	else if(k<70 && k>60)
	{
		System.out.println("Student obtained  B+ grade");
	}
	else if(k<60 && k>50)
	{
		System.out.println("student obtained B grade");
	}
	else if(k<50 && k>40)
	{
		System.out.println("Student obtained C grade");
	}
	else
	{
		System.err.println("Student failed");
	}

}
}
