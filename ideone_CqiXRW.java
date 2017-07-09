/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
				Scanner s= new Scanner(System.in);
		char a= s.next().charAt(0);
		switch(a)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
		    case 'u':
		    	System.out.print("The Letter is a vowel");
		    	break;
		    default:
		 System.out.print("The Letter is a consonant");
		 break;
		}
		
	}
}