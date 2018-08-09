
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String Str,rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		Str=sc.nextLine();
		int length=Str.length();
		for(int i=length-1;i>0;i--)
		{
		rev=rev+Str.charAt(i);
		if(Str.equals(rev)){
		System.out.println(Str+"is a palindrome");
		}
		else
		{
	               System.out.println(Str+"is not a palindrome");	
			
		}
	}

