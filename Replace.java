package prac;

import java.util.Scanner;

public class Replace {
	

	public static void main(String args[])
	{
		//getting the string
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String 1");
		String a=sc.next();
		//getting the character
		System.out.println("enter the String 2");
		String b=sc.next();
		int[] arr1=new int[b.length()];
		//call the replacemethod and save the result
		char[] arr=b.toCharArray();
		char[] str=new char[a.length()];
		for(int i=0;i<b.length();i++)
		{
			arr1[i]=a.indexOf(arr[i]);
			str[arr1[i]]=a.charAt(arr1[i]);
		}
		
		
		for(int k=0;k<str.length;k++)
		{
			int l=(int)str[k];
			if(l==0)
			{
				str[k]='*';
			}
			else
			{
				continue;
			}
		}
		System.out.println(str);
		
		
		
	}
	 

}
