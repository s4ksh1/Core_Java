//Write a program to create interface A, in this interface we have two method meth1 and meth2. Implements this interface in another class named MyClass.

interface A
{
  void  meth1();
  void meth2();
}
class Myclass implements A
{
    public void meth1()
    {
        System.out.println("Implemented method1 of the interface A");
    }
    public void meth2()
    {
        System.out.println("Implemented method2 of the interface A");
    }
    public static void main(String [] args)
    {
        Myclass obj=new Myclass();
        obj.meth1();
        obj.meth2();
    }
}


Output:
javac Myclass.java

java Myclass

Implemented method1 of the interface A
Implemented method2 of the interface A

