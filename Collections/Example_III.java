//Write a program for the following HashSet 
//     copy another collection object to HashSet object.
//     delete all entries at one call from HashSet
//     search user defined objects from HashSet

Code:
import java.util.*;
public class Collection3 {
   public static void main(String args[]) 
         {
               HashSet<Integer> set = new HashSet<Integer>();
	   set.add(20);
	   set.add(40);
	   set.add(60);
	   System.out.println(set);
	   HashSet<Integer> cs = new HashSet<Integer>();
	   cs.addAll(set);
	   System.out.println("HashSet after copying");
	   System.out.println(cs);
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the object to be checked: ");
	   int x = sc.nextInt();
	   if(set.contains(x)) 
                    {  System.out.println("Object Found");  }
	  else  {System.out.println("Object Not Found");  }
	 set.clear();
	 System.out.println("HashSet after deleting:");
	 System.out.println(set);
	}
        }
        
Output:
>javac Collection3.java

>java Collection3
[20, 40, 60]
HashSet after copying
[20, 40, 60]
Enter the object to be checked:
80
Object Not Found
HashSet after deleting:
[]
