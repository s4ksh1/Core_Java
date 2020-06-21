class Example extends Thread
{
  public void run()
  {
    try
    {
      Example.sleep(1000); 
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
    for(int i=0;i<10;i++)
    {
       System.out.print("hi"+" ");
    }
  }
} 
class Main
{
  public static void main(String[] args)
  {
    Example e = new Example();
    for(int i=0;i<10;i++)
    {
      System.out.print("hello"+" ");
    }
    e.start();
  }
}

Output:
hello hello hello hello hello hello hello hello hello hello hi hi hi hi hi hi hi hi hi hi   //hi will start printing after completion of sleeping time of Example thread.
