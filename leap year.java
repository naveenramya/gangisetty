import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args)
	{
		int year=2004;
		if((year%400==0)||((year%4==0)&&(year%100!=0)))
		System.out.println("year"+year+"is a leap year");
		else
		System.out.println("year"+year+"is not a leap year");
	}
}
