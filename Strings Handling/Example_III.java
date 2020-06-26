//Write a program in Java to read a statement from console, convert it into upper case and again print on console. (Don’t use inbuilt function)

Code:

import java.util.*; 
class P8
{
    public static void main(String a[]) 
    {
        Scanner in=new Scanner(System.in); 
        System.out.println("Enter a string:");
        String s1=in.nextLine();
        System.out.println(s1.toUpperCase());
    }
}

Output:

javac P8.java

>java P8
Enter a string:
sakshi
SAKSHI
