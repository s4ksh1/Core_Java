// Encapsulation is data hiding or data binding

class Student
{
  private int rollno=10;        // making variables private
  private int sapid=1234;
  String name="ram";
  public int getrollno()        // using get and set method to access private variables
  {
    return rollno;
  }
  public int getsapid()
  {
    return sapid;
  }
}
class Student1 extends Student
{
  String fathername="raj";
  public static void main(String[] args)
  {
    Student1 s1 = new Student1();
    System.out.println(s1.fathername);
    System.out.println(s1.getrollno());
  }
}

Output:
raj
10
