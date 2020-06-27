//Write a program for generating 2 threads, one for printing even numbers and the other for printing odd numbers.

Code:
class MyThread1 extends Thread {
    public void run(){
        System.out.println("\nPrinting even numbers");
        for(int i=0;i<=10;i+=2) {
            System.out.println("EVEN" +" "+ i);
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        System.out.println("\nPrinting odd numbers");
        for(int i=1;i<=10;i+=2) {
           System.out.println("ODD" + " "+ i);
        }
    }  
 }
 public class ThreadEx2 {
    public static void main(String[] args) {
       MyThread1 t1= new MyThread1();
	   t1.run();
	   MyThread2 t2= new MyThread2();
	   t2.run();
    }
}


Output:
>javac ThreadEx2.java

>java ThreadEx2

Printing even numbers
EVEN 0
EVEN 2
EVEN 4
EVEN 6
EVEN 8
EVEN 10

Printing odd numbers
ODD 1
ODD 3
ODD 5
ODD 7
ODD 9
