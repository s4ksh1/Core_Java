//Write a program to create interface named test. In this interface the member function is square. Implement this interface in arithmetic class. Create one new class called 
//ToTestInt. In this class use the object of arithmetic class.

  interface test 
{
    int square();
}
class arithemetic implements test
{
    int b;
    arithemetic(int x)
    {
        b=x;
    }
    public int square()
    {
        return(b*b);
        
        Output:
        javac Test3.java

E:\Java codes>java Test3
100
    }
}
public class ToTestInt
{
    public static void main (String[] args)
    {
        arithemetic a1=new arithemetic(10);
        System.out.println(a1.square());
    }
}


Output:
javac Test3.java

java Test3
100
