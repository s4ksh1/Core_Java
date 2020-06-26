//Write a Java code that converts float to Float converts Float to String converts String to float converts float to String converts String to Float converts Float to float.

Code:
class P11
{
  public static void main(String args[])
  {
    float f=5.6f;
    Float f1=new Float(f);
    System.out.println(" Primitive float:"+f+" \tObject Float:"+f1);

    Float f2 = new Float(8.238f);      
    String s1 = f2.toString();
    System.out.println(" Float object: "+f2+" \tstring: "+s1);

    String s2="89.9";  
    float f3=Float.parseFloat("89.9"); 
    System.out.println(" string: "+s2+" \tfloat: "+f3);

    float f4= 4.56f;
    String s3 = String.valueOf(f4);
    System.out.println(" float: "+f4+" \tstring: "+s3);

    String s4="84.54";
    Float num = new Float(s4).floatValue();
    System.out.println(" string: "+s4+" \t Float object: "+num);

    float f5=342.56f;
    Float f6=new Float(f5);
    System.out.println("float: "+f5+" Float object: "+f6);
  }
}


Output:
>javac P11.java
>java P11

Primitive float:5.6    Object Float:5.6
Float object: 8.238    string: 8.238
string: 89.9   float: 89.9
float: 4.56    string: 4.56
string: 84.54   Float object: 84.54
float: 342.56 Float object: 342.56
