//Write a Java code that converts int to Integer, converts Integer to String, converts String to int, converts int to String, converts String to Integer converts Integer 
//to int.

Code:
public class P10
{
	public static void main(String args[])
	{
		int iInt = 5;
		System.out.println("convert int to integer");
		Integer iInteger = new Integer(iInt);
		System.out.println(iInteger);
		
		int a=1000;
		System.out.println("covert integer to string");
		String str1 = Integer.toString(a);
		System.out.println(str1);
		
		String s="10";  
        System.out.println("convert string to int");
		int i=Integer.parseInt(s);
        System.out.println(i);

		int n=50;  
		String sa=String.valueOf(i);
		System.out.println("convert int to string");
		System.out.println(sa);
		
	}
}


Output:
>javac P10.java

>java P10
convert int to integer
5
covert integer to string
1000
convert string to int
10
convert int to string
10
