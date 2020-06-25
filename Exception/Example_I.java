//Write a program in Java to display the names and roll numbers of students. Initialize respective array variables for 10 students. Handle ArrayIndexOutOfBoundsExeption, so 
//that any such problem doesn't cause illegal termination of program.

Code:
import java.util.*;
class P1
{
	public static void main(String args[])
	{
		String name[]=new String[10];
		int roll[]=new int[10];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter your name - ");
			name[i]=s.nextLine();
			System.out.println("Enter your rollNumber - ");
			roll[i]=s.nextInt();
			s.nextLine();
		}
		try
		{
			System.out.println("Enter the student number whose details you want to see");
			int n=s.nextInt();
			System.out.println(name[n]);
			System.out.println(roll[n]);
			
    }
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception Occured: "+e);
			
    }
	}
}


Output:
javac exception.java

java P1
enter your name -
a
enter your rollNumber -
1
enter your name -
b
enter your rollNumber -
2
enter your name -
c
enter your rollNumber -
3
enter your name -
d
enter your rollNumber -
4
enter your name -
e
enter your rollNumber -
5
enter your name -
f
enter your rollNumber -
6
enter your name -
g
enter your rollNumber -
7
enter your name -
h
enter your rollNumber -
8
enter your name -
i
enter your rollNumber -
9
enter your name -
j
enter your rollNumber -
10
enter the student number whose details you want to see
11
Exception Occured: java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 10
