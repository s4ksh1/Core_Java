//Write a program that converts all characters of a string in capital letters. (Use StringBuffer to store a string). Don’t use inbuilt function.

Code:
public class P7
{
	public static void main(String args[])
	{
		String str="sakshi";
		char c;
		int l=str.length();
		StringBuffer s= new StringBuffer();;
		
		for(int i=0;i<l;i++)
		{
			c=str.charAt(i);
			c=(char)((c-32));
			s.append(""+c);
		}
		System.out.println(s);		
	}
}

Output:
>javac P7.java

>java P7
SAKSHI
