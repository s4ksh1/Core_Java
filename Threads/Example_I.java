//Write a program to implement the concept of threading by extending Thread Class and Runnable interface.

Code:
class Thread1 extends Thread
{  
  public void run()
  {  
    System.out.println("Extends Thread");  
  }  
 public static void main(String args[]){  
 Thread1 t=new Thread1();  
 t.start();  
 }  
}
class Thread2 implements Runnable
{
  public void run()
  {
    System.out.println("Implements Runnable");
  }
}

public class ThreadANDRunnable
{
  public static void main(String args[])
  {
    Thread1 t1=new Thread1();  
    t1.start();
    
    Thread2 obj=new Thread2();
    Thread t2=new Thread(obj);
    t2.start();
  }
}


Output:
javac ThreadANDRunnable.java

java ThreadANDRunnable
Extends Thread
Implements Runnable
