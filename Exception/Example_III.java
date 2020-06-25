//Create an exception class, which throws an exception if operand is nonnumeric in calculating modules. (Use command line arguments).

Code:
import java.io.*;
import java.util.*;
class P3
{
 public static void main(String args[])
 {
   int i,j;
  float add,sub,mul,div;
  System.out.println("Enter two Operands:");
  Scanner in=new Scanner(System.in);
  try
  {
    i=in.nextInt();
    j=in.nextInt();
    add=i+j;
    sub=i-j;
    mul=i*j;
    div=i/j;
    System.out.println("Addition ="+add);
    System.out.println("Subtraction ="+sub);
    System.out.println("Multiplication ="+mul);
    System.out.println("Division ="+div);
  }

  catch(InputMismatchException e)
  {
    System.out.println("Non numeric value is entered, exception occured. Exception caught... ");
  }
 }
}

Output:
>javac P3.java

>java P3
Enter two Operands:
5
e
Non numeric value is entered, exception occured. Exception caught...
