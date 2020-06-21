import java.util.Scanner;
class Add
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = a+b;
    System.out.println("sum:"+ sum);
  }
}

Output:
javac Add.java
java Add
4
5
sum: 9
