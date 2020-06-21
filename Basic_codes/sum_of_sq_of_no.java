import java.util.*;
class Squar
{
  public static void main(String[] args)
  {
    int sum=0;
    int arr[]=new int[50];
    System.out.println("Enter any 10 numbers");
    Scanner sc = new Scanner(System.in);
    for(int i=0; i<10;i++)
    {
      arr[i] = sc.nextInt();
      int a= arr[i]*arr[i];
      sum=sum+a;
    }
      System.out.println("Sum is :"+" " +sum);
  }
}

Output:
javac Squar.java
java Squar
Enter any 10 numbers
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
Sum is : 385
