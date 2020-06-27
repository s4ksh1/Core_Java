//Write a program to launch 10 threads. Each thread increments a counter variable. Run the program with synchronization.

Code:
public class ThreadEx3
{
   static Thread[] threads = new Thread[10];
    public static void main(String[] args)
    {
        Counter c = new Counter();
        for(int i=0;i<10;i++)
        {
            threads[i] = new Thread(c);
            threads[i].start();
        }
 }
}
 class Counter implements Runnable {
    int x=1;
    public synchronized void run() {
     System.out.println(x++);
    }
}

Output:
javac ThreadEx3.java

java ThreadEx3
1
2
3
4
5
6
7
8
9
10
