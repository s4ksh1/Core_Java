//Write a Java program to enable the user to handle any chance of divide by zero exception. 

Code: 
import java.util.*;
public class P2
{
	public static void main(String args[])
	{
		int n,d,r;
		Scanner s=new Scanner(System.in);
		try
		{
		  System.out.println("enter numerator");
          n=s.nextInt();
          System.out.println("enter denominator");
		  d=s.nextInt();	
		  if(d==0)
		  {
			  throw new ArithmeticException();
		  }
		  else
		  {
			  r=n/d;
			  System.out.println("Result: "+r);
		  }
		
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("Exception handled...");
			System.out.println("Sakshi Aggarwal");

		}
	}
}

Output:
javac P2.java

java P2
enter numerator
5
enter denominator
0
java.lang.ArithmeticException
Exception handled...
Sakshi Aggarwal

