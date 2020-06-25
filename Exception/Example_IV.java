//On a single track two vehicles are running. As vehicles are going in same direction there is no problem. If the vehicles are running in different direction there is a 
//chance of collision. To avoid collisions, write a Java program using exception handling. You are free to make necessary assumptions. 

Code:
import java.io.*;
import java.util.Scanner;
class Collision extends Exception
{
Collision(String s)
{ super(s); }
}

class P4
{
	public static void main(String ar[])
	{
	String v1=null,v2=null; 
	try
	{
		Scanner s= new Scanner(System.in); 
		System.out.println("Enter the Direction of vehicle1:(L/R):"); 
		v1=s.nextLine();
		System.out.println("Enter the Direction of vehicle2:(L/R):");
		v2=s.nextLine();
		System.out.println("Direction of Vehicle1: "+v1); 
		System.out.println("Direction of Vehicle2: "+v2);
	
		if(!v1.equals(v2))
		throw new Collision("Vehicle2 must change to"+ " " + v1 +" direction"); 
		System.out.println("No Collision occurred!!!");
	}
	catch(Collision e)
	{
		System.out.println(e); 
		v2=v1;
		System.out.println("The Collision has been avoided by changing Vehicle2 direction");
	}
	catch(Exception e)
	{ 
		System.out.println(e); 
	} 

}
}

Output:
>javac P4.java

>java P4
Enter the Direction of vehicle1:(L/R):
L
Enter the Direction of vehicle2:(L/R):
L
Direction of Vehicle1: L
Direction of Vehicle2: L
No Collision occurred!!!


>javac P4.java

>java P4
Enter the Direction of vehicle1:(L/R):
R
Enter the Direction of vehicle2:(L/R):
L
Direction of Vehicle1: R
Direction of Vehicle2: L
Collision: Vehicle2 must change to R direction
The Collision has been avoided by changing Vehicle2 direction
