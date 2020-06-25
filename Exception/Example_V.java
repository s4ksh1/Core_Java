//Write a java program to throw an exception for an employee detail. 
//•	If an employee name is a number, a name exception must be thrown.
//•	If an employee age is greater than 50, an age exception must be thrown. 
//•	Or else an object must be created for the entered employee details

Code:
import java.io.*;
import java.util.*;

public class P5
{
 public static void main(String args[])
 {
   String name;
   int age;

  System.out.println("Enter employee name & age: ");
  Scanner in= new Scanner(System.in);
  
  try
  {
	if(!(in.nextLine().matches("[a-zA-Z]+")))
    	{
		System.out.println("Name exception");
		throw new Exception();
    	}
   
   age=in.nextInt();
   	if(age>50)
   	{
      		System.out.println("Age>50 exception");
      		throw new Exception();
   	}
 
   P5 x= new P5();
   System.out.println("Object created");
  }
  
 catch(Exception e)
 {
	System.out.println("Exception Handled");
 }
}
}

Output:
>javac P5.java

s>java P5
Enter employee name & age:
sakshi1
Name exception
Exception Handled


>javac P5.java

>java P5
Enter employee name & age:
Sakshi
56
Age>50 exception
Exception Handled


>javac P5.java

>java P5
Enter employee name & age:
Sakshi
20
Object created
