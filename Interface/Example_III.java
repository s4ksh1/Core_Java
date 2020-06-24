//Write a program to create an interface having two methods division and modules. Create a class, which overrides these methods.

Code:
interface calculate 
{
    int division(int x, int y );
    int modulus(int a,int b);
}
class Main1 implements calculate
{
    public int division(int x,int y)
    {
        return(x/y);
    }
    public int modulus(int a, int b)
    {
        return(a%b);
    }
    public static void main(String[]args)
    {
        Main1 t1=new Main1();
        System.out.println(t1.division(53,2));
        System.out.println(t1.modulus(53,2));
    }
}


Output:
javac Main1.java

java Main1

26
1
