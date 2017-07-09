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
		if ((a>='a'&&a<='z')||(a>='A'&&a<='B'))
		System.out.print("The given input is an alphabet");
		else
		System.out.print("The given input is a number");
	}
}