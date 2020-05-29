class Even extends Thread
{
  public void run()
  {
    for(int i=0;i<20;i++)
    {
      if(i%2==0)
      {
        System.out.print(i+" ");
      }
    }
  }
}
class Odd extends Thread
{
  public void run()
  {
    for(int i=0;i<20;i++)
    {
      if(i%2==1)
      {
        System.out.print(i+" ");
      }
    } 
  }
}
class Test
{
  public static void main(String[] args)
  {
    Even e = new Even();
    Odd o = new Odd();
    e.start();
    o.start();
  }
}

Output:
1 3 0 5 2 7 4 9 6 11 8 13 10 15 12 17 14 19 16 18   // inconsistent output because threads are not synchronized.
