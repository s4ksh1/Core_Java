import java.util.*;
class parent
{
	private int a,b;
	public int l,h;
	private void input()
	{
		System.out.println("enter the value of a and b");
	}
Scanner s=new Scanner(System.in);
	public void getdata()
	{
		System.out.println("enter the value of l and h");
		l=s.nextInt();
		h=s.nextInt();
	}
	public void get()
	{
		System.out.println("public function");
	}
}
public class Inherit extends parent
{
//a,b private data members cannot be inherited.	
	public static void main(String args[])
	{
		Inherit c=new Inherit();
		c.getdata();
		c.get();
		c.input(); //private function cannot be inherited
	}
}


Output:  // error will occur because input() method is private in parent class.
javac Inherit.java
Inherit.java:30: error: illegal start of expression
                c.input(); private function cannot be inherited
                           ^
Inherit.java:30: error: ';' expected
                c.input(); private function cannot be inherited
                                                  ^
Inherit.java:30: error: ';' expected
                c.input(); private function cannot be inherited
                                                               ^
Inherit.java:32: error: class, interface, or enum expected
}
^
4 errors


//After commenting c.input() 

Output:
javac Inherit.java

java Inherit

enter the value of l and h
3
4
public function
