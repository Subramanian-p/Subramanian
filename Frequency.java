package prac;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n umber of strings");
		int n=sc.nextInt();
		String[] name=new String[n];
		for(int i=0;i<n;i++)
		{
			name[i]=sc.next();
		}
	HashMap<String,Integer> hp=new HashMap<String,Integer>();
	   for(String s:name)
	   {
		   if(hp.containsKey(s)	)
		   {
			   hp.put(s,hp.get(s)+1);
		   }
		   else
		   {
			   hp.put(s,1);
		   }
	   }
	   for (Map.Entry entry : hp.entrySet()) { 
           System.out.println(entry.getKey() + " " + entry.getValue()); 
       } 
	   
	}

}
