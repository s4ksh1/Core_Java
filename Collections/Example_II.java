//Write a program for the following HashMap 
//    find whether specified key exists or not.
//    find whether specified value exists or not.
//    get all keys from the given HashMap.  
//    get all key-value pair as Entry objects.

Code:
import java.util.*;
import java.util.Map.Entry;  
class Collection2
{  
  public static void main(String args[])
  {  
    HashMap<Integer,String> map=new HashMap<Integer,String>();     
    map.put(1,"A");    
    map.put(2,"B");    
    map.put(3,"C"); 
    System.out.println(map);
    boolean kexist = map.containsKey(3);
    System.out.println("Check for 3 : " + kexist);
    
    boolean valexist=map.containsValue("D");
    System.out.println("Check for D: " + valexist);
    System.out.println("\nKeys present in HashMap:");
    Iterator<Integer> itr = map.keySet().iterator();
    while (itr.hasNext()) 
    {
      System.out.println(itr.next());
    }
    System.out.println("\nKey-value present:");
    Set<Entry<Integer, String>> ent = map.entrySet();
    for(Entry<Integer,String> e:ent)
     {
       System.out.println(e.getKey()+" : "+e.getValue());
     }
  }
}

Output:
>javac Collection2.java

>java Collection2
{1=A, 2=B, 3=C}
Check for 3 : true
Check for D: false

Keys present in HashMap:
1
2
3

Key-value present:
1 : A
2 : B
3 : C
