package prac;

import java.util.Scanner;

public class Grade {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		//get the user name
		System.out.println("Enter the number of students");
		int n=sc.nextInt();
		String[] Status=new String[n];
		String[] Student=new String[n]; 
		for(int j=0;j<n;j++)
		{
		System.out.println("Enter the user Name :");
		String name=sc.next();
		//get the user marks
		int total=0,marks;
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the user marks:");
			marks=sc.nextInt();
			total=total+marks;
			}
		//find the average
		int avg=total/5;
		//check whwther it is greater than 75
		if(avg>=75)
		{
			//if yes print distinction
			Student[j]=name;
			Status[j]="Distinction";
					}	
		else if(avg>=60 && avg<75)
		{
		//if no print no Second class
			Student[j]=name;
			Status[j]="First Class";
					
	    }
		else if(avg>=50 && avg<60)
		{
			Student[j]=name;
			Status[j]="Second class";
		
			
		}
		else if(avg>=40 && avg<50)
		{
			Student[j]=name;
			Status[j]="Third Class";
			
		}
		else
		{
			Student[j]=name;
			Status[j]="Failed";
			
		}

}
		for(int k=0;k<n;k++)
		{
			System.out.println("student:"+Student[k]+"       Status:"+Status[k]);
		}
		
		
	}
}
