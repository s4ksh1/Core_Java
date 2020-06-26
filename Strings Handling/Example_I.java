//Write a program for searching strings for the first occurrence of a character or substring and for the last occurrence of a character or substring.

Code:
import java.util.*;
class P6
{
    public static void main(String[]args) throws Exception
    {
        int len1,len2,last=0;
        Scanner in=new Scanner(System.in); 
        System.out.println("Enter string:");
        String s1=in.nextLine(); 
        System.out.println("Enter string you want to search:"); 
        String s2=in.nextLine();
        len1=s1.length(); len2=s2.length();
        for(int i=0;i<=(len1-len2);i++)
        {
            if(s1.substring(i,len2+i).equals(s2))
            {
                if(last==0)
                System.out.println("First occurance is at possition :"+(i+1)); last=i+1;
            }
        }
        if(last!=0)
            System.out.println("Last occurance is at possition :"+last); 
        else
            System.out.println("The string is not found");
       
  }
}


Output:

>javac P6.java

s>java P6
Enter string:
Sakshi
Enter string you want to search:
she
The string is not found


>javac P6.java

>java P6
Enter string:
she
Enter string you want to search:
he
First occurance is at possition :2
Last occurance is at possition :2


>javac P6.java

>java P6
Enter string:
banana
Enter string you want to search:
an
First occurance is at possition :2
Last occurance is at possition :4
