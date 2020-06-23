//Consider the trunk calls of a telephone exchange. A trunk call can be ordinary, urgent or lightning. The charges depend on the duration and the type of the call. Write a 
//program using the concept of polymorphism in Java to calculate the charges.

class TrunkCalls
{
  public static void main(String args[])
   { 
     String type;
     type=args[0];
  
     ordinary o1=new ordinary();
     urgent o2=new urgent();
     lightning o3=new lightning();
     
     if(type.equals("ordinary"))
      {
        o1.call(20);
      }
    else if(type.equals("urgent"))
      {
        o2.call(15);
      }
    else
     {
      o3.call(10);
     }
}
}

class ordinary extends TrunkCalls
{
 void call(int d)
  { 
    int c=2;
    System.out.println("This is  an ordinary call");
    System.out.println("Charges are:"+ (c*d));
    
  }
}
class urgent extends ordinary
{
 void call(int d)
 {
   int c=3;
    System.out.println("This is an urgent call");
    System.out.println("Charges are:"+ (c*d));
 }
}
class lightning extends urgent
{
 void call(int d)
 {
    int c=4;
    System.out.println("This is lightning call");
    System.out.println("Charges are:"+ (c*d));
 }
}


Output:
javac TrunkCalls.java

java TrunkCalls Ordinary

This is lightning call
Charges are:40
