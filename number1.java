import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		if(num>0)
		{
			System.out.println("number is positive");
		}
		else if(num<0)
		{
			System.out.println("number is negative");
		}
		else if(num==0)
		{
			System.out.println("num is zero");
		}
		else
		{
			System.out.println("it is not a number");
		}
	}		
}

	
