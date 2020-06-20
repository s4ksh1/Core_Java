import java.util.Scanner;
class Fibo
{
  public static void main(String[] args)
  {
    System.out.println("Enter tow numbers from where to start the fibonnaci series");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.print(a + " ");
    System.out.print(b + " ");
    for(int i=0; i<10;i++)
    {
      int c=a+b;
      System.out.print(c + " ");
      a=b;
      b=c;
    }
  }
}

Output:
javac Fibo.java
java Fibo
1
2
1 2 3 5 8 13 21 34 55 89 144 233     //result
